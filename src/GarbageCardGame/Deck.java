package GarbageCardGame;
import java.util.*;
import java.util.Random;

/**
 * This class contains allows the creation and manipulation of the deck
 * 
 * author: Cheng Lian 
 * Created: March 12, 2021 
 * Last updated: March 21, 2021
 */

public class Deck {
       
    //create a deck of cards     
    Deck(ArrayList<Card> Deck) {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Value value : Card.Value.values()) {
                Deck.add(new Card(value, suit));
                
            }
        }
    }    

    //method to swap card positions in the deck
    public void swapCard(int index1, int index2, ArrayList<Card> Deck){
        Card placeholder;
        
        placeholder = Deck.get(index1);
        Deck.set(index1, Deck.get(index2));
        Deck.set(index2, placeholder);                
    }
            
    //shuffle a deck of cards
    public void shuffle(ArrayList<Card> Deck) {
        Random randomNumber = new Random();
        for (int i = 0; i < Deck.size(); i++){
            for (int j = 0; j < Deck.size(); j++){
                swapCard(i, randomNumber.nextInt(52), Deck);
            }
        }
    }
    
}