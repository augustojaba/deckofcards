# deckofcards

This repository was created to implement the Deck of Cards Problem.

This is a simple implementation that is composed by two main classes Deck and Card, as well as enum classes for Rank and Suit, also by an Application class showing the main features of the project along with two classes for unit tests, which were created during the coding phase.

# Card
Class responsible to implement a single card with a Rank face values of Ace, 2-10, Jack, Queen, and King, and a Suit Hearts, Spades, Clubs, Diamonds.

# Deck
Class responsible to implement the Deck of 52 playing cards. With a method to shuffle (create a new deck and shuffle it), also a method to dealOneCard retrieves the card that is in the last position of the deck. Also, an auxiliary method to print the deck.

# Application
This class was implemented as a class to test the features of the program. Here we test basically the instantiation of a new Deck and its methods of: printCurrentStatus(), dealOneCard(), and shuffle().
