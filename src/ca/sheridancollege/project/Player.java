package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author Cheng Lian
 */
public abstract class Player {
    //datafields
    private String playerID; //the unique ID for this player
    
    //1 arg constructor
    public Player(String name) {
        playerID = name;
    }
    
    //getter and setters
    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String givenID) {
        playerID = givenID;
    }


}
