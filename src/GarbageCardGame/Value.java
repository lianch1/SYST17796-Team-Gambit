package GarbageCardGame;

/**
 * An enum class that models the value in integer and string for playing card
 * Objects. It has a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * 
 * @author Cheng Lian April 10, 2021
 * @author Fei Wei April 11, 2021
 */
public enum Value {
    ACE(1, "Ace"),
    DEUCE(2, "Deuce"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(11, "Jack"),
    QUEEN(12, "Queen"),
    KING(13, "King");
    
    /**
     * These field variable represent an integer value and a string value
     */
    private final int valueNumber;
    private final String valueString;
    
     /**
     * Default constructor
     * @param valueNumber is used to initialize the valueNumber
     * @param valueString is used to initialize the valueString
     */
    private Value(int valueNumber, String valueString){
        this.valueNumber = valueNumber;
        this.valueString = valueString;
    }
    
  /**
   * @return the value in integer 
   */
    public int getValueNumber(){
        return valueNumber;
    }
    
    /**
     * @return the value in string
     */
    public String getValueString(){
        return valueString;
    }
}