package GarbageCardGame;

/**
 *
 * @author Jaeyoung
 * @author Cheng Lian April 10, 2021
 */
public class MyGarbage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            player1Won = player1.turn(player1, d1, 1);
            player2Won = player2.turn(player2, d1, 2);            
        }
        
        //winner declaration
        if (player1Won == true && player2Won == true){
            System.out.println("Both players Won!!!!");
        }
        else if (player1Won == true){
            System.out.println("Player 1 Won!!!!");
        }
        else if(player2Won == true){
            System.out.println("Player 2 Won!!!!");
        }

    }

}
