package us.mattgreen.poker;

import java.util.ArrayList;

public class PokerProgram {

    private ArrayList<Card> hand;

    public PokerProgram(Card[] cards) {
        if (cards.length != 5) {
            throw new IllegalArgumentException("Poker hands must contain 5 cards.");
        }
        hand = new ArrayList<>();
        for (Card card : cards) {
            hand.add(card);
        }
    }


    public void handRanking() {
        if (Game.fourOfAKind(hand)) {
            System.out.println("Four of a Kind! Epic!");
        }
        else if (Game.fullHouse(hand)) {
            System.out.println("Full House! Groovy!");
        }
        else if (Game.flush(hand)) {
            System.out.println("Nice Flush!");
        }
        else if (Game.threeOfAKind(hand)) {
            System.out.println("Three of a Kind!");
        }
        else if (Game.twoOfAKind(hand)) {
            System.out.println("Two of a Kind!");
        }
    }
}
