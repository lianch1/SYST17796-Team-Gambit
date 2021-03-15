package ca.sheridancollege.project;

import java.util.*;

/**
 * @author Fei Wei Student# 991625792
 *
 */
public class Replay {

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

} // End of Class
