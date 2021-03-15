
package ca.sheridancollege.project;

/**
 *
 * @author Cheng Lian
 */
public class PlayerCards {
    //datafields
    private Deck[] playerCards;
    
    //constructor  
    public PlayerCards(Deck[] playerCards) {
        this.playerCards = playerCards;
    }
    //getter and setters
    public Deck[] getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(Deck[] playerCards) {
        this.playerCards = playerCards;
    }
    
}
