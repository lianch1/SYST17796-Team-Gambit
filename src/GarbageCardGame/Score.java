package GarbageCardGame;

public class Score {

    // Initializations & Declarations
    private int score = 0;
    CheckSequence self = new CheckSequence();

    /**
     *
     * @param plyer
     */
    public int getScore(int plyer) {
        return this.score;
    }

    /**
     *
     * @param deck
     */
    public void updateScore(ArrayList<Card> deck) {
        // TODO - implement Score.updateScore
        throw new UnsupportedOperationException();
    }

    // Methods
    public void updateScore(Deck[] playersCards) {

        if (self.isSequence(playersCards) == true) {
            score++;

        }

    }// End of updateScore method

    public int displayScore() {
        return score;

    } // End of displayScore method

    public void endingMsg() {
        System.out.println(""); //print winner userName, Score
    } // End of endingMsg method 

}
