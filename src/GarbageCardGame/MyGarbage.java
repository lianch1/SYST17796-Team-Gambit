package GarbageCardGame;

import java.util.*;

/**
 *
 * @author Jaeyoung
 * @author Fei Wei April 10, 2021
 * @author Cheng Lian April 11, 2021
 */
public class MyGarbage {

    public void play() {
       
        Scanner input = new Scanner(System.in);
        
        //initialize player name variables
        String player1Name = "";
        String player2Name = "";
        

        //method for prompts the user to enter their names and checks if it's valid
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


        
        //testing to see if driver program will take existing object from array
        //Player alex = new Player("Alex", 100);
        //alex.addPlayer();
        
        //initialize the both player objects
        Player playerObject1 = new Player(player1Name, 0);
        Player playerObject2 = new Player(player2Name, 0);

        //return player index if they exists already
        int player1Index = playerObject1.getPlayerIndex(player1Name);
        int player2Index = playerObject2.getPlayerIndex(player2Name);
        
        //checking if player already exists
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
        while(playAgain == true){
        
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
            player1Won = player1.turn(player1, d1, player1Name);
            player2Won = player2.turn(player2, d1, player2Name);
        }


                
        //winner declaration and updates score
        final String PURPLE = "\033[0;35m";
        final String RESET = "\033[0m";
        if (player1Won == true && player2Won == true) {
            System.out.println(PURPLE + "***************** " +"Both " + player1Name + " and " + player2Name + " Won!!!!" + "*****************" + RESET);          
            playerObject1.setScore(playerObject1.getScore() + 1);
            playerObject2.setScore(playerObject2.getScore() + 1);
        } else if (player1Won == true) {
            System.out.println(PURPLE + "***************** " +player1Name + " Won!!!!"+ "*****************" + RESET);
            playerObject1.setScore(playerObject1.getScore() + 1);
        } else if (player2Won == true) {
            System.out.println(PURPLE + "***************** " + player2Name + " Won!!!!"+ "*****************" + RESET);
            playerObject2.setScore(playerObject2.getScore() + 1);
        }
        

            //print player scores:
            System.out.println(player1Name + "'s total score is " + playerObject1.getScore());
            System.out.println(player2Name + "'s total score is " + playerObject2.getScore());


            //play again?
            String newGame = "";
            while (!newGame.equalsIgnoreCase("yes")  && !newGame.equalsIgnoreCase("no")) {
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
    //method for checking if the name entered is valid
    public boolean isValid(String playerID) {
        for (int i = 0; i < playerID.length(); i++) {
            char newName = playerID.charAt(i);

            if (!(Character.isDigit(newName))
                    && !(Character.isLetter(newName))) {
                return false;
            }
        }
        return true;
    }
    


    
    public static void main(String[] args) {
        MyGarbage self = new MyGarbage();
        self.play();
    } // End of the Main method

} // End of the class