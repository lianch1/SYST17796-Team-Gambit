/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCardGame;
import java.util.*;
import java.util.Random;


public class DiscardDeck {

    private ArrayList<Card> discardDeck;
    
    //constructor
    public DiscardDeck(){
        discardDeck = new ArrayList<Card>(52);
    }
    
    
    //
    
    //method to add a card on top of discard deck (so it could be used in future)
    // added to index 0, whatever card that was initially in index 0 is now pushed to index 1.
    public void addDisacard(Card card){
        discardDeck.add(0, card);
    }
    
    
    //show card
    public String showCard(){
        String txt = "";
        for (Card showCard: discardDeck){
            txt += showCard.toString();                       
        }
        return txt;
    }
    
}
