package us.mattgreen.poker.test;

import org.junit.Before;
import org.junit.Test;
import us.mattgreen.poker.Card;
import us.mattgreen.poker.Game;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static us.mattgreen.poker.Face.*;
import static us.mattgreen.poker.Suit.*;

public class GameTest {
    private ArrayList<Card> hand;

    @Before
    public void setUp() {
        hand = new ArrayList<>();
        hand.add(new Card(KING, SPADES, 13));
        hand.add(new Card(EIGHT, HEARTS, 8));
        hand.add(new Card(KING, CLUBS, 13));
        hand.add(new Card(KING, HEARTS, 13));
        hand.add(new Card(EIGHT, CLUBS, 8));
    }

    @Test
    public void twoOfAKindTest() {
        assertTrue("Two of a kind should have matched",Game.twoOfAKind(hand));
    }


    @Test
    public void threeOfAKind() {
        assertTrue("Three of a kind should have matched", Game.threeOfAKind(hand));

    }

    @Test
    public void flush() {
        assertTrue("Flush (entire hand composes of matching suit) should have matched", Game.flush(hand));
    }

    @Test
    public void fullHouse() {
        assertTrue("Full House (three of a kind and a pair) should have matched", Game.fullHouse(hand));
    }

    @Test
    public void fourOfAKind() {
        assertTrue("Four of a kind should have matched", Game.fourOfAKind(hand));
    }


}
