package GarbageCardGame;

/**
 * 
 * @author Cheng Lian April 10, 2021
 */
public enum Suit {
        //enum datafield: suits
        CLUBS("Clubs"), 
        DIAMONDS("Diamonds"), 
        HEARTS("Hearts"), 
        SPADES("Spades");
        
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