package GarbageCardGame;

import java.util.ArrayList;

/**
 * A class models the player object which contains both player name and score
 * This class also contains methods that allows for manipulation of the object.
 * Players are stored in an ArrayList players.
 *
 * @author Fei Wei
 * @author Cheng Lian April 11, 2021
 */
public class Player {

    private final String playerID; //unique ID
    private int score; // score
    public static ArrayList<Player> players = new ArrayList<Player>();

    public Player(String playerID, int score) {
        this.playerID = playerID;
        this.score = score;
    }

    /**
     * @return playserID
     */
    public String getPlayerID() {
        return this.playerID;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param index is used to get player object from ArrayList players
     * @return the player object
     */
    public Player getPlayer(int index) {
        return players.get(index);
    }

    /**
     * @param score to set score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * A method to add a player to ArrayList - players
     */
    public void addPlayer() {
        players.add(this);
    }

    /**
     * A method for finding the index value of the existing player in the array:
     * players if player is found it will return the index value if player is
     * not found then it will return -1
     *
     * @param playerID is used to compare
     * @return indexValue that contains the playerID
     */
    public int getPlayerIndex(String playerID) {
        int indexValue = -1;
        for (int i = 0; i < players.size(); i++) {
            if (playerID.equals(players.get(i).getPlayerID())) {
                indexValue = i;
                break;
            }
        }
        return indexValue;
    }

}
