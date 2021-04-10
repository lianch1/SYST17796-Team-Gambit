/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCardGame;
import java.util.ArrayList;

/**
 *
 * @author Jaeyoung
 */
public class MyGarbage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck d1 = new Deck();
        d1.createDeck();
        d1.shuffle();
        DiscardDeck d2 = new DiscardDeck();
        Card c1 = d1.get(0);
        System.out.println("Deck has the following cards: " + d1.showCard());
        d2.addDisacard(c1);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(d2.showCard());
        Player p1 = new Player("fag");
        p1.authenticatePlacement(p1.getBoolSequence(), 5);
        for (int i =0; i < 10; i++)
            System.out.println(p1.getWhat(i));
    }
    
}
