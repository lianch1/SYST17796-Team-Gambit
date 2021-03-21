package GarbageCardGame;


/**
 * This class contains the value and suits of a deck of cards
 * 
 * author: Cheng Lian 
 * Created: March 12, 2021 
 * Last updated: March 21, 2021
 */

public abstract class Card {
    
    //enum datafield: suits
    public enum Suit {
        CLUBS, 
        DIAMONDS, 
        HEARTS, 
        SPADES;
    }
    
    //enum datafield: suits
    public enum Value {
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
        KING;
    }

    final Value value;
    final Suit suit;

// Card Constructor
    Card(final Value value, final Suit suit) {
        this.value = value;
        this.suit = suit;
    }

// toString method
    @Override
    public String toString() {
        return String.format("%s of %s", value, suit);
    }
    
// getters and setters
    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }
    
    
// method for retriving card value in integer type  
    public int getValueNumber(){
        
        int valueNumber = 0;
        
        switch (this.value){
            case ACE:
                valueNumber = 1;
                break;
            case DEUCE:
                valueNumber = 2;
                break;
            case THREE:
                valueNumber = 3;
                break;
            case FOUR:
                valueNumber = 4;
                break;
            case FIVE:
                valueNumber = 5;
                break;
            case SIX:
                valueNumber = 6;
                break;
            case SEVEN:
                valueNumber = 7;
                break;
            case EIGHT:
                valueNumber = 8;
                break;
            case NINE:
                valueNumber = 9;
                break;
            case TEN:
                valueNumber = 10;
                break;
            case JACK:
                valueNumber = 11;
                break;
            case QUEEN:
                valueNumber = 12;
                break;
            case KING:
                valueNumber = 13;
                break;
        }
        return valueNumber;
    }
       
    
}
