package GarbageCardGame;

import java.util.ArrayList;

/**
 * @author Fei Wei
 * @author Jaeyoung
 */
public class Player {

    private final String playerID; //unique ID
    private int score; // unique score
    public static ArrayList<Player> players = new ArrayList<Player>();

    public Player(String name) {
        playerID = name;
        score = 0;
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

    public void addPlayer(Player playerID) {
        players.add(playerID);
    }

    //method for finding the index value of the existing player in the array: players 
    public static int findPlayerIndex(String playerID) {
        int indexValue = -1;
        for (int i = 0; i < players.size(); i++) {
            if (playerID.equals(players.get(i))) {
                indexValue = i;
                break;
            }
        }
        return indexValue;
    }
    //method for checking if the name entered is a duplicate
    public static boolean isDuplicate(String playerID) {

        for (int i = 0; i < players.size(); i++) {
            if (playerID.equals(players.get(i))) {
                return true;
            }
        }
        return false;
    }
    //method for checking if the name entered is valid
    public static boolean isValid(String playerID) {
        for (int i = 0; i < playerID.length(); i++) {
            char newName = playerID.charAt(i);

            if (!(Character.isDigit(newName))
                    && !(Character.isLetter(newName))) {
                return false;
            }
        }
        return true;
    }

}
