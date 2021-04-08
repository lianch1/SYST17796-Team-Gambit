/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.List;

public class Garbage {
    
    
    //assuming there is a discardPile.
    ArrayList<Card> discardPile = new ArrayList();
    
    public String displayHelp(){
        String help = "Garbage is an easy card game to learn. According to Gather Together Games, “Garbage is a game that can be enjoyed by two players with one deck of card. Any additional player more than two will be required to use more decks”.\n" +
                      "To start the game, ten faced down cards are given to each player. The reminding are placed in the middle. “The objective of this game is to be the first player to line up the cards in a sequence from Ace to 10”.\n" +
                      "The player going first will be randomly selected in our program by drawing the top card from the middle deck. In the first round, each player has ten usable card spots, and they are numbered from one to ten. When a player draws a card, the card is placed in the corresponding spot with the same value. The next player can choose to do the same either by taking the top discard or drawing the card from top of the deck.\n" +
                      "Important to note, the Kings are wildcards that can be used to fill up any spot. The Jacks and Queens are garbage, meaning they have no use but to be discarded when picked up. Aces can only be used to fill the first spot. Eventually, a player will have flipped all their cards going from 1 to 10. Congratulations! That player is the winner.";
        return help;
    }

    
    public String authenticatePlacement(boolean[] sequence, int spot){
        if (sequence[spot+1] == true)
            return "This spot has already been filled. You cannot fill the same spot twice.";
        else
            return "This spot is empty. You will fill this spot up.";
    }
    
    public void discardCard(Card card){
        discardPile.add(0, card);
    }
    
    
    //This method will display all the cards in the discard pile.
    public String displayDiscardPile(){
        return discardPile.toString();
    }
    
    public boolean checkSequence(boolean[] sequence){
        //the sequence will always have 10 spots to be checked (ace ~ 10)
        int sequenceNum = 0;
        for(int i = 0; i < 10; i++){
            if (sequence[i] == true)
                sequenceNum += 1;
        }
        // checks if the number of spots filled(true) adds up to 10.
        // if it does add up to 10, that means that player has won.
        if (sequenceNum == 10)
            return true;
        // if not, return false (nobody won),
        else
            return false;
    }
    
    
    public String declareWinner(Player player){
        String winner = "declare winner";
        return winner;
    }
    
    public boolean replayorEndGame(){
        
    }
}