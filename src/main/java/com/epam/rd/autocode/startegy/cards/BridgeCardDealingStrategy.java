package com.epam.rd.autocode.startegy.cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BridgeCardDealingStrategy implements CardDealingStrategy{
    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        Map<String, List<Card>> stacks = new HashMap<>();

        for (int round = 0; round < 13; round++) {
            for (int i = 1; i <= players; i++) {
                String playerName = "Player " + i;
                List<Card> playerStack = stacks.computeIfAbsent(playerName, k -> new ArrayList<>());
                playerStack.add(deck.dealCard());
            }
        }

        return stacks;
    }
}
