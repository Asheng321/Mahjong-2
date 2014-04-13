package com.real.mahjong;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Deck {
	public enum DeckType { Basic }
	public DeckType deckType;
	public LinkedList<Tile> deck;
	
	public Deck(DeckType deckType) {
		this.deckType = deckType;
		shuffle();
	}

	private void shuffle() {
		this.deck = new LinkedList<Tile>(); 
		ArrayList<Tile> toShuffle = new ArrayList<Tile>();
		switch(deckType)
		{
			default:
				for(Tile.Suit currSuit = Tile.Suit.CHARACTER; currSuit != null; currSuit.next())
				{
					if(currSuit != Tile.Suit.HONOR)
					{
						for(int i = 0; i < 9; ++i)
						{
							for(int j = 0; j < 4; ++j)
							{
								Tile newTile = new Tile(currSuit, i);
								deck.add(newTile);
							}
						}
					}
					else
					{
						for(Tile.HonorType currType = Tile.HonorType.GREEN; currType != null; currType.next())
						{
							for(int i = 0; i < 4; ++i)
							{
								Tile newTile = new Tile(currSuit, currType);
								deck.add(newTile);
							}
						}
					}
				}
				break;
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
