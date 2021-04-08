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
        d1.shuffle();
        System.out.println(d1.toString());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Deck has the following cards: " + d1.showCard());
        System.out.println(displayHelp());
    }
    
    
    
    
    
    
    
    
    
    public static String displayHelp(){
        String help = "Garbage is an easy card game to learn. According to Gather Together Games, “Garbage is a game that can be enjoyed by two players with one deck of card. Any additional player more than two will be required to use more decks”.\n" +
                      "To start the game, ten faced down cards are given to each player. The reminding are placed in the middle. “The objective of this game is to be the first player to line up the cards in a sequence from Ace to 10”.\n" +
                      "The player going first will be randomly selected in our program by drawing the top card from the middle deck. In the first round, each player has ten usable card spots, and they are numbered from one to ten. When a player draws a card, the card is placed in the corresponding spot with the same value. The next player can choose to do the same either by taking the top discard or drawing the card from top of the deck.\n" +
                      "Important to note, the Kings are wildcards that can be used to fill up any spot. The Jacks and Queens are garbage, meaning they have no use but to be discarded when picked up. Aces can only be used to fill the first spot. Eventually, a player will have flipped all their cards going from 1 to 10. Congratulations! That player is the winner.";
        return help;
    }
    
    
}
