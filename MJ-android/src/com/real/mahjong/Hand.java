package com.real.mahjong;
import java.util.List;

public class Hand {
	private int handCount;
	public List<Tile> tiles;
	private int score;
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
		while (newTile.suit == Tile.Suit.Dragon) {
			score += 1;
			this.aside.add(newTile);
			newTile = deck.bDraw();
		}
		this.tiles.add(newTile);
	}
	
	public void drawBack(Deck deck) {
		Tile newTile = deck.bDraw();
		while (newTile.suit == Tile.Suit.Dragon) {
			score += 1;
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
		score++;
	}
	
	public void updateAside(List<Tile> tiles) {
		for (Tile tile : tiles) {
			this.aside.add(tile);
		}
	}
	
	public int updateScore() {
		int update = score;
		score = 0;
		return update;
	}
}