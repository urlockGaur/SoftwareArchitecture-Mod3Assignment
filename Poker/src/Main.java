import com.sun.jdi.Value;
import us.mattgreen.poker.Card;
import us.mattgreen.poker.Face;
import us.mattgreen.poker.PokerProgram;
import us.mattgreen.poker.Suit;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Card[] hand = {
                new Card(Face.ACE, Suit.HEARTS, 14),
                new Card(Face.ACE, Suit.DIAMONDS, 14),
                new Card(Face.ACE, Suit.CLUBS, 14),
                new Card(Face.KING, Suit.SPADES, 13),
                new Card(Face.KING, Suit.HEARTS, 13)
        };

        PokerProgram pokerProgram = new PokerProgram(hand);
        pokerProgram.handRanking();
    }
}
