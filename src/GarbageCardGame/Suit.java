/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCardGame;

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