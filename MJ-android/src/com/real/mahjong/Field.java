package com.real.mahjong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import com.real.mahjong.Deck.DeckType;

public class Field {
	private int handSize = 14;
	public Deck deck;
	public Tile currDiscard;
	private Vector<Player> players = new Vector<Player>(4);
	public Field()
	{
		List<Player.Direction> dirs = Arrays.asList(Player.Direction.NORTH,
				Player.Direction.SOUTH, Player.Direction.EAST, Player.Direction.WEST);
		Random generator = new Random();
		Vector<Player.Direction> randDirs = new Vector<Player.Direction>(4);
		for(int i = 0; i < 4; ++i)
		{
			randDirs.add(dirs.remove(generator.nextInt(dirs.size())));
		}
		deck = new Deck(DeckType.BASIC);
		for (int i = 0; i < players.capacity(); ++i)
		{
			ArrayList<Tile> t = new ArrayList<Tile>(handSize);
			for(int j = 0; j < handSize - 1; ++j)
			{
				t.add(deck.draw());
			}
			Hand h = new Hand(handSize, t);
			players.add(new Player(randDirs.get(i), "", h));
		}
	}
	
	public void cleanup()
	{
		for (Player pl : players)
		{
			pl.emptyHand(handSize);
		}
	}
	
	public Vector<Player> getPlayers()
	{
		return players;
	}
}
