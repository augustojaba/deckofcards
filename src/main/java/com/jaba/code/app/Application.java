package com.jaba.code.app;

import com.jaba.code.deckofcards.Deck;

/**
 * 
 * This class was implemented as a class to test the features
 * of the program. Here we test basically the instantiation 
 * of a new Deck and its methods of: printCurrentStatus(),
 * dealOneCard(), and shuffle(). 
 * 
 * @author Augusto Baltazar (augusto.jaba@gmail.com)
 *
 */

public class Application {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		System.out.println("============ FIRST DECK ============");
		deck.printCurrentStatus();
		
		System.out.println();
		
		System.out.println("============ DEALING CARDS ============");
		while(!deck.isEmpty()) {
			System.out.println(deck.dealOneCard() + "\t" + deck.dealOneCard() + "\t" + deck.dealOneCard() + "\t" + deck.dealOneCard());
		}
		
		System.out.println();

		System.out.println("============ AFTER DEALING ALL CARDS ============");
		deck.printCurrentStatus();
		
		deck.shuffle();
		
		System.out.println();
		
		System.out.println("============ AFTER SHUFFLING DECK ============");
		deck.printCurrentStatus();
		
		for(int i = 0; i < 40; i++) {
			deck.dealOneCard();
		}
		
		
		System.out.println();
		
		System.out.println("============ AFTER DEALING 40 CARDS ============");
		deck.printCurrentStatus();

		deck.shuffle();
		
		System.out.println();
		System.out.println();
		
		System.out.println("============ AFTER SHUFFLING WITHOUT 40 CARDS ============");
		deck.printCurrentStatus();
		
	}

}
