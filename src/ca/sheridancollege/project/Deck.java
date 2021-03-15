
package ca.sheridancollege.project;

/**
 *
 * @author Cheng Lian
 */
public class Deck {
    //datafields
    private char suit;
    private int value;
    
    //no-arg constructor
    private Deck(){
        suit = ' ';
        value = 0;
    }
    
    //2 arg constructor
    public Deck(char newSuit, int newValue){
        
    }
    
    // toString method to return suit name 
    public String toString(){
        return "";
    }
    
    // method to get suit name
    public String getSuit(){
        return " ";
    }
    
    //method to get card value as string ie: jack/queen/king
    public String getValueString(){
        return " ";
    } 
    
    //method to get card value as numbers ie: 11/12/13
    public int getValue(){
        return 0;
    }
    
    //method to compare suits
    public boolean compareSuit(Deck deck){
        return true;
    }
    
    //method to compare value
        public boolean compareValue(Deck deck){
        return true;
    }
    
    
    
    
}
