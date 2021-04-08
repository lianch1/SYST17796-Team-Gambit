package GarbageCardGame;
import java.util.ArrayList;
import java.util.List;

public class Garbage {

    //assuming there is a discardPile.
    public static ArrayList<Card> discardPile = new ArrayList<Card>();
    
    
    public void discardCard(Card card){
        discardPile.add(0, card);
    }
    
    
    
    public String declareWinner(){
        String winner = "declare winner";
        return winner;
    }
    

    public void initializeGame() {
            // TODO - implement Garbage.initializeGame
            throw new UnsupportedOperationException();
    }

}