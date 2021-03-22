package GarbageCardGame;

/**
 * This class allows the creation of a card as well as ways to manipulate it
 * 
 * author: Cheng Lian 
 * Created: March 12, 2021 
 * Last updated: March 22, 2021
 */

public class Card {
    
    private Value value;
    private Suit suit;
    private boolean isFaceUp;

// Card Constructor
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
        isFaceUp = true;
    }
    
// getters and setters
    public int getValueNumber() {
        return value.getValueNumber();
    }
    
    public String getValueString(){
        return value.getValueString();
    }

    public String getSuit() {
        return suit.printSuit();
    }
//toString method
    public String toString() {
        String txt = "";
        if (isFaceUp){
            txt += "\n" + value.getValueString() + " of " + suit.printSuit();
            return txt;
        } else {
            txt = "\nCard is Faced down ";
        }
        return txt;
    }
    
//flip card method    
    public void flipCard(){
        isFaceUp = !isFaceUp;
    }
       
    
}