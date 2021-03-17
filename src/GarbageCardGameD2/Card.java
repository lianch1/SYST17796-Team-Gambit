package GarbageCardGameD2;

public abstract class Card {

	private char suit;
	private int value;
	private SUIT mySuit;
	private VALUE myValue;

	public void Deck() {
		// TODO - implement Card.Deck
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newSuit
	 * @param newValue
	 */
	public void Deck(char newSuit, int newValue) {
		// TODO - implement Card.Deck
		throw new UnsupportedOperationException();
	}

	public char getSuit() {
		return this.suit;
	}

	public int getValue() {
		return this.value;
	}

	public String getValueString() {
		// TODO - implement Card.getValueString
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Card.toString
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param deck
	 */
	public boolean compareSuit(Card deck) {
		// TODO - implement Card.compareSuit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param deck
	 */
	public boolean compareValue(Card deck) {
		// TODO - implement Card.compareValue
		throw new UnsupportedOperationException();
	}

}