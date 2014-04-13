package com.real.mahjong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {
	public enum DeckType { Basic }
	public DeckType deckType;
	public LinkedList<Tile> deck;
	
	public Deck(DeckType deckType) {
		this.deckType = deckType;
		shuffle(deckType);
	}	

	private void shuffle(DeckType deckType) {
		this.deck = new LinkedList<Tile>(); 
		ArrayList<Tile> toShuffle = new ArrayList<Tile>();
		if (deckType == DeckType.Basic) {
			List<Tile.Suit> suits = Arrays.asList(Tile.Suit.Bamboo, 
				Tile.Suit.Character, Tile.Suit.Circle);
			for (Tile.Suit suit : suits) {
				for (int i = 1; i < 10; i++) {
					Tile newTile = new Tile(suit, i);
					toShuffle.add(newTile);
					toShuffle.add(newTile);
					toShuffle.add(newTile);
					toShuffle.add(newTile);
				}
			}
		}
		while (!(toShuffle.isEmpty())) {
			Random ran = new Random();
			int x = ran.nextInt(toShuffle.size()-1);
			Tile rem = toShuffle.remove(x);
			this.deck.add(rem);
		}
	}
	
	public Tile draw() {
		return this.deck.removeFirst();
	}
	
	public Tile bDraw() {
		return this.deck.removeLast();
	}
}
