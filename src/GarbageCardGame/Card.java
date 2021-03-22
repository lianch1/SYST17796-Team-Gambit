package GarbageCardGame;

/**
 * This class allows the creation of a card as well as ways to manipulate it
 * 
 * author: Cheng Lian 
 * Created: March 12, 2021 
 * Last updated: March 22, 2021
 */

public final class Card {
    
    private Values values;
    private Suits suits;
    private boolean isFaceUp;

// Card Constructor
    public Card(Values values, Suits suits) {
        this.values = values;
        this.suits = suits;
        isFaceUp = false;
    }
    
// getters and setters
    public int getValueNumber() {
        return values.getValueNumber();
    }
    
    public String getValueString(){
        return values.getValueString();
    }

    public String getSuit() {
        return suits.printSuit();
    }
//toString method

    public String toString() {
        String txt = "";
        if (isFaceUp) {
            txt += "\n" + values.getValueString() + " of " + suits.printSuit();
            return txt;
        } else {
            txt = "Card is Faced down";
        }
        return txt;
    }
    
//flip card method    
    public void flipCard(){
        isFaceUp = !isFaceUp;
    }
       
    
}
