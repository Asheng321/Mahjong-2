package com.real.mahjong;

import java.util.Stack;

public class Player {
	public enum Direction { North, East, South, West }
	private Direction dir;
	private String name;
	private Hand hand;
	private int score;
	private Stack<Tile> discard;
	
	public Player(Direction dir, String name, Hand hand) {
		this.dir = dir;
		this.name = name;
		this.hand = hand;
	}
	
	public void updateScore(int lastRound) {
		this.score += this.hand.updateScore();
		this.score += lastRound;
	}
	
	public int getScore(){
		return score;
	}
	
	public void setDir(Direction currDir)
	{
		dir = currDir;
	}
	
	public Direction getDir()
	{
		return dir;
	}
	
	public void setName(String playerName)
	{
		name = playerName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Hand getHand()
	{
		return hand;
	}
	
	public void addToDiscard(Tile newDiscard)
	{
		discard.add(newDiscard);
	}
	
	public Tile getLastDiscard()
	{
		return discard.peek();
	}
}
