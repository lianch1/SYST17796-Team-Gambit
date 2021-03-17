package GarbageCardGame;

public class CheckSequence {

    private int count;

    /**
     *
     * @param deck
     */
    // Methods
    public boolean isSequence(ArrayList<Card> deck) {

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

}
