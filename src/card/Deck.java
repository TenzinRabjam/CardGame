package card;
/********************************************************
*
* Project : A08a - Enumerations 
* File : Deck.java 
* Name : Diego Ciulupa
* Ciulupa Date : 12/08/2018
*
*
********************************************************/
import java.util.ArrayList;

import card.Card.Rank;
import card.Card.Suit;

public class Deck 
{

	public static int numSuits = 4;
	public static int numRanks = 13;
	public static int numCards = numSuits * numRanks;
	private ArrayList<Card> deck = new ArrayList<Card>(Suit.values().length * Rank.values().length);

	private Card[][] cards;
	
	public Deck() 
	{
		for (Suit suit : Suit.values())
			for (Rank rank : Rank.values())
				deck.add(new Card(rank, suit));
	}// end of deck()

	
	public void display() 
	{
		int points = 0;
		for (Card card : deck) 
		{
			points = card.getRank().getFaceValue();
			if (points > 10) 
			{
				points = 10;
			}
			System.out.println(card + " is worth " + points + " points"); 
		} 
	}// end display()
} //end Deck