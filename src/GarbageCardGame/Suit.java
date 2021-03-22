package GarbageCardGame;

/**
 * This enumeration contains card suits
 * 
 * author: Cheng Lian 
 * Created: March 12, 2021 
 * Last updated: March 22, 2021
 */

public enum Suit {
        //enum datafield: suits
        CLUBS("Clubs"), 
        DIAMONDS("Diamonds"), 
        HEARTS("Hearts"), 
        SPADES("Clubs");
        
        private final String suitString;
        
        // Constructor
        private Suit(String suitString){
            this.suitString = suitString;
    }
        
        //Public Method
        public String printSuit(){
            return suitString;
        }
}