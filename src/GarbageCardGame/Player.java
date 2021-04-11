package GarbageCardGame;

import java.util.ArrayList;

/**
 * @author Fei Wei
 * @author Cheng Lian April 11, 2021
 */
public class Player {

    private final String playerID; //unique ID
    private int score; // unique score
    public static ArrayList<Player> players = new ArrayList<Player>();

    public Player(String name) {
        playerID = name;
        score = 0;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    //updates the score of an existing player
    public void updateScore(int index, int updateScore) {
        players.get(index).setScore(updateScore);
    }

    public String getPlayerID() {
        return this.playerID;
    }

    public void addPlayer(Player playerID) {
        players.add(playerID);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    //method for finding the index value of the existing player in the array: players
    //if player is found it will return the index value
    //if player is not found then it will return -1
    public int findPlayerIndex(String playerID) {
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
