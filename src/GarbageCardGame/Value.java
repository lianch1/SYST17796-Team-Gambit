/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCardGame;

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
    
    //Private data fields
    private final int valueNumber;
    private final String valueString;
    
    //Constructor
    private Value(int valueNumber, String valueString){
        this.valueNumber = valueNumber;
        this.valueString = valueString;
    }
    
    //methods
    public int getValueNumber(){
        return valueNumber;
    }
    
    public String getValueString(){
        return valueString;
    }
}
