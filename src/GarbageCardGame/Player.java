package GarbageCardGame;

public abstract class Player {

	private String playerID;

	/**
	 * 
	 * @param name
	 */
	public Player(String name) {
		// TODO - implement Player.Player
		throw new UnsupportedOperationException();
	}

	public String getPlayerID() {
		return this.playerID;
	}

	/**
	 * 
	 * @param playerID
	 */
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}

	public abstract void play();

}