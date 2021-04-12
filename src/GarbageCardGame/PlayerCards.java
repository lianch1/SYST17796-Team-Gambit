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
     * @return false if player cards are not in order
     */
    public boolean checkSequence() {
        for (int i = 0; i < 10; i++) {
            if (playerCards.get(i).getValueNumber() != i + 1 && playerCards.get(i).getValueNumber() != 13) {
                return false;
            }
        }
        return true;
    }

    /**
     * A method to show all the cards a player has
     *
     * @return txt to show
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
     * @param drawnCard is used to store the drawn card
     * @return true if the card draw by player is Jack or Queen
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
     * @param drawnCard is used to store the drawn card
     * @param slotNumber is used to store placement that player choose 
     * @return true if the value of the card matches the slot number that choose by player
     */
    public boolean checkPlayerPlacement(Card drawnCard, int slotNumber) {
        if (drawnCard.getValueNumber() == slotNumber || drawnCard.getValueNumber() == 13) {
            return true;
        } else {
            return false;
        }
    }
    
//    /**
//     * 
//     * @param playerCard is used to store the player's 10 cards
//     * @param deck is the deck that the players draw from
//     * @param playerName is the name of players
//     * @return winner 
//     */
//    public boolean turn(PlayerCards playerCard, Deck deck, String playerName) {
//        //scanner object
//        Scanner input = new Scanner(System.in);
//        //variable to store input
//        String playerChoice = "";
//        //variable to store if player won
//        Boolean winner = false;
//        //variable to store if a player's turn is over
//        boolean isTurnEnd = false;
//
//        //print color variables:
//        final String RESET = "\033[0m";
//        final String RED = "\033[0;31m";
//        final String CYAN = "\033[0;36m";
//
//        //turn begins
//        System.out.println("");
//        System.out.println(CYAN + "***************** " + playerName + "'s turn *****************" + RESET);
//        
//        Card playerDrawnCard = deck.drawCard();
//        
//        while (isTurnEnd == false) {
//            System.out.println(playerName + "'s cards are: " + playerCard.showPlayerCard() + RESET);
//            System.out.println("");
//            
//            if (isJackQueen(playerDrawnCard) == true) {
//                System.out.println(RED + "!!!!!!!!!!!!!! " + playerName + " drew a " + playerDrawnCard.getValueString() + " of " + playerDrawnCard.getSuit() + " and is discarded!!!!!!!!!!!!!!" + RESET);
//                System.out.println(CYAN + playerName + "'s turn ends" + RESET);
//                isTurnEnd = true;
//                
//            } else {
//                System.out.println(playerName + " draws: " + playerDrawnCard.toString());
//                System.out.println("");
//                System.out.println(playerName + "'s decision:");
//
//                boolean placementCorrect = false;
//                
//                while (placementCorrect == false && isTurnEnd == false) {
//                   
//                    try {
//                        System.out.println("Please enter the slot you would like to replace(1-10) or discard(d) followed by Enter");
//                        playerChoice = input.nextLine();
//                       
//                        if (playerChoice.equalsIgnoreCase("d")) {
//                            System.out.println(CYAN + playerName + "'s turn ends" + RESET);
//                            isTurnEnd = true;
//                            
//                        } else if (Integer.parseInt(playerChoice) >= 1 && Integer.parseInt(playerChoice) <= 10) {
//                     
//                            if (checkPlayerPlacement(playerDrawnCard, Integer.parseInt(playerChoice)) == true) {
//                                Card placeholder = playerCard.replaceCard(playerDrawnCard, Integer.parseInt(playerChoice));
//                                playerDrawnCard = placeholder;
//                                placementCorrect = true;
//                                
//                            } else {
//                                System.err.println("Wrong placement! Try again!");
//                            }
//                        } else {
//                            System.err.println("*ERROR* Bad Input. Please enter (1-10) to replace or (d) to discard");
//                        }
//                    } 
//                    catch (NumberFormatException e) {
//                        System.err.println("*ERROR* Bad Input. Please enter (1-10) to replace or (d) to discard");
//                    }
//                }//end of while loop
//
//                if (playerCard.checkSequence() == true) {
//                    winner = true;
//                    isTurnEnd = true;
//                } else {
//                    winner = false;
//                }
//            }
//        }
//        return winner;
//    }

}
