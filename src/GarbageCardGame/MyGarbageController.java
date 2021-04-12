package GarbageCardGame;

import java.util.Scanner;

/**
 * Controller class for driver class: MyGarbage.java Takes player objects to
 * pass on to method to play the game. Constructs deck and playerCards objects
 * for both players. Also contains logics that is required for the game to run.
 * Additionally, it contains methods that prints out statements to the user.
 *
 * @author Cheng Lian April 12, 2021
 */
public class MyGarbageController implements Help {

    //scanner object   
    Scanner input = new Scanner(System.in);

    /**
     * A method that plays the game
     *
     * @param playerObject1 so the game can use player1's object
     * @param playerObject2 so the game can use player2's object
     */
    public void garbageGame(Player playerObject1, Player playerObject2) {

        //storing the player name in variables for easy access
        String player1Name = playerObject1.getPlayerID();
        String player2Name = playerObject2.getPlayerID();

        //create new deck and shuffle it
        Deck d1 = new Deck();
        d1.createDeck();
        d1.shuffle();

        //create playerCards objects and deal 10 faced down cards each to them
        PlayerCards player1 = new PlayerCards(d1);
        PlayerCards player2 = new PlayerCards(d1);

        //variable to store if any player won:
        boolean player1Won = false;
        boolean player2Won = false;

        //initializes player turns, starting with player 1
        while (player1Won == false && player2Won == false && d1.getSize() != 0) {
            player1Won = turn(player1, d1, player1Name);
            player2Won = turn(player2, d1, player2Name);
        }

        // Winner declaration and updates 
        // if both players completed their sequence on the same turn
        if (player1Won == true && player2Won == true) {
            System.out.println(PURPLE + "***************** " + "Both " + player1Name + " and " + player2Name + " Won!!!!" + "*****************" + RESET);
            playerObject1.setScore(playerObject1.getScore() + 1);
            playerObject2.setScore(playerObject2.getScore() + 1);
            
        } else if (player1Won == true) {
            System.out.println(PURPLE + "***************** " + player1Name + " Won!!!!" + "*****************" + RESET);
            playerObject1.setScore(playerObject1.getScore() + 1);

        } else if (player2Won == true) {
            System.out.println(PURPLE + "***************** " + player2Name + " Won!!!!" + "*****************" + RESET);
            playerObject2.setScore(playerObject2.getScore() + 1);
        
        //if deck ran out of cards and no one completed their sequence
        } else if (d1.getSize() == 0) {
            System.out.println("No one wins!");
        }

        //print player scores:
        printPlayerScores(player1Name, playerObject1);
        printPlayerScores(player2Name, playerObject2);

    }

    /**
     * A method that that allows each player to take their turn
     *
     * @param playerCard is used to store the player's 10 cards
     * @param deck is the deck that the players draw from
     * @param playerName is the name of players
     * @return true if player wins
     */
    public boolean turn(PlayerCards playerCard, Deck deck, String playerName) {

        //variable to store input
        String playerChoice = "";
        //variable to store if player won
        Boolean winner = false;
        //variable to store if a player's turn is over
        boolean isTurnEnd = false;

        //turn begins message 
        System.out.println("");
        System.out.println(CYAN + "***************** " + playerName + "'s turn *****************" + RESET);

        //create card object to store drawn card
        Card playerDrawnCard = deck.drawCard();

        //player's turn 
        while (isTurnEnd == false && deck.getSize() != 0) {
            System.out.println(CYAN + playerName + "'s cards are: " + RESET + playerCard.showPlayerCard());
            System.out.println("");

            // if card drawn is jack or queen, it automatically discards and ends the player's turn
            if (playerCard.isJackQueen(playerDrawnCard) == true) {
                System.out.println(RED + "!!!!!!!!!!!!!! " + playerName + " drew a " + playerDrawnCard.getValueString() + " of " + playerDrawnCard.getSuit() + " and is discarded!!!!!!!!!!!!!!" + RESET);
                displayTurnEndMsg(playerName);
                isTurnEnd = true;

                // if card drawn is not jack or queen    
            } else {
                System.out.println(CYAN + playerName + " draws: " + RESET + playerDrawnCard.toString());
                System.out.println("");
                System.out.println(CYAN + playerName + "'s decision:" + RESET);

                boolean placementCorrect = false;

                //player placement:
                while (placementCorrect == false && isTurnEnd == false) {

                    try {

                        System.out.println("Please enter the slot you would like to replace(1-10), discard(d), or tutorial(help) followed by Enter!");
                        playerChoice = input.nextLine();

                        //if player wants (help)
                        if (playerChoice.equalsIgnoreCase("help")) {
                            help();

                            //if player discards(d)
                        } else if (playerChoice.equalsIgnoreCase("d")) {
                            displayTurnEndMsg(playerName);
                            isTurnEnd = true;

                            //if player enters an integer value (1-10)
                        } else if (Integer.parseInt(playerChoice) >= 1 && Integer.parseInt(playerChoice) <= 10) {
                            //checks if player choice is possible
                            if (playerCard.checkPlayerPlacement(playerDrawnCard, Integer.parseInt(playerChoice)) == true) {
                                Card placeholder = playerCard.replaceCard(playerDrawnCard, Integer.parseInt(playerChoice));
                                playerDrawnCard = placeholder;
                                placementCorrect = true;

                            } else {
                                System.err.println("Wrong placement! Try again!");
                            }
                        } else {
                            displayTurnErrorMsg();
                        }
                    } catch (NumberFormatException e) {
                        displayTurnErrorMsg();
                    }
                }//end of while loop

                //checks if player's 10 cards are in sequence
                if (playerCard.checkSequence() == true) {
                    winner = true;
                    isTurnEnd = true;
                } else {
                    winner = false;
                }
            }
        }//end of while loop
        return winner;
    }

    /**
     * An overwritten method to show turn instructions to player
     */
    @Override
    public void help() {
        System.out.println(GREEN + "*********************************** How to play ***********************************" + RESET);
        System.out.println("You have 2 options:");
        System.out.println("    1. Take the drawn card and place it in the slot number that matches the card's \n\tvalue. (type: 1-10 followed by enter)");
        System.out.println("    2. Discard the drawn card and end your turn. (type: d followed by enter)");
        System.out.println("Once a card is replaced, you can make the above 2 decisions again with the replaced card.\n");
        System.out.println("Please note the following:");
        System.out.println("    1. Queens and jacks are automatically discarded and ends your turn.");
        System.out.println("    2. King is treated as a wild card and can be placed in any slot");
        System.out.println("To win the game, you must be the first to assemble 10 cards in sequence.\n");
        System.out.println(GREEN + "*********************************** Good Luck! ************************************" + RESET);
        System.out.println("");
    }

    /**
     * Method that displays the turn error message
     */
    public void displayTurnErrorMsg() {
        System.err.println("*ERROR* Bad Input. Please enter (1-10) to replace or (d) to discard");
    }

    /**
     * Method that displays the end turn message
     *
     * @param playerName to display player's name in error message
     */
    public void displayTurnEndMsg(String playerName) {
        System.out.println(CYAN + playerName + "'s turn ends" + RESET);
    }

    /**
     * Method that prints out the total score of a player
     *
     * @param playerName is to display player's name
     * @param playerObject is to allow method to access the player object
     */
    public void printPlayerScores(String playerName, Player playerObject) {
        System.out.println(playerName + "'s total score is " + playerObject.getScore());
    }

}
