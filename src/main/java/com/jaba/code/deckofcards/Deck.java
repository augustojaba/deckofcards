package com.jaba.code.deckofcards;

import java.util.Random;

/**
 * 
 * Classe responsible to implement the Deck of 52 playing cards.
 * With a method to shuffle (create a new deck and shuffle it),
 * also a methid to dealOneCard retrieves the card that is in the
 * last position of the deck. Also, an auxiliary method to print the deck.
 * 
 * @author Augusto Baltazar (augusto.jaba@gmail.com)
 *
 */

public class Deck {
	
	//Max quantity of cards on the deck is #suits(4) x #ranks(13) = 52
	private static final int MAX_CARDS = 52;
	
	private Card[] cards;
	private int topDeck;
	
	public Deck() {
		shuffle();
	}

	/**
	 * This method to shuffle is using java.util.Random to generate a random
	 * position. I have implemented an well-known and simple algorithm to shuffle,
	 * its called Fisher-Yates Algorithm, which ensure that every permutation of 
	 * array element is equally likely. 
	 */
	public void shuffle() {
		Random randomGen = new Random();
		
		restartDeck();
		
		for (int i = cards.length - 1; i > 0 ; i--) {
			int randomPlace = randomGen.nextInt(i + 1);
			Card swap = cards[i];
			cards[i] = cards[randomPlace];
			cards[randomPlace] = swap;
		}
	}
	
	public void restartDeck() {
		
		cards = new Card[getMaxCards()];
		int i = 0;
		
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				cards[i++] = new Card(rank, suit);
			}
		}
		
		topDeck = cards.length - 1;
	}
	
	public Card[] getDeck() {
		return cards;
	}
	
	public int getMaxCards() {
		return MAX_CARDS;
	}
	
	public boolean isEmpty() {
		return topDeck < 0;
	}
	
	public Card dealOneCard() {
		if(!isEmpty()) {
			Card cardDealed = cards[topDeck]; 
			cards[topDeck--] = null;
			return cardDealed;
		} else {
			throw new RuntimeException("The deck is empty");
		}
	}
	
	public void printCurrentStatus() {
		if(isEmpty()) {
			System.out.println("The deck is empty");
		} else {
			int i = 0;
			
			for (int j = topDeck; j >= 0; j--) {
				if(i < 3) {
					System.out.print(cards[j] + "\t");
					i++;
				} else {
					System.out.println(cards[j]);
					i = 0;
				}
			}
		}
	}

}
