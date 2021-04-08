/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygarbage;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Jaeyoung
 */
public class Player {
    
    private final String playerID; //unique ID
    private int score; // unique score
    //public static ArrayList<String> playerName = new ArrayList<String>(); // arrayList of playerName
    //below is for game play
    private Sequence sequence; //unique sequence (players cant share a sequence).
    //below is simply for checking who won
    private boolean[] bool_sequence = new boolean[10]; // booleans for sequence
    //TODO: has to change to arraylist becuase a player can have 1+ cards
    private Card hand;
    
    
    public Player(String name) {
        playerID = name;
    } 
    public int getScore() {
        return score;
    }
    public void setScore(int updateSore) {
        this.score = updateSore;
    }
    public String getPlayerID() {
        return this.playerID;
    }
    public Sequence getSequence(){
        return this.sequence;
    }
    public boolean[] getBoolSequence(){
        return bool_sequence;
    }
    public boolean getWhat(int i){
        return bool_sequence[i];
    }
    public Card getHand(){
        return this.hand;
    }
    public void setHand(Card draw){
        this.hand = draw;
    }
    
    
    public static boolean isDuplicate(String playerID) {

        for (int i = 0; i < playerName.size(); i++) {
            if (playerID.equals(playerName.get(i))) {
                return true;
            }
        } 
        return false;
    }
    public static boolean isValid(String playerID) {
        for (int i = 0; i < playerID.length(); i++) {
            char newName = playerID.charAt(i);
            
            if (!(Character.isDigit(newName))&&
                !(Character.isLetter(newName))) {
                return false;
            }
        }
        return true;
    }
    //public void addName(String playerID) {
    //    playerName.add(playerID);
    //}
    
    

}
