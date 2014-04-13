package com.real.mahjong;

public class Tile {
	public enum Suit {CHARACTER, BAMBOO, CIRCLE, HONOR {
        @Override
        public Suit next() {
            return null;
        };
	};
        public Suit next(){
    		return values()[ordinal() + 1];
    	}}
	
	public enum HonorType {RED, GREEN, WHITE{
        @Override
        public HonorType next() {
            return null;
        };
	};
        public HonorType next(){
    		return values()[ordinal() + 1];
    	}}
	public Suit suit;
	public HonorType color;
	public int number;
	
	public Tile(Suit suit, HonorType color) {
		if (suit == Suit.HONOR || suit != null || color != null)
		{
			this.suit = suit;
			this.color = color;
		}
		else {
			System.out.println("What are you doing.");
		}
	}
	
	public Tile(Suit suit, int number) {
		if (suit != Suit.HONOR || suit != null || color != null)
		{
			this.suit = suit;
			this.number = number;
		}
		else {
			System.out.println("Should not happen");
		}
	}
}

