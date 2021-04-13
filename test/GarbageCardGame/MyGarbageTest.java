package GarbageCardGame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for MyGarbage.java
 *
 * @author Cheng Lian April 12, 2021
 */
public class MyGarbageTest {

    public MyGarbageTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Called before class");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Called after class");
    }

    @Before
    public void setUp() {
        System.out.println("    Called before test case");
    }

    @After
    public void tearDown() {
        System.out.println("    Called after test case");
    }

    /**
     * Good Test of isHelpStart method, of class MyGarbage. A method for
     * validating if the user input is "help" or "start"
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void GoodtestIsHelpStart1() {
        System.out.println("isHelpStart(HELP)");
        String userInput = "HELP";
        MyGarbage instance = new MyGarbage();
        boolean expResult = true;
        boolean result = instance.isHelpStart(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Good Test of isHelpStart method, of class MyGarbage. A method for
     * validating if the user input is "help" or "start"
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void GoodtestIsHelpStart2() {
        System.out.println("isHelpStart(help)");
        String userInput = "help";
        MyGarbage instance = new MyGarbage();
        boolean expResult = true;
        boolean result = instance.isHelpStart(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Good Test of isHelpStart method, of class MyGarbage. A method for
     * validating if the user input is "help" or "start"
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void GoodtestIsHelpStart3() {
        System.out.println("isHelpStart(start)");
        String userInput = "start";
        MyGarbage instance = new MyGarbage();
        boolean expResult = true;
        boolean result = instance.isHelpStart(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Good Test of isHelpStart method, of class MyGarbage. A method for
     * validating if the user input is "help" or "start"
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void GoodtestIsHelpStart4() {
        System.out.println("isHelpStart(START)");
        String userInput = "START";
        MyGarbage instance = new MyGarbage();
        boolean expResult = true;
        boolean result = instance.isHelpStart(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Bad Test of isHelpStart method, of class MyGarbage. A method for
     * validating if the user input is "help" or "start"
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void BadtestIsHelpStart1() {
        System.out.println("isHelpStart(234089)");
        String userInput = "234089";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isHelpStart(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Bad Test of isHelpStart method, of class MyGarbage. A method for
     * validating if the user input is "help" or "start"
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void BadtestIsHelpStart2() {
        System.out.println("isHelpStart(weomosdf)");
        String userInput = "weomosdf";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isHelpStart(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Bad Test of isHelpStart method, of class MyGarbage. A method for
     * validating if the user input is "help" or "start"
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void BadtestIsHelpStart3() {
        System.out.println("isHelpStart(#$*@#*$)");
        String userInput = "#$*@#*$";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isHelpStart(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Boundary Test of isHelpStart method, of class MyGarbage. A method for
     * validating if the user input is "help" or "start"
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void BoundarytestIsHelpStart1() {
        System.out.println("isHelpStart(star)");
        String userInput = "star";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isHelpStart(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Boundary Test of isHelpStart method, of class MyGarbage. A method for
     * validating if the user input is "help" or "start"
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void BoundarytestIsHelpStart2() {
        System.out.println("isHelpStart(starte)");
        String userInput = "starte";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isHelpStart(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Boundary Test of isHelpStart method, of class MyGarbage. A method for
     * validating if the user input is "help" or "start"
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void BoundarytestIsHelpStart3() {
        System.out.println("isHelpStart(helpe)");
        String userInput = "helpe";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isHelpStart(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Boundary Test of isHelpStart method, of class MyGarbage. A method for
     * validating if the user input is "help" or "start"
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void BoundarytestIsHelpStart4() {
        System.out.println("isHelpStart(hel)");
        String userInput = "hel";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isHelpStart(userInput);
        assertEquals(expResult, result);
    }

    /**
     * Good Test of isYesNo method, of class MyGarbage. A method for validating
     * if the user input is "yes" or "no"
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void GoodtestIsYesNo1() {
        System.out.println("isYesNo(YES)");
        String newGame = "YES";
        MyGarbage instance = new MyGarbage();
        boolean expResult = true;
        boolean result = instance.isYesNo(newGame);
        assertEquals(expResult, result);
    }

    /**
     * Good Test of isYesNo method, of class MyGarbage. A method for validating
     * if the user input is "yes" or "no"
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void GoodtestIsYesNo2() {
        System.out.println("isYesNo(yes)");
        String newGame = "yes";
        MyGarbage instance = new MyGarbage();
        boolean expResult = true;
        boolean result = instance.isYesNo(newGame);
        assertEquals(expResult, result);
    }

    /**
     * Good Test of isYesNo method, of class MyGarbage. A method for validating
     * if the user input is "yes" or "no"
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void GoodtestIsYesNo3() {
        System.out.println("isYesNo(no)");
        String newGame = "no";
        MyGarbage instance = new MyGarbage();
        boolean expResult = true;
        boolean result = instance.isYesNo(newGame);
        assertEquals(expResult, result);
    }

    /**
     * Good Test of isYesNo method, of class MyGarbage. A method for validating
     * if the user input is "yes" or "no"
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void GoodtestIsYesNo4() {
        System.out.println("isYesNo(NO)");
        String newGame = "NO";
        MyGarbage instance = new MyGarbage();
        boolean expResult = true;
        boolean result = instance.isYesNo(newGame);
        assertEquals(expResult, result);
    }

    /**
     * Bad Test of isYesNo method, of class MyGarbage. A method for validating
     * if the user input is "yes" or "no"
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void BadtestIsYesNo1() {
        System.out.println("isYesNo(123)");
        String newGame = "123";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isYesNo(newGame);
        assertEquals(expResult, result);
    }

    /**
     * Bad Test of isYesNo method, of class MyGarbage. A method for validating
     * if the user input is "yes" or "no"
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void BadtestIsYesNo2() {
        System.out.println("isYesNo(abc)");
        String newGame = "abc";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isYesNo(newGame);
        assertEquals(expResult, result);
    }

    /**
     * Bad Test of isYesNo method, of class MyGarbage. A method for validating
     * if the user input is "yes" or "no"
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void BadtestIsYesNo3() {
        System.out.println("isYesNo(%^&)");
        String newGame = "%^&";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isYesNo(newGame);
        assertEquals(expResult, result);
    }

    /**
     * Boundary Test of isYesNo method, of class MyGarbage. A method for
     * validating if the user input is "yes" or "no"
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void BoundarytestIsYesNo1() {
        System.out.println("isYesNo(ye)");
        String newGame = "ye";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isYesNo(newGame);
        assertEquals(expResult, result);
    }

    /**
     * Boundary Test of isYesNo method, of class MyGarbage. A method for
     * validating if the user input is "yes" or "no"
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void BoundarytestIsYesNo2() {
        System.out.println("isYesNo(yess)");
        String newGame = "yess";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isYesNo(newGame);
        assertEquals(expResult, result);
    }

    /**
     * Boundary Test of isYesNo method, of class MyGarbage. A method for
     * validating if the user input is "yes" or "no"
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void BoundarytestIsYesNo3() {
        System.out.println("isYesNo(noo)");
        String newGame = "noo";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isYesNo(newGame);
        assertEquals(expResult, result);
    }

    /**
     * Boundary Test of isYesNo method, of class MyGarbage. A method for
     * validating if the user input is "yes" or "no"
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void BoundarytestIsYesNo4() {
        System.out.println("isYesNo(n)");
        String newGame = "n";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isYesNo(newGame);
        assertEquals(expResult, result);
    }

    /**
     * Good Test of isValid method, of class MyGarbage. A method for checking if
     * the name entered is valid Only numbers and letters are valid
     *
     * @result true if valid, false if invalid
     *
     */
    @Test
    public void GoodtestIsValid() {
        System.out.println("        Good Test isValid");
        String playerID = "Alex1234";
        MyGarbage instance = new MyGarbage();
        boolean expResult = true;
        boolean result = instance.isValid(playerID);
        assertEquals(expResult, result);
    }

    /**
     * Bad Test of isValid method, of class MyGarbage. A method for checking if
     * the name entered is valid Only numbers and letters are valid
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void BadtestIsValid() {
        System.out.println("        Bad Test isValid");
        String playerID = "%#$^@#$";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isValid(playerID);
        assertEquals(expResult, result);
    }

    /**
     * Boundary Test of isValid method, of class MyGarbage. A method for
     * checking if the name entered is valid Only numbers and letters are valid
     *
     * @result true if valid, false if invalid
     */
    @Test
    public void BoundarytestIsValid() {
        System.out.println("        Boundary Test isValid");
        String playerID = "Alex!1234";
        MyGarbage instance = new MyGarbage();
        boolean expResult = false;
        boolean result = instance.isValid(playerID);
        assertEquals(expResult, result);
    }

}
