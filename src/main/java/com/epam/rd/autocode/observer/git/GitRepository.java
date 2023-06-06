package com.epam.rd.autocode.observer.git;

import java.util.*;
import java.util.stream.Collectors;

public class GitRepository implements Repository{
    private final List<WebHook> webHooks;
    private final Map<String, String> branchMerges;
    public GitRepository() {
        webHooks = new ArrayList<>();
        branchMerges = new HashMap<>();
    }

    @Override
    public void addWebHook(WebHook webHook) {
        webHooks.add(webHook);
    }

    @Override
    public Commit commit(String branch, String author, String[] changes) {
        Commit commit = new Commit(author, changes);
        Event event = new Event(Event.Type.COMMIT, branch, List.of(commit));
        notifyWebHooks(event);
        return commit;
    }

    @Override
    public void merge(String sourceBranch, String targetBranch) {
        if (Objects.equals(branchMerges.get(sourceBranch), targetBranch)) {
            return;
        }
        if (!webHooks.isEmpty()) {
            branchMerges.put(sourceBranch, targetBranch);
        }

        List<Commit> commits = webHooks.stream()
                .filter(webHook -> webHook.branch().equals(sourceBranch) && webHook.type() == Event.Type.COMMIT)
                .flatMap(webHook -> webHook.caughtEvents().stream())
                .flatMap(event -> event.commits().stream())
                .collect(Collectors.toList());

        Event event = new Event(Event.Type.MERGE, targetBranch, commits);
        notifyWebHooks(event);

    }

    private void notifyWebHooks(Event event) {
        for (WebHook webHook : webHooks) {
            if (webHook.type() == event.type() && webHook.branch().equals(event.branch())) {
                webHook.onEvent(event);
            }
        }
    }

}
