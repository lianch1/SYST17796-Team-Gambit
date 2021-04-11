package GarbageCardGame;

/**
 * @author dancye
 * @author Cheng Lian April 10, 2021
 */
public class Card {
    
    private Value value;
    private Suit suit;
    private boolean faceUp;

// Card Constructor
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
        faceUp = true;
    }
    
// getters and setters
    public int getValueNumber() {
        return value.getValueNumber();
    }
    
    /**
     * 
     * @return 
     */
    public String getValueString(){
        return value.getValueString();
    }

    /**
     * 
     * @return 
     */
    public String getSuit() {
        return suit.printSuit();
    }

    public boolean isFaceUp() {
        return faceUp;
    }
    
//toString method
    /**
     * 
     * @return 
     */
    public String toString() {
        String txt = "";
        if (faceUp){
            txt += "\n" + value.getValueString() + " of " + suit.printSuit();
            return txt;
        } else {
            txt = "\nCard is Faced down ";
        }
        return txt;
    }
    
//flip card method    
    public void flipCard(){
        faceUp = !faceUp;
    }
}
       
    