import com.sun.jdi.Value;
import us.mattgreen.poker.Card;
import us.mattgreen.poker.Face;
import us.mattgreen.poker.PokerProgram;
import us.mattgreen.poker.Suit;

import java.util.Random;
/**
 * this is the main class which creates a hand of cards for the game of poker and then ranks the hand.
 * @param hand An Array of Cards
 * @return True if there are four of a kind and false if not
 */
public class Main {
    public static void main(String[] args) {


        /**
         * @param hand An Array of Cards
         *
         */
        Card[] hand = {
                new Card(Face.ACE, Suit.HEARTS, 14),
                new Card(Face.ACE, Suit.DIAMONDS, 14),
                new Card(Face.ACE, Suit.CLUBS, 14),
                new Card(Face.KING, Suit.SPADES, 13),
                new Card(Face.KING, Suit.HEARTS, 13)
        };

        /**
         * creates a new poker program and ranks the hand of cards
         *
         */
        PokerProgram pokerProgram = new PokerProgram(hand);
        pokerProgram.handRanking();
    }
}
