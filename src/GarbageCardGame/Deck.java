package GarbageCardGame;

import java.util.*;

/**
 * This class allows the creation and manipulation of the deck which contains 
 * 52 cards and no jokers. The cards are stored in the an arraylist.
 *
 * @author: Cheng Lian Created: March 12, 2021 Last updated: March 22, 2021
 */
public class Deck {

    private ArrayList<Card> deck;

    /**
     * Default Deck constructor
     */
    public Deck() {
        deck = new ArrayList<Card>();
    }

    /**
     * A method to populate the deck of 52 cards
     */
    public void createDeck() {
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                deck.add(new Card(value, suit));
            }
        }
    }

    /**
     * A method to swap card positions of two cards in the deck
     *
     * @param index1 is used to find first card
     * @param index2 is used to find second card
     */
    public void swapCard(int index1, int index2) {
        Card placeholder;

        placeholder = deck.get(index1);
        deck.set(index1, deck.get(index2));
        deck.set(index2, placeholder);
    }

    /**
     * A method to shuffle a deck of cards
     */
    public void shuffle() {
        Random randomNumber = new Random();
        for (int i = 0; i < deck.size(); i++) {
            for (int j = 0; j < deck.size(); j++) {
                swapCard(i, randomNumber.nextInt(52));
            }
        }
    }

    /**
     * A method to show card to player
     *
     * @return the txt
     */
    public String showCard() {
        String txt = "";
        for (Card showCard : deck) {
            txt += showCard.toString();
        }
        return txt;
    }

    /**
     * A method to draw a card, the drawn card is faced up
     *
     * @return the drawnCard
     */
    public Card drawCard() {
        Card drawnCard = deck.get(0);
        deck.remove(0);
        //System.out.println(drawnCard.toString());
        return drawnCard;
    }

    /**
     * A method to check how many cards are left in the deck
     *
     * @return the deck size
     */
    public int getSize() {
        return deck.size();
    }

}
