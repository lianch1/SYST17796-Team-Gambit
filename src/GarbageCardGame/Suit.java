package GarbageCardGame;

/**
 An enum class that models the suits for playing card Objects. 
 * It has a suit (clubs, hearts, spades, diamonds).
 *
 * @author Cheng Lian April 10, 2021
 */
public enum Suit {
    
        //enum datafield: suits
        CLUBS("Clubs"), 
        DIAMONDS("Diamonds"), 
        HEARTS("Hearts"), 
        SPADES("Spades");
        
        /**
         * This field variable represent a string suit
         */
        private final String suitString;
        
        /**
         * Default constructor
         * @param suitString 
         */
        private Suit(String suitString){
            this.suitString = suitString;
    }
           
        /**
         * @return the suit
         */
        public String printSuit(){
            return suitString;
        }
}