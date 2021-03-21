package GarbageCardGame;

public abstract class Card {

    private enum value {
        DEUCE,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }

    private enum suits {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }

//	public char getSuit() {
//		return this.suit;
//	}
//
//	public int getValue() {
//		return this.value;
//	}
//
//	public String getValueString() {
//		// TODO - implement Card.getValueString
//		throw new UnsupportedOperationException();
//	}
//
//	public String toString() {
//		// TODO - implement Card.toString
//		throw new UnsupportedOperationException();
//	}
//
//
//	public boolean compareSuit(Card deck) {
//		// TODO - implement Card.compareSuit
//		throw new UnsupportedOperationException();
//	}
//
//
//	public boolean compareValue(Card deck) {
//		// TODO - implement Card.compareValue
//		throw new UnsupportedOperationException();
//	}
}
