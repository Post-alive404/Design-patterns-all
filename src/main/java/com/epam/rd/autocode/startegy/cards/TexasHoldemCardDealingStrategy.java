package com.epam.rd.autocode.startegy.cards;

import java.util.*;

public class TexasHoldemCardDealingStrategy implements CardDealingStrategy{
    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        Map<String, List<Card>> stacks = new HashMap<>();

        for (int round = 0; round < 2; round++) {
            for (int i = 1; i <= players; i++) {
                String playerName = "Player " + i;
                List<Card> playerStack = stacks.computeIfAbsent(playerName, k -> new ArrayList<>());
                playerStack.add(deck.dealCard());
            }
        }

        List<Card> communityStack = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            communityStack.add(deck.dealCard());
        }
        stacks.put("Community", communityStack);

        stacks.put("Remaining", deck.restCards());

        return stacks;
    }
}
