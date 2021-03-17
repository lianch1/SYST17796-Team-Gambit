package GarbageCardGame;

import java.util.*;

public class ReplayOrEndGame {

    public void isReplay() {
        // TODO - implement ReplayOrEndGame.isReplay
        throw new UnsupportedOperationException();
    }

    /**
     * @author Fei Wei Student# 991625792
     *
     */
    // Replay method
    public boolean isReplay() {

        // Get user input
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to continue? Y/N ");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;

    } // End of replay method

    public void endGame() {
        // TODO - implement ReplayOrEndGame.endGame
        throw new UnsupportedOperationException();
    }

}
