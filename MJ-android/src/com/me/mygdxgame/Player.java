package mahjong;

public class Player {
	public enum Direction { North, East, South, West }
	public Direction dir;
	public String name;
	public Hand hand;
	public int score;
	
	public Player(Direction dir, String name, Hand hand) {
		this.dir = dir;
		this.name = name;
		this.hand = hand;
	}
	
	public void updateScore(int lastRound) {
		this.score += this.hand.updateDragons();
		this.score += lastRound;
	}
	
}
