package com.real.mahjong;
import java.util.ArrayList;

public class Hand {
	private int handCount;
	public ArrayList<Tile> tiles;
	private int score;
	public ArrayList<Tile> aside;
	
	public Hand(int num, ArrayList<Tile> tiles) {
		this.setCount(num);
		this.tiles = tiles;
		aside = new ArrayList<Tile>(num - 2);
	}

	public int getCount() {
		return handCount;
	}

	public void setCount(int handCount) {
		this.handCount = handCount;
	}
	
	public void drawFront(Deck deck) {
		Tile newTile = deck.draw();
		while (newTile.suit == Tile.Suit.HONOR) {
			score += 1;
			this.aside.add(newTile);
			newTile = deck.bDraw();
		}
		this.tiles.add(newTile);
	}
	
	public void drawBack(Deck deck) {
		Tile newTile = deck.bDraw();
		while (newTile.suit == Tile.Suit.HONOR) {
			score += 1;
			this.aside.add(newTile);
			newTile = deck.bDraw();
		}
		this.tiles.add(newTile);
	}
	
	public Tile discard(int ind) {
		return this.tiles.remove(ind);
	}
	
	public void asideThree(ArrayList<Tile> tiles) {
		for (Tile tile : tiles) {
			this.aside.add(tile);
		}
	}
	
	public void asideFour(ArrayList<Tile> tiles) {
		for (Tile tile : tiles) {
			this.aside.add(tile);
		}
		score++;
	}
	
	public void updateAside(ArrayList<Tile> tiles) {
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