package GarbageCardGame;
/**
 * @author Fei Wei Mar,31 2021
 */
import java.util.ArrayList;
import javax.swing.*;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye
 * @author Fei Wei, Mar,29 2021
 */
public abstract class Player {

    //Fields
    private final String playerID; //the unique ID for this player
    private int score;
    public static ArrayList<String> playerName = new ArrayList<String>();

    /**
     * A constructor that sets the player's ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        playerID = name;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param updateSore the score to set
     */
    public void setScore(int updateSore) {
        this.score = updateSore;
    }

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return this.playerID;
    }

    //Methods
    /**
     * The method to be instantiated when you subclass the Player class with
     * your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();

    /**
     *The method to check whether a playerID is existed
     * @param playerID the playerID to check
     * @return if playerID is duplicated
     */
    public static boolean isDuplicate(String playerID) {

        for (int i = 0; i < playerName.size(); i++) {
            if (playerID.equals(playerName.get(i))) {
                return true;
            }
        } 
        return false;
    }

    /**
     * The method to check whether a playerID is validated
     *
     * @param playerID the playerID to check
     * @return if playerID is validated
     */
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

    /**
     * The method is to add validated player name into ArrayList playerName
     * 
     * @param playerID 
     */
    public void addName(String playerID) {
        playerName.add(playerID);
    }

}// End of the class

//Popup welcome window
// JOptionPane.showMessageDialog(null, "Welcome to Garbage Game, " + playerID + "!", "Welcome", JOptionPane.PLAIN_MESSAGE);
//System.out.println("Welcome to Garbage Game, " + this.playerID + "!");
