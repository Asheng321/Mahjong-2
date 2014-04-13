package mahjong;
import java.util.List;

import mahjong.Tile.Suit;

public class Hand {
	private int handCount;
	public List<Tile> tiles;
	private int numDragons;
	public List<Tile> aside;
	
	public Hand(int num, List<Tile> tiles) {
		this.setHandCount(num - 1);
		this.tiles = tiles;
	}

	public int getHandCount() {
		return handCount;
	}

	public void setHandCount(int handCount) {
		this.handCount = handCount;
	}
	
	public void drawFront(Deck deck) {
		Tile newTile = deck.draw();
		while (newTile.suit == Suit.Dragon) {
			numDragons += 1;
			this.aside.add(newTile);
			newTile = deck.bDraw();
		}
		this.tiles.add(newTile);
	}
	
	public void drawBack(Deck deck) {
		Tile newTile = deck.bDraw();
		while (newTile.suit == Suit.Dragon) {
			numDragons += 1;
			this.aside.add(newTile);
			newTile = deck.bDraw();
		}
		this.tiles.add(newTile);
	}
	
	public Tile discard(int ind) {
		return this.tiles.remove(ind);
	}
	
	public void asideThree(List<Tile> tiles) {
		for (Tile tile : tiles) {
			this.aside.add(tile);
		}
	}
	
	public void asideFour(List<Tile> tiles) {
		for (Tile tile : tiles) {
			this.aside.add(tile);
		}
	}
	
	public void updateAside(List<Tile> tiles) {
		for (Tile tile : tiles) {
			this.aside.add(tile);
		}
	}
	
	public int countAside() {
		HashMap<Tile tile, int count>
		int count = 0;
		Tile current = this.aside.peek();
		Tile next = 
		return count;
	}
	
	public int updateDragons() {
		int update = numDragons;
		numDragons = 0;
		return update;
	}
}