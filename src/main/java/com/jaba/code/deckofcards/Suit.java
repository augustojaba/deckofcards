package com.jaba.code.deckofcards;

public enum Suit {
	HEARTS, SPADES, CLUBS, DIAMONDS;
	
	public String toString() {
		switch (this) {
		case HEARTS:
			return "\u2665";
		
		case SPADES:
			return "\u2660";
		
		case CLUBS:
			return "\u2663";
		
		default:
			return "\u2666";
		}
	}
}