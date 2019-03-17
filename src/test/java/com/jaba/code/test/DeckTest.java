package com.jaba.code.test;

import org.junit.Assert;
import org.junit.Test;

import com.jaba.code.deckofcards.Card;
import com.jaba.code.deckofcards.Deck;

public class DeckTest {

	@Test(expected = RuntimeException.class)
	public void deal53Cards() {
		Deck deckTest = new Deck();
		
		for(int i=1; i <= 53; i++) {
			deckTest.dealOneCard();
		}
	}
	
	@Test
	public void testDeckIsNotEmpty() {
		Deck deckTest = new Deck();
		Assert.assertFalse(deckTest.isEmpty());
	}
	
	@Test
	public void testDeckIsEmpty() {
		Deck deckTest = new Deck();
		
		for(int i=1; i <= 52; i++) {
			deckTest.dealOneCard();
		}
		
		Assert.assertTrue(deckTest.isEmpty());
	}
	
	@Test
	public void testAfterShuffleDeck() {
		Deck deckTest = new Deck();
		deckTest.dealOneCard();
		deckTest.shuffle();
		Assert.assertEquals(52, deckTest.getDeck().length);
	}
	
	@Test
	public void afterDealOneCardCheckCard() {
		Deck deckTest = new Deck();
		Card cardDealed = deckTest.dealOneCard();
		Assert.assertTrue(cardDealed != null && cardDealed.getRank() != null && cardDealed.getSuit() != null);
	}

}
