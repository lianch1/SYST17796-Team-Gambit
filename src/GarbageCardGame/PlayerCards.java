package GarbageCardGame;

import java.util.*;

/**
 * A class is the subclass of Player.java that models the ten cards that a
 * player owns at any instance of the game. Each player's cards are stored in
 * their own arrayList object. This class also contains methods that allows for
 * manipulation of the player cards
 *
 * @author Jaeyoung
 * @author Cheng Lian April 10, 2021
 * @author Fei Wei April 11, 2021
 */
public class PlayerCards extends Deck {

    private ArrayList<Card> playerCards;

    /**
     * Default construction - populate player initial 10 cards
     *
     * @param deck is used to pass 10 cards
     */
    public PlayerCards(Deck deck) {
        playerCards = new ArrayList<Card>();
        for (int i = 0; i < 10; i++) {
            Card placeHolderCard = deck.drawCard();
            placeHolderCard.flipCard();
            playerCards.add(i, placeHolderCard);
        }
    }

    /**
     * A method to replace a card in a specific slot with the drawn card, and
     * return the card that was replaced
     *
     * @param drawnCard is used to store the drawn card
     * @param slotNumber is used to store placement that player choose
     * @return the replacedCard
     */
    public Card replaceCard(Card drawnCard, int slotNumber) {
        Card replacedCard = playerCards.get(slotNumber - 1);
        playerCards.set(slotNumber - 1, drawnCard);
        //if the replaced card is faced down, it will be flipped up
        if (replacedCard.isFaceUp() != true) {
            replacedCard.flipCard();
        }
        return replacedCard;
    }

    /**
     * A method to check the player card to see if their 10 cards are in
     * sequence if any spot of the player card is the wild card: King, it passes
     * the check
     *
     * @return false if player cards are not in order, true if in order
     */
    public boolean checkSequence() {

        for (int i = 0; i < 10; i++) {
            if (playerCards.get(i).isFaceUp() == false) {
                return false;
            } else {
                if (playerCards.get(i).getValueNumber() != (i + 1)
                        && playerCards.get(i).getValueNumber() != 13) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * A method to show all the cards a player has
     *
     * @return txt to show the 10 cards that a player has currently
     */
    public String showPlayerCard() {
        String txt = "";
        for (Card showPlayerCard : playerCards) {
            txt += " \nSlot " + (playerCards.indexOf(showPlayerCard) + 1) + ":" + showPlayerCard.toString();
        }
        return txt;
    }

    /**
     * A method to check if the drawn card is Jack or Queen
     *
     * @param drawnCard is used to store the drawn card
     * @return true if the card draw by player is Jack or Queen, false if not
     */
    public boolean isJackQueen(Card drawnCard) {
        if (drawnCard.getValueNumber() == 11 || drawnCard.getValueNumber() == 12) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * A method to check if the player choice matches the slot number
     *
     * @param drawnCard is used to store the drawn card
     * @param slotNumber is used to store placement that player choose
     * @return true if the value of the card matches the slot number that choose
     * by player, false if it does not match
     */
    public boolean checkPlayerPlacement(Card drawnCard, int slotNumber) {
        if (drawnCard.getValueNumber() == slotNumber || drawnCard.getValueNumber() == 13) {
            return true;
        } else {
            return false;
        }
    }

}
