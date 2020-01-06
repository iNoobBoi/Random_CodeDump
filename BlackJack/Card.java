//creates a card
public class Card {
	//card status variables
	private int value;
	public int rank;
	public int suit;
	
	//card specifics arrays
	private static String [] whatRank = {"", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; //rank array
	private static String [] whatSuit = {"", "Clubs", "Diamonds", "Hearts", "Spades"}; //suit array
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
		} //constructor
	
	public String getCardString() {
		return (whatRank[this.rank] + " of " + whatSuit[this.suit]);
		} //returns something like "Ace of Spades"
		
	public int getRank() {
		return this.rank;
		} //returns the rank of the card
	
	public int getSuit() {
		return this.suit;
		} //returns the suit of the card
	
	public int getValue() {
		if (this.rank > 10) {
			this.value = 10;
			} //sets jack, queen, and king to value 10
		else if (this.rank == 1) {
			this.value = 11;
			} //sets ace to 11 (temporarily)
		else if (this.rank == 0) {
			this.value = 1;
			} //sets small ace to 1
		else {
			this.value = rank;
			} //sets other value to themselves
		
		return this.value;
		} //returns the value of the card; jack, queen, king = 10, ace is 11 (temp)
	
	public int[] getInfo() {
		int cardInfo [] = new int[2];
		cardInfo[0] = this.suit;
		cardInfo[1] = this.rank;
		return cardInfo;
		}
	
	public void setCard(int newSuit, int newRank) {
		this.suit = newSuit;
		this.rank = newRank;
		}
	
	public void aceSmall() {
		if (this.rank == 1) {
			this.rank = 0;
			}
		}
	
	public void deleteCard() {
		this.suit = 0;
		this.rank = 0;
		} //clears data from card
	}
