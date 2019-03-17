package com.jaba.code.deckofcards;

public enum Rank {
	ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
	
	private final int rank;
	
	Rank(int rank) {
		this.rank = rank;
	}
	
	public int getRank() {
		return rank;
	}

	public String toString() {
		
		switch (this) {
		case ACE:
			return "A";
		
		case JACK:
			return "J";
			
		case QUEEN:
			return "Q";
			
		case KING:
			return "K";

		default:
			return String.valueOf(rank);
		}
	}
}