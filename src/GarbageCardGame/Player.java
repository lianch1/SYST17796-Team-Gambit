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

    
    public Player(String playerID, int score){
        this.playerID = playerID;
        this.score = score;
    }
 
    public String getPlayerID() {
        return this.playerID;
    }

    public void addPlayer() {
        players.add(this);
    }


    public int getScore() {
        return score;
    }

    public Player getPlayer(int index){
        return players.get(index);
    }

    public void setScore(int score) {
        this.score = score;
    }
    

    
    //method for finding the index value of the existing player in the array: players
    //if player is found it will return the index value
    //if player is not found then it will return -1
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
