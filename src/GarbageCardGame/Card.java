package GarbageCardGame;

/**
 * A class that models playing card Objects 
 *
 * @author dancye
 * @author Fei Wei April 11, 2021
 * @author Cheng Lian April 12, 2021
 */
public class Card {

    private final Value value;
    private final Suit suit;
    private boolean faceUp;

    /**
     *
     * @param value is used to initialize the value of value variable
     * @param suit is used to initialize the value of suit variable
     */
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
        faceUp = true;
    }

// getters and setters
    /**
     * @return the value in integer
     */
    public int getValueNumber() {
        return value.getValueNumber();
    }

    /**
     *
     * @return the value in string
     */
    public String getValueString() {
        return value.getValueString();
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit.printSuit();
    }

    /**
     * @return faceUp
     */
    public boolean isFaceUp() {
        return faceUp;
    }

    /**
     * A method to print the card Value and Suit or if it's faced down
     *
     * @return the txt: value and suit of a card or a message if faced up or returns
     * the card is faced down
     */
    @Override
    public String toString() {
        String txt = "";
        if (faceUp) {
            txt += "\n" + value.getValueString() + " of " + suit.printSuit();
            return txt;
        } else {
            txt = "\nCard is Faced down ";
        }
        return txt;
    }

    /**
     * A method to flip cards
     */
    public void flipCard() {
        faceUp = !faceUp;
    }
}
