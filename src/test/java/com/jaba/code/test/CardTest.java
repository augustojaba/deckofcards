package com.jaba.code.test;

import org.junit.Assert;
import org.junit.Test;

import com.jaba.code.deckofcards.Card;
import com.jaba.code.deckofcards.Rank;
import com.jaba.code.deckofcards.Suit;

public class CardTest {

	@Test(expected = RuntimeException.class)
	public void creatingCardWithRankNull() {
		new Card(null, Suit.CLUBS);
	}
	
	@Test(expected = RuntimeException.class)
	public void creatingCardWithSuitNull() {
		new Card(Rank.ACE, null);
	}
	
	@Test(expected = RuntimeException.class)
	public void creatingCardWithRankAndSuitNull() {
		new Card(null, null);
	}
	
	@Test(expected = RuntimeException.class)
	public void settingCardWithRankNull() {
		Card card = new Card(Rank.FIVE, Suit.HEARTS);
		card.setRank(null);
	}
	
	@Test(expected = RuntimeException.class)
	public void settingCardWithSuitNull() {
		Card card = new Card(Rank.QUEEN, null);
		card.setRank(null);
	}

	@Test
	public void creatingARegularCard() {
		Card card = new Card(Rank.JACK, Suit.SPADES);
		Assert.assertTrue(Rank.JACK.equals(card.getRank()) && Suit.SPADES.equals(card.getSuit()));
	}

}
