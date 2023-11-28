package us.mattgreen.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * This is a utility class consisting of static methods to determine if a hand matches a specific
 * @author  Dr. Green
 * @version 1.0
 */
public class Game {
    /**
     * @param hand An Array of Cards
     * @return True if there are two of a kind and false if not
     */
    public static boolean twoOfAKind(ArrayList<Card> hand) {
        Collections.sort(hand, Comparator.comparing(Card::getFace));

        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).getFace() == hand.get(i + 1).getFace()) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param hand An Array of Cards
     * @return True if there are three of a kind and false if not
     */

    public static boolean threeOfAKind(ArrayList<Card> hand) {
        Collections.sort(hand, Comparator.comparing(Card::getFace));

        for (int i = 0; i < hand.size() - 2; i++) {
            if (hand.get(i).getFace() == hand.get(i + 1).getFace() && hand.get(i + 1).getFace() == hand.get(i + 2).getFace()) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param hand An Array of Cards
     * @return true if all cards in hand have matching suit and  return false if suits don't match
     */
    public static boolean flush(ArrayList<Card> hand) {
        Collections.sort(hand, Comparator.comparing(Card::getSuit));

        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).getSuit() != hand.get(i + 1).getSuit()) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param hand An Array of Cards
     * @return hasThreeOfAKind && hasPair (equals a full house) if there are three of a kind, and a pair (2 of a kind) found in hand of 5 cards and false if combination not
     */
    public static boolean fullHouse(ArrayList<Card> hand) {
        Collections.sort(hand, Comparator.comparing(Card::getFace));

        boolean hasThreeOfAKind = false;
        boolean hasPair = false;

        for (int i = 0; i < hand.size() - 2; i++) {
            if (hand.get(i).getFace() == hand.get(i + 1).getFace() && hand.get(i + 1).getFace() == hand.get(i + 2).getFace()) {
                hasThreeOfAKind = true;
            } else if (i < hand.size() - 3 && hand.get(i).getFace() == hand.get(i + 1).getFace() && hand.get(i + 2).getFace() == hand.get(i + 3).getFace()) {
                hasPair = true;
            }
        }
        return hasThreeOfAKind && hasPair;
    }

    /**
     * @param hand An Array of Cards
     * @return True if there are four of a kind and false if not
     */
    public static boolean fourOfAKind(ArrayList<Card> hand) {
        Collections.sort(hand, Comparator.comparing(Card::getFace));

        for (int i = 0; i < hand.size() - 3; i++) {
            if (hand.get(i).getFace() == hand.get(i + 1).getFace()
                    && hand.get(i + 1).getFace() == hand.get(i + 2).getFace()
                    && hand.get(i + 2).getFace() == hand.get(i + 3).getFace()) {
                return true;
            }
        }
        return false;
    }

}
