package GarbageCardGame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for MyGarbageController.java
 * 
 * @author Cheng Lian April 12, 2021
 */
public class MyGarbageControllerTest {
    
    public MyGarbageControllerTest() {
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
     * Good discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid     
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void GoodtestIsPlayerChoiceValid1() {
        System.out.println("isPlayerChoiceValid(d)");
        String playerChoice = "d";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = true;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Good discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid     
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void GoodtestIsPlayerChoiceValid2() {
        System.out.println("isPlayerChoiceValid(D)");
        String playerChoice = "D";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = true;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Good discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid      
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void GoodtestIsPlayerChoiceValid3() {
        System.out.println("isPlayerChoiceValid(help)");
        String playerChoice = "help";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = true;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Good discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid    
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void GoodtestIsPlayerChoiceValid4() {
        System.out.println("isPlayerChoiceValid(HELP)");
        String playerChoice = "HELP";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = true;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Good discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid    
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void GoodtestIsPlayerChoiceValid5() {
        System.out.println("isPlayerChoiceValid(1)");
        String playerChoice = "1";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = true;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Boundary discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid    
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void BoundarytestIsPlayerChoiceValid1() {
        System.out.println("isPlayerChoiceValid(e)");
        String playerChoice = "e";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = false;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Boundary discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid    
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void BoundarytestIsPlayerChoiceValid2() {
        System.out.println("isPlayerChoiceValid(teste)");
        String playerChoice = "teste";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = false;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }

    /**
     * Boundary discard Test of testIsPlayerChoiceValid method, of class
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid    
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void BoundarytestIsPlayerChoiceValid3() {
        System.out.println("isPlayerChoiceValid(tes)");
        String playerChoice = "tes";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = false;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Boundary discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid    
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void BoundarytestIsPlayerChoiceValid4() {
        System.out.println("isPlayerChoiceValid(0)");
        String playerChoice = "0";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = false;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Boundary discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid    
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void BoundarytestIsPlayerChoiceValid5() {
        System.out.println("isPlayerChoiceValid(0.9)");
        String playerChoice = "0.9";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = false;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Boundary discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid    
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void BoundarytestIsPlayerChoiceValid6() {
        System.out.println("isPlayerChoiceValid(11)");
        String playerChoice = "11";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = false;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Bad discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid    
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void BadtestIsPlayerChoiceValid1() {
        System.out.println("isPlayerChoiceValid(Yes)");
        String playerChoice = "Yes";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = false;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Bad discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid    
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void BadtestIsPlayerChoiceValid2() {
        System.out.println("isPlayerChoiceValid(#)");
        String playerChoice = "#";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = false;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
     /**
     * Bad discard Test of testIsPlayerChoiceValid method, of class MyGarbageController.
     * A method for checking if the player turn choice entered is valid:
     * "help" is valid
     * any integer 1-10 is valid
     * "d" is valid    
     * @result true if valid, false if invalid
     * 
     */
    @Test
    public void BadtestIsPlayerChoiceValid3() {
        System.out.println("isPlayerChoiceValid(50)");
        String playerChoice = "50";
        MyGarbageController instance = new MyGarbageController();
        boolean expResult = false;
        boolean result = instance.isPlayerChoiceValid(playerChoice);
        assertEquals(expResult, result);

    }
    
    
}
