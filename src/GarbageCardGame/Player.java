package GarbageCardGame;
import java.util.ArrayList;

/**
 * @author Fei Wei
 * @author Jaeyoung
 */
public class Player {
    
    private final String playerID; //unique ID
    private int score; // unique score
    public static ArrayList<String> playerName = new ArrayList<String>(); // arrayList of playerName
    //private Sequence sequence; //unique sequence (players cant share a sequence).
    //private boolean[] bool_sequence = new boolean[10]; // booleans for sequence
    
    
    public Player(String name) {
        playerID = name;
    }
    
    public int getScore() {
        return score;
    }
    public void setScore(int updateSore) {
        this.score = updateSore;
    }
    public String getPlayerID() {
        return this.playerID;
    }
//    public Sequence getSequence(){
//        return this.sequence;
//    }
//    public boolean[] getBoolSequence(){
//        return bool_sequence;
//    }
//    public boolean getWhat(int i){
//        return bool_sequence[i];
//    }
    
    
    public static boolean isDuplicate(String playerID) {

        for (int i = 0; i < playerName.size(); i++) {
            if (playerID.equals(playerName.get(i))) {
                return true;
            }
        } 
        return false;
    }
    public static boolean isValid(String playerID) {
        for (int i = 0; i < playerID.length(); i++) {
            char newName = playerID.charAt(i);
            
            if (!(Character.isDigit(newName))&&
                !(Character.isLetter(newName))) {
                return false;
            }
        }
        return true;
    }
    public void addName(String playerID) {
        playerName.add(playerID);
    }
    
    
    
    public boolean checkSequence(boolean[] sequence){
    //the sequence will always have 10 spots to be checked (ace ~ 10)
    int sequenceNum = 0;
    for(int i = 0; i < 10; i++){
        if (sequence[i] == true)
            sequenceNum += 1;
    }
    // checks if the number of spots filled(true) adds up to 10.
    // if it does add up to 10, that means that player has won.
    if (sequenceNum == 10)
        return true;
    // if not, return false (nobody won),
    else
        return false;
    }
    
    
    public void authenticatePlacement(boolean[] sequence, int spot){
    if (sequence[spot+1] == true)
        throw new IllegalArgumentException("This spot has already been filled. You cannot fill the same spot twice.");
    else
        System.out.println("You have decided to fill spot # " + spot);
        sequence[spot] = true;
    }
    
    
    
}
