package ca.sheridancollege.project;

/**
 * @author Fei Wei Student# 991625792
 *
 */
public class CheckSequence {

    // Methods
    public boolean isSequence(Deck[] playersCards) {

        int count = 0;

        for (int i = 0; i < playersCards.length; i++) {
            if (playersCards[i] == (i + 1)) {
                count++;
            }
        } //End of forLoop

        if (count == 10) {
            return true;
        }
        
        return false;
    } // End of isSequence method

} // End of class
