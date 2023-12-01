package us.mattgreen.poker;

/**
 * This is the Card class. It contains private fields for the card, a constructor to create a card, and the cards value
 * @author  Dr. Green
 * @version 1.0
 */
public class Card {
    /**
     * @param face - the card face - Ace, King, Quen, Jack, etc
     * @param suit - the suit of the card - Clubs, Spades, Hearts, Diamonds
     * @param value - the value of the card - Ace = 14, King = 13, Queen = 12, etc
     */
    private Face face;
    private Suit suit;
    private int value;


    /**
     * @constructor - creates the card
     *
     */
    public Card(Face face, Suit suit, int value) {
        this.face = face;
        this.suit = suit;
        this.value = value;
    }

    /**
     * @getters - get the card face, value, suit
     * @return - returns the card face, suit, and value
     */
    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
