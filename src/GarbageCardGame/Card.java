/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCardGame;
public class Card {
    
    private Value value;
    private Suit suit;
    private boolean faceUp;

// Card Constructor
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
        faceUp = true;
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
        if (faceUp){
            txt += "\n" + value.getValueString() + " of " + suit.printSuit();
            return txt;
        } else {
            txt = "\nCard is Faced down ";
        }
        return txt;
    }
    
//flip card method    
    public void flipCard(){
        faceUp = !faceUp;
    }
}
       
    