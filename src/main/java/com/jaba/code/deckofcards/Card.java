package com.jaba.code.deckofcards;

/**
 * 
 * Classe responsible to implement a single card with a Rank
 * face values of Ace, 2-10, Jack, Queen, and King, and a Suit
 * Hearts, Spades, Clubs, Diamonds.
 * 
 * @author Augusto Baltazar (augusto.jaba@gmail.com)
 *
 */

public class Card {
	
	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit) {
		setRank(rank);
		setSuit(suit);
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		
		if(rank == null)
			throw new IllegalArgumentException("You must enter a non-null Rank");
		
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		
		if(suit == null)
			throw new IllegalArgumentException("You must enter a non-null Suit");
		
		this.suit = suit;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Card[" + rank + " " + suit + "]";
	}

}
