package GarbageCardGame;

/**
 * Controller class for driver class: MyGarbage.java Takes user inputs and
 * constructs Player object Additionally, it returns player objects back to
 * driver class.
 *
 * @author Cheng Lian April 12, 2021
 */
public class PlayerController {

    /**
     * Method that creates player objects and return it to driver class
     *
     * @param playerName so method can assign playerName to player object
     * @return playerObject
     */
    public Player initializePlayerObjects(String playerName) {

        // Initialize player objects
        Player playerObject = new Player(playerName, 0);

        // Return player index if they exists already
        int playerIndex = playerObject.getPlayerIndex(playerName);

        // create player object if player don't already exists
        createPlayerObject(playerIndex, playerObject);

        return playerObject;
    }

    /**
     * Method that checks if player already exist in array and makes the player
     * object if it's not duplicate
     *
     * @param playerIndex is to indicate if player is duplicate or not
     * @param playerObject is to allow method to access the player object
     */
    public void createPlayerObject(int playerIndex, Player playerObject) {
        if (playerIndex == -1) {
            playerObject.addPlayer();
        } else {
            playerObject = playerObject.getPlayer(playerIndex);
        }
    }
}
