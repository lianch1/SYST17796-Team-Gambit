package GarbageCardGame;

import java.util.*;

/**
 * A driver class of the Garbage game. It contains a main method that
 * starts the game. It also interacts with the user to get inputs to pass through
 * to the game. Also it will display outputs to the user. 
 * 
 * @author Jaeyoung
 * @author Fei Wei April 11, 2021
 * @author Cheng Lian April 11, 2021
 */
public class MyGarbage {

    //colors for print
    String GREEN = "\u001B[32m";
    String RESET = "\u001B[0m";
    
    /**
     *  A method to start the Garbage Game
     */
    private void play() {

        Scanner input = new Scanner(System.in);

        //greets the user and provide help 
        boolean canStartGame = false;
        while (canStartGame == false) {
            welcome();
            String playerInput = input.nextLine();
            if (playerInput.equalsIgnoreCase("help")) {
                help();
            } else {
                canStartGame = true;
            }
        }
        
        
        
        //initialize player name variables
        String player1Name = "";
        String player2Name = "";

        /* The following logic will prompt the user for their names
        and checks whether it's valid */
        for (int i = 1; i < 3; i++) {
            boolean isNameValid = false;
            String playerName = "";
          
            while (isNameValid == false) {
                System.out.println("Please enter a valid name for player " + i + "(Letters and numbers only): ");
                playerName = input.nextLine();
                if (isValid(playerName) == true) {
                    isNameValid = true;
                }
            }
            if (i == 1) {
                player1Name = playerName;
            }
            if (i == 2) {
                player2Name = playerName;
            }
        }

        // Initialize both player objects
        Player playerObject1 = new Player(player1Name, 0);
        Player playerObject2 = new Player(player2Name, 0);

        // Return player index if they exists already
        int player1Index = playerObject1.getPlayerIndex(player1Name);
        int player2Index = playerObject2.getPlayerIndex(player2Name);

        // Checking if player already exists
        if (player1Index == -1) {
            playerObject1.addPlayer();
        } else {
            playerObject1 = playerObject1.getPlayer(player1Index);
        }

        if (player2Index == -1) {
            playerObject2.addPlayer();
        } else {
            playerObject2 = playerObject2.getPlayer(player2Index);
        }

        boolean playAgain = true;
        while (playAgain == true) {

            //create new deck and shuffle it
            Deck d1 = new Deck();
            d1.createDeck();
            d1.shuffle();

            //create playerCards objects and deal 10 faced down cards each to them
            PlayerCards player1 = new PlayerCards(d1);
            PlayerCards player2 = new PlayerCards(d1);

            //variable to store how many winners there are:
            boolean player1Won = false;
            boolean player2Won = false;

            //initializes player turns, starting with player 1
            while (player1Won == false && player2Won == false) {
                player1Won = turn(player1, d1, player1Name);
                player2Won = turn(player2, d1, player2Name);
            }

            // Winner declaration and updates score
            final String PURPLE = "\033[0;35m";
            final String RESET = "\033[0m";
            
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
            }

            //print player scores:
            System.out.println(player1Name + "'s total score is " + playerObject1.getScore());
            System.out.println(player2Name + "'s total score is " + playerObject2.getScore());

            //prompts the user if they want to play again
            String newGame = "";
            while (!newGame.equalsIgnoreCase("yes") && !newGame.equalsIgnoreCase("no")) {
                
                System.out.println("Would you like to play again? (yes/no)");
                newGame = input.nextLine();
                
                if (newGame.equalsIgnoreCase("no")) {
                    playAgain = false;
                } else if (newGame.equalsIgnoreCase("yes")) {
                    playAgain = true;
                } else {
                    System.out.println("Please enter yes/no!");
                }

            }

        }
    }

    /**
     *  A method for checking if the name entered is valid
     * 
     * @param playerID the String to check
     * @return false if name is not valid 
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
     * A method to show game instruction when player needs
     */
    public void help(){
        System.out.println(GREEN + "*********************************** How to play ***********************************" + RESET);
        System.out.println("At the start of the game, the 2 players will be dealt 10 face down cards each \nand the cards are placed in their individual slots: 1-10\n");
        System.out.println("Players will take turns drawing cards from the deck to replace the cards in \ntheir individual slots.\n");
        System.out.println("Once the player draws a card, they have 2 options:\n");
        System.out.println("    1. Take the drawn card and place it in the slot number that matches the card's \n\tvalue. (ie: 5 of hearts can be placed into 5th slot)");
        System.out.println("    2. Discard the drawn card and end their turn.\n");
        System.out.println("Once a card is replaced, and the player is able to place it down again as if \nthey just drew it.\n");
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
    public void welcome(){
        System.out.println(GREEN + "********************************** Garbage Game ***********************************" + RESET);
        System.out.println("Welcome to the Garbage game. Please enter (help) to access tutorial!");
        System.out.println("Otherwise enter any other key to continue!");
        System.out.println(GREEN + "***********************************************************************************" + RESET);
    }
    
     /**
     * 
     * @param playerCard is used to store the player's 10 cards
     * @param deck is the deck that the players draw from
     * @param playerName is the name of players
     * @return winner 
     */
    public boolean turn(PlayerCards playerCard, Deck deck, String playerName) {
        //scanner object
        Scanner input = new Scanner(System.in);
        //variable to store input
        String playerChoice = "";
        //variable to store if player won
        Boolean winner = false;
        //variable to store if a player's turn is over
        boolean isTurnEnd = false;

        //print color variables:
        final String RESET = "\033[0m";
        final String RED = "\033[0;31m";
        final String CYAN = "\033[0;36m";

        //turn begins
        System.out.println("");
        System.out.println(CYAN + "***************** " + playerName + "'s turn *****************" + RESET);
        
        Card playerDrawnCard = deck.drawCard();
        
        while (isTurnEnd == false) {
            System.out.println(playerName + "'s cards are: " + playerCard.showPlayerCard() + RESET);
            System.out.println("");
            
            if (playerCard.isJackQueen(playerDrawnCard) == true) {
                System.out.println(RED + "!!!!!!!!!!!!!! " + playerName + " drew a " + playerDrawnCard.getValueString() + " of " + playerDrawnCard.getSuit() + " and is discarded!!!!!!!!!!!!!!" + RESET);
                System.out.println(CYAN + playerName + "'s turn ends" + RESET);
                isTurnEnd = true;
                
            } else {
                System.out.println(playerName + " draws: " + playerDrawnCard.toString());
                System.out.println("");
                System.out.println(playerName + "'s decision:");

                boolean placementCorrect = false;
                
                while (placementCorrect == false && isTurnEnd == false) {
                   
                    try {
                        System.out.println("Please enter the slot you would like to replace(1-10), discard(d), or tutorial(help) followed by Enter!");
                        playerChoice = input.nextLine();
                       
                        if (playerChoice.equalsIgnoreCase("help")){
                            help();
                        }   
                        
                        else if (playerChoice.equalsIgnoreCase("d")) {
                            System.out.println(CYAN + playerName + "'s turn ends" + RESET);
                            isTurnEnd = true;
                            
                        } else if (Integer.parseInt(playerChoice) >= 1 && Integer.parseInt(playerChoice) <= 10) {
                     
                            if (playerCard.checkPlayerPlacement(playerDrawnCard, Integer.parseInt(playerChoice)) == true) {
                                Card placeholder = playerCard.replaceCard(playerDrawnCard, Integer.parseInt(playerChoice));
                                playerDrawnCard = placeholder;
                                placementCorrect = true;
                                
                            } else {
                                System.err.println("Wrong placement! Try again!");
                            }
                        } else {
                            System.err.println("*ERROR* Bad Input. Please enter (1-10) to replace or (d) to discard");
                        }
                    } 
                    catch (NumberFormatException e) {
                        System.err.println("*ERROR* Bad Input. Please enter (1-10) to replace or (d) to discard");
                    }
                }//end of while loop

                if (playerCard.checkSequence() == true) {
                    winner = true;
                    isTurnEnd = true;
                } else {
                    winner = false;
                }
            }
        }
        return winner;
    }
    
    
    /**
     * Main method start from here
     * @param args 
     */
    public static void main(String[] args) {
        MyGarbage self = new MyGarbage();
        self.play();
    } // End of the Main method

} // End of the class
