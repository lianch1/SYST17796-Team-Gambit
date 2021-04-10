/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCardGame;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jaeyoung
 */
public class Sequence {
    
    private ArrayList<Card> sequence = new ArrayList<Card>(10);
    private boolean[] bool_sequence;
    
    // seqyuence will always have 10
    // option 1
    public Sequence(){
        
    }
    
    public void resetSequence(){
        // length will always be 10
        // turns everything into false (spot not filled)
        for(int i = 0; i < 10; i++){
            bool_sequence[i] = false;
        }
    }
    

    // fills up the 10 spots 1 by 1, the card value or rank obviously doesnt matter.
    public void fillSequence(Card card){
        sequence.add(0, card);
    }
    
    
    
}
