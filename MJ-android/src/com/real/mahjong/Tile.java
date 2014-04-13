package com.real.mahjong;

public class Tile {
	public enum Suit {Character, Bamboo, Circle, Dragon}
	public enum Color {Red, Green, White}
	public Suit suit;
	public Color color;
	public int number;
	
	public Tile(Suit suit, Color color) {
		if (suit == Suit.Dragon) {
			this.suit = suit;
			this.color = color;
		}
		else {
			System.out.println("What are you doing.");
		}
	}
	
	public Tile(Suit suit, int number) {
		if (suit != Suit.Dragon) {
			this.suit = suit;
			this.number = number;
		}
		else {
			System.out.println("Should not happen");
		}
	}
}

