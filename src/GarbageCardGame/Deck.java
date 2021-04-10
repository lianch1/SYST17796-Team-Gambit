/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCardGame;
import java.util.*;
import java.util.Random;

/**
 * This class allows the creation and manipulation of the deck
 * 
 * author: Cheng Lian 
 * Created: March 12, 2021 
 * Last updated: March 22, 2021
 */

// we are going to need to make 2 decks (one normal deck, and one for discard)
public class Deck {
    
    private ArrayList<Card> deck;
    
    //constructor
    public Deck(){
        deck = new ArrayList<Card>();
    }
    
    //create a deck of cards
    public void createDeck(){
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                deck.add(new Card(value, suit));                
            }
        }    
    }
    
    //
    
    //method to swap card positions in the deck
    public void swapCard(int index1, int index2){
        Card placeholder;
        
        placeholder = deck.get(index1);
        deck.set(index1, deck.get(index2));
        deck.set(index2, placeholder);                
    }
            
    //shuffle a deck of cards
    public void shuffle() {
        Random randomNumber = new Random();
        for (int i = 0; i < deck.size(); i++){
            for (int j = 0; j < deck.size(); j++){
                swapCard(i, randomNumber.nextInt(52));
            }
        }
    }
    
    //show card
    public String showCard(){
        String txt = "";
        for (Card showCard: deck){
            txt += showCard.toString();                       
        }
        return txt;
    }
    
    
    //draw card
    //drawn card is faced up
    public Card drawCard(){
        Card drawnCard = deck.get(0);        
        deck.remove(0);
        //System.out.println(drawnCard.toString());
        return drawnCard;
    }
    

    
    
    // need to add sequence filler for each player
    // or we couyld simply just get rid of 10 cards from the deck for the sequence and make the sequence the boolean list (I prefer this).

    
    
    
    // get method
    Card get(int i) {
        return deck.get(i);
    }
}
