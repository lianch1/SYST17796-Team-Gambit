package GarbageCardGame;

import java.util.*;

/**
 * A driver class of the Garbage game. It contains a main method that starts the
 * game. It also interacts with the user to get inputs to pass through to the
 * Player & Game controllers. 
 *
 * @author Jaeyoung
 * @author Fei Wei April 11, 2021
 * @author Cheng Lian April 11, 2021
 */
public class MyGarbage implements Help {

    final private MyGarbageController myGarbageController;
    final private PlayerController playerController;

    public MyGarbage() {
        myGarbageController = new MyGarbageController();
        playerController = new PlayerController();
    }

    /**
     * A method to start the Garbage Game
     */
    private void play() {

        Scanner input = new Scanner(System.in);

        //greets the user and provide help 
        String playerInput = "";
        boolean startGame = false;
        while (startGame == false) {
            welcome();
            playerInput = input.nextLine();
            if (isHelpStart(playerInput) == true) {
                if (playerInput.equalsIgnoreCase("help")) {
                    help();
                } else if (playerInput.equalsIgnoreCase("start")) {
                    startGame = true;
                }
            }
        }

        //initialize player name variables
        String player1Name = "";
        String player2Name = "";

        /* The following logic will prompt both users to input their names
        and checks whether if they are valid */
        for (int i = 1; i < 3; i++) {
            boolean isNameValid = false;
            String playerName = "";

            while (isNameValid == false) {
                System.out.println("Please enter a valid name for player " + i + "(Letters and numbers only): ");
                playerName = input.nextLine();
                if (isValid(playerName) == true) {
                    if (!playerName.equals(player1Name)) {
                        isNameValid = true;
                    }
                }
            }
            if (i == 1) {
                player1Name = playerName;
            }
            if (i == 2) {
                player2Name = playerName;
            }
        }

        //stores player objects for both players
        Player playerObject1 = playerController.initializePlayerObjects(player1Name);
        Player playerObject2 = playerController.initializePlayerObjects(player2Name);

        boolean playAgain = true;
        while (playAgain == true) {

            //calls the controller to starts the game
            myGarbageController.garbageGame(playerObject1, playerObject2);

            //prompts the user if they want to play again
            String newGame = "";
            while (isYesNo(newGame) == false) {
                System.out.println("Would you like to play again? (yes/no)");
                newGame = input.nextLine();
                if (isYesNo(newGame) == true) {
                    if (newGame.equalsIgnoreCase("no")) {
                        playAgain = false;
                    } else if (newGame.equalsIgnoreCase("yes")) {
                        playAgain = true;
                    }
                }
            }
        }
    }
    
    /**
     * Method that validates user input when asked if they want help or start game
     * 
     * @param userInput is the player choice
     * @return true if user enters help or start, false if anything else
     */
    public boolean isHelpStart(String userInput) {
        if (userInput.equalsIgnoreCase("help") || userInput.equalsIgnoreCase("start")) {
            return true;
        } else {
            System.err.println("Invalid input: Please enter help/start!");
            return false;
        }
    }
    
    
    /**
     * Method that validates user input when asked if they want to play a new game
     * 
     * @param newGame is the player choice 
     * @return true if user enters yes or no, false if anything else
     */
    public boolean isYesNo(String newGame){
        if (newGame.equalsIgnoreCase("yes") || newGame.equalsIgnoreCase("no")){
            return true;
        }else{
            System.err.println("Invalid input: Please enter yes/no!");
            return false;
        }
    }
    
    /**
     * A method for checking if the name entered is valid
     *
     * @param playerID the String to check
     * @return false if name is not valid, true if valid
     */
    public boolean isValid(String playerID) {
        if (playerID.isEmpty() == true) {
            System.err.println("Invalid name. Please try again!");
            return false;
        }

        for (int i = 0; i < playerID.length(); i++) {
            char newName = playerID.charAt(i);

            if (!(Character.isDigit(newName))
                    && !(Character.isLetter(newName))) {
                System.err.println("Invalid name. Please try again!");
                return false;
            }
        }
        return true;
    }

    /**
     * An overwritten method to show game instruction to the player
     */
    @Override
    public void help() {
        System.out.println(GREEN + "************************************* Tutorial *************************************" + RESET);
        System.out.println("At the start of the game, the 2 players will be dealt 10 face down cards each \nand the cards are placed in their individual slots: 1-10\n");
        System.out.println("Players will take turns drawing cards from the deck to replace the cards in \ntheir individual slots.\n");
        System.out.println("Once the player draws a card, they have 2 options:\n");
        System.out.println("    1. Take the drawn card and place it in the slot number that matches the card's \n\tvalue. (ie: 5 of hearts can be placed into 5th slot)");
        System.out.println("    2. Discard the drawn card and end their turn.\n");
        System.out.println("Once a card is replaced, and the player is able to place it down again as if \nthey just drew it.\n");
        System.out.println("If the deck runs out of cards, the game will end and no one wins.\n");
        System.out.println("There are 2 Exceptions to the rules explained above:\n");
        System.out.println("    1. If the player draws a queen/jack, they are automatically discarded and the\n\tplayer's turn ends.");
        System.out.println("    2. King is treated as a wild card and can be placed in any slot\n");
        System.out.println("To win the game, the player must be the first to assemble 10 cards in sequence.\nKing can substitute for any card.");
        System.out.println(GREEN + "*********************************** Good Luck! ************************************" + RESET);
        System.out.println("");
    }

    /**
     * A method to display the welcome message
     */
    public void welcome() {
        System.out.println(GREEN + "********************************** Garbage Game ***********************************" + RESET);
        System.out.println("Welcome to the Garbage game. Please enter (help) followed by Enter to access tutorial!");
        System.out.println("Otherwise enter (start) followed by Enter to begin the game!");
        System.out.println(GREEN + "***********************************************************************************" + RESET);
    }

    /**
     * Main method start from here
     *
     * @param args
     */
    public static void main(String[] args) {
        MyGarbage self = new MyGarbage();
        self.play();
    } // End of the Main method

} // End of the class
