package GarbageCardGame;

/**
 * This tester driver class is to test the deck/card class
 * This is not be included in the final program
 * 
 * Author: Cheng Lian 
 * Created: March 22, 2021 
 * Last updated: March 22, 2021
 */

public class DeckTest {
    public static void main(String[] args) {
        Deck d1 = new Deck();
        d1.createDeck();
        System.out.println("Deck has the following cards: " + d1.showCard());
    }
}
