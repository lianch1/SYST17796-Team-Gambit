package GarbageCardGame;

/**
 * Interface class that contains color variables for string output as well as
 * the help method.
 *
 * @author Cheng Lian April 12, 2021
 */
public interface Help {

    //string color variables:
    final String GREEN = "\u001B[32m";
    final String RESET = "\u001B[0m";
    final String PURPLE = "\033[0;35m";
    final String CYAN = "\033[0;36m";
    final String RED = "\033[0;31m";

    //method to display help
    public void help();
}
