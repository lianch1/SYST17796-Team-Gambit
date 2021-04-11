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
        
        //variable to keep track of the playerCount, 2 players needed to start the game       
        int playerCount = 0;

        while (playerCount < 2) {
            for (int i = 1; i < 3; i++) {
                boolean isNameValid = false;
                String playerName = "";
                while (isNameValid == false) {
                    System.out.println("Please enter a valid name for player " + i + "(Letters and numbers only): ");
                    playerName = input.nextLine();
                    if (isValid(playerName) == true){
                        isNameValid = true;
                    }
                }
                Player playerObject = new Player(playerName);
                if (playerObject.findPlayerIndex(playerName) == -1) {
                    //player doesn't exist            
                    playerObject.addPlayer(playerObject);
                } else {
                    //player exists            
                    System.out.println("Welcome back " + playerName);
                }
                if (i == 1) {
                    player1Name = playerObject.getPlayerID();
                } else if (i == 2) {
                    player2Name = playerObject.getPlayerID();
                }
                playerCount += 1;

            }
        }
    


        //create new deck and shuffle it
        Deck d1 = new Deck();
        d1.createDeck();
        d1.shuffle();

        //create player objects and deal 10 faced down cards each to them
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

        //winner declaration
        final String PURPLE = "\033[0;35m";
        final String RESET = "\033[0m";
        if (player1Won == true && player2Won == true) {
            System.out.println(PURPLE + "***************** " +"Both " + player1Name + " and " + player2Name + " Won!!!!" + "*****************" + RESET);
        } else if (player1Won == true) {
            System.out.println(PURPLE + "***************** " +player1Name + " Won!!!!"+ "*****************" + RESET);
        } else if (player2Won == true) {
            System.out.println(PURPLE + "***************** " + player1Name + " 2 Won!!!!"+ "*****************" + RESET);
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