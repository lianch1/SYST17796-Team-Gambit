package GarbageCardGame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jaeyoung
 * @author Cheng Lian April 10, 2021
 * @author Fei Wei April 11, 2021
 */
public class PlayerCards extends Deck {

    private ArrayList<Card> playerCards;

    //populate player initial 10 cards
    public PlayerCards(Deck deck) {
        playerCards = new ArrayList<Card>();
        for (int i = 0; i < 10; i++) {
            Card placeHolderCard = deck.drawCard();
            placeHolderCard.flipCard();
            playerCards.add(i, placeHolderCard);
        }
    }

    //method to replace a card in a specific slot with the drawn card, 
    //and return the card that was replaced     
    public Card replaceCard(Card drawnCard, int slotNumber) {
        Card replacedCard = playerCards.get(slotNumber - 1);
        playerCards.set(slotNumber - 1, drawnCard);
        //if the replaced card is faced down, it will be flipped up
        if (replacedCard.isFaceUp() != true) {
            replacedCard.flipCard();
        }
        return replacedCard;
    }

    //checks the player card to see if their 10 cards are in sequence
    //if any spot of the player card is the wild card: King, it passes the check
    public boolean checkSequence() {
        for (int i = 0; i < 10; i++) {
            if (playerCards.get(i).getValueNumber() != i + 1 && playerCards.get(i).getValueNumber() != 13) {
                return false;
            }
        }
        return true;
    }

    //show all the cards a player has
    public String showPlayerCard() {
        String txt = "";
        for (Card showPlayerCard : playerCards) {
            txt += " \nSlot " + (playerCards.indexOf(showPlayerCard) + 1) + ":" + showPlayerCard.toString();
        }
        return txt;
    }

    //checks if the drawn card is Jack or Queen
    public boolean isJackQueen(Card drawnCard) {
        if (drawnCard.getValueNumber() == 11 || drawnCard.getValueNumber() == 12) {
            return true;
        } else {
            return false;
        }
    }

    //checks if the player choice matches the slot number
    public boolean checkPlayerPlacement(Card drawnCard, int slotNumber) {
        if (drawnCard.getValueNumber() == slotNumber || drawnCard.getValueNumber() == 13) {
            return true;
        } else {
            return false;
        }

    }

    //Player turn:    
    public boolean turn(PlayerCards player, Deck deck, String playerName) {
        //scanner object
        Scanner input = new Scanner(System.in);
        //variable to store input
        String playerChoice = "";
        //variable to store if player won
        Boolean winner = false;
        //variable to store if a player's turn is over
        boolean isTurnEnd = false;

        //print color variables:
        final String RESET = "\033[0m";
        final String RED = "\033[0;31m";     
        final String CYAN = "\033[0;36m";

        //turn begins
        System.out.println("");
        System.out.println(CYAN + "***************** " + playerName + "'s turn *****************" + RESET);
        Card playerDrawnCard = deck.drawCard();
        while (isTurnEnd == false) {
            System.out.println(playerName + "'s cards are: " + player.showPlayerCard() + RESET);
            System.out.println("");
            if (isJackQueen(playerDrawnCard) == true) {
                System.out.println(RED + "!!!!!!!!!!!!!! " + playerName + " drew a " + playerDrawnCard.getValueString() + " of " + playerDrawnCard.getSuit() + " and is discarded!!!!!!!!!!!!!!" + RESET);
                System.out.println(CYAN + playerName + "'s turn ends" + RESET);
                isTurnEnd = true;
            } else {
                System.out.println(playerName + " draws: " + playerDrawnCard.toString());
                System.out.println("");
                System.out.println(playerName + "'s decision:");

                boolean placementCorrect = false;
                while (placementCorrect == false && isTurnEnd == false) {

                    try {
                        System.out.println("Please enter the slot you would like to replace(1-10) or discard(d) followed by Enter");
                        playerChoice = input.nextLine();
                        if (playerChoice.equalsIgnoreCase("d")) {
                            System.out.println(CYAN + playerName + "'s turn ends" + RESET);
                            isTurnEnd = true;
                        } else if (Integer.parseInt(playerChoice) >= 1 && Integer.parseInt(playerChoice) <= 10) {

                            //checkPlayerPlacement(Card drawnCard, int slotNumber)
                            if (checkPlayerPlacement(playerDrawnCard, Integer.parseInt(playerChoice)) == true) {
                                Card placeholder = player.replaceCard(playerDrawnCard, Integer.parseInt(playerChoice));
                                playerDrawnCard = placeholder;
                                placementCorrect = true;
                            } else {
                                System.err.println("Wrong placement! Try again!");
                            }
                        }else{
                            System.err.println("*ERROR* Bad Input. Please enter (1-10) to replace or (d) to discard");
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("*ERROR* Bad Input. Please enter (1-10) to replace or (d) to discard");
                    }
                }//end of while loop

                if (player.checkSequence() == true) {
                    winner = true;
                    isTurnEnd = true;
                } else {
                    winner = false;
                }

            }

        }
        return winner;
    }

}
