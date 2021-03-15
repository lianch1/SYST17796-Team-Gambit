package ca.sheridancollege.project;

/**
 * @author Fei Wei
 * Student# 991625792
 *
 */
public class Score {

    // Initializations & Declarations
    int score = 0;
    CheckSequence self = new CheckSequence();

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
        System.out.println(""); //print userName, Score
    } // End of endingMsg method 

} // End of the Class

