package card;

/********************************************************
 *
 * Project : A08a - Enumerations 
 * File : Card.java 
 * Name : Diego Ciulupa
 * Ciulupa Date : 12/08/2018
 *
 *
 ********************************************************/
public class Card 
{

	// enum of suit
	public enum Suit 
	{
		DIAMONDS, 
		CLUBS, 
		HEARTS, 
		SPADES;
	}

	// enum of Ranks
	public enum Rank 
	{
		ACE(1), 
		DEUCE(2), 
		THREE(3), 
		FOUR(4), 
		FIVE(5), 
		SIX(6), 
		SEVEN(7), 
		EIGHT(8), 
		NINE(9), 
		TEN(10), 
		JACK(11), 
		QUEEN(12), 
		KING(13);

		int faceValue1;

		Rank(int faceValue) 
		{
			this.faceValue1 = faceValue;
		}

		int faceValue;

		int getFaceValue() 
		{
			return faceValue1;
		}
	}

	private final Suit suit;
	private final Rank rank;

	Card(Rank rank, Suit suit) 
	{
		this.rank = rank;
		this.suit = suit;
	}

	public Suit getSuit() 
	{
		return suit;
	}

	public Rank getRank() 
	{
		return rank;
	}

	@Override
	public String toString() 
	{
		return "The " + rank + " of " + suit + "";
	}

} //end Card
