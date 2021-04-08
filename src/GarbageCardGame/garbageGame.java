/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCardGame;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Jaeyoung
 */
public class garbageGame {
    private ArrayList<Player> playerName = new ArrayList<Player>();
    private int currentPlayer;
    private Deck deck;
    private DiscardDeck discardDeck;
    private int round = 1;
    private boolean victory = false;
    private Player player1;
    private Player player2;
    
    
     
    public garbageGame(Player p1, Player p2){
        this.player1 = p1;
        this.player2 = p2;
    }
    
    
    public void initializeGame(){
        this.deck = new Deck();
        this.deck.createDeck();
        this.deck.shuffle();
        sequenceFiller(this.deck);
        discardDeck = new DiscardDeck();
        turn();
    }
    
    
    public String declareWinner(Player p){
    String winner = "After checking each player's sequence.......\n" + p.getPlayerID() + " has won the game!!";
    return winner;
    }

    // - 20 cards from top of the deck (10 for p1 and 10 for p2)
    public void sequenceFiller(Deck deck){
        for (int i = 0; i < 20; i++){
           deck.remove(0);
        }
    }
    

    public void turn(){
        while(victory == false){
            player1.setHand(deck.get(0));
            System.out.println(player1.getPlayerID() + " has picked up " + player1.getHand().toString()+ "." + "\nWhat would you like to do? \nClick [1]Replace OR [2]Discard.");
            Scanner input = new Scanner(System.in);
            decision(player1, input.nextInt());
            deck.remove(0);
            System.out.println("Next player's turn starts now.");
            player2.setHand(deck.get(0));
            System.out.println(player2.getPlayerID() + " has picked up " + player2.getHand().toString()+ "." + "\nWhat would you like to do? \nClick [1]Replace OR [2]Discard.");
            decision(player1, input.nextInt());
            System.out.println("Round " + round + " is over.");
            this.round += 1;
            if(checkSequence(player1, player2) == 3){
                System.out.println("No one has won yet.");
                continue;
            }
            else if(checkSequence(player1, player2) == 1){
                System.out.println(declareWinner(player1));
                victory = true;
            }
            else if(checkSequence(player1, player2) ==2){
                System.out.println(declareWinner(player2));
                victory = true;
            }
        }
    }
    
    public int checkSequence(Player p1, Player p2){
    //the sequence will always have 10 spots to be checked (ace ~ 10)
    int p1Win = 0;
    int p2Win = 0;
    for(int i = 0; i < 10; i++){
        if (p1.getBoolSequence()[i] == true)
            p1Win += 1;
    }
    // checks if the number of spots filled(true) adds up to 10.
    // if it does add up to 10, that means that player has won.
    // player 1 won
    if (p1Win == 10)
        return 1;
    // player 2 won
    else if (p2Win == 10)
        return 2;
    // if not, return false (nobody won),
    else
        return 3;
    }
    
    
    public void authenticatePlacement(Player p, int spot){
    if (p.getBoolSequence()[spot-1] == true)
        throw new IllegalArgumentException("This spot has already been filled. You cannot fill the same spot twice.");
    else
        System.out.println("You have decided to fill spot # " + spot);
        p.getBoolSequence()[spot-1] = true;
    }
    
    public void decision(Player p, int i){
        if(i == 1)
            replace(p);
        else if(i == 2)
            discard(p);
    }
    
    public void replace(Player p){
        int value = p.getHand().getValueNumber();
        authenticatePlacement(p, value);
        System.out.println("You have decided to fill up the position numbered " + value + ".\nNow your sequence looks like this...");
        for(boolean check : p.getBoolSequence())
            System.out.println(check);
        p.setHand(null);
    }
    
    public void discard(Player p){
        discardDeck.addDisacard(p.getHand());
        p.setHand(null);
    }
    
}
