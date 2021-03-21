package GarbageCardGame;

/**
 * This class contains the value and suits of a deck of cards
 * 
 * author: Cheng Lian 
 * Created: March 12, 2021 
 * Last updated: March 21, 2021
 */

public final class Card {
    
    //enum datafield: suits
    private enum Suit {
        CLUBS, 
        DIAMONDS, 
        HEARTS, 
        SPADES
    }
    
    //enum datafield: suits
    private enum Value {
        ACE,
        DEUCE, 
        THREE, 
        FOUR, 
        FIVE, 
        SIX, 
        SEVEN, 
        EIGHT, 
        NINE, 
        TEN, 
        JACK, 
        QUEEN, 
        KING
    }

    final Value value;
    final Suit suit;

// Card Constructor
    private Card(final Value value, final Suit suit) {
        this.value = value;
        this.suit = suit;
    }

// toString method
    @Override
    public String toString() {
        return String.format("%s of %s", value, suit);
    }
}
