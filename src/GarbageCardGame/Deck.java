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
    public void swapCard(int index1, int index2, ArrayList<Card> deck){
        Card placeholder;
        
        placeholder = deck.get(index1);
        deck.set(index1, deck.get(index2));
        deck.set(index2, placeholder);                
    }
            
    //shuffle a deck of cards
    public void shuffle(ArrayList<Card> deck) {
        Random randomNumber = new Random();
        for (int i = 0; i < deck.size(); i++){
            for (int j = 0; j < deck.size(); j++){
                swapCard(i, randomNumber.nextInt(52), deck);
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
    
}