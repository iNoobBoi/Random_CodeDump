//creates a card
/* DEBUG */
public class Card {
	//card status variables
	private int value;
	public int rank;
	public int suit;
	
	//card specifics arrays
	private static String [] whatRank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}; //rank array
	private static String [] whatSuit = {"Clubs", "Diamonds", "Hearts", "Spades"}; //suit array
	
	public Card(int suit, int rank) {
		//System.out.println("[Debug] [Card] Making Card [13]");
		this.suit = suit;
		this.rank = rank;
		} //constructor
	
	public String getCardString() {
		//System.out.println("[Debug] [Card] Getting Card String");
		return (whatRank[this.rank] + " of " + whatSuit[this.suit]);
		} //returns something like "Ace of Spades"
		
	public int getRank() {
		//System.out.println("[Debug] [Card] Getting Rank [24]");
		return this.rank;
		} //returns the rank of the card
	
	public int getSuit() {
		//System.out.println("[Debug] [Card] Getting Suit [29]");
		return this.suit;
		} //returns the suit of the card
	
	public int getValue() {
		if (this.rank > 9 && this.rank < 13) {
			//System.out.println("[Debug] [Card] Setting FaceCards to 10 [35]");
			this.value = 10;
			} //sets jack, queen, and king to value 10
		else if (this.rank == 0) {
			//System.out.println("[Debug] [Card] Setting High Ace [39]");
			this.value = 11;
			} //sets ace to 11 (temporarily)
		else if (this.rank == 13) {
			//System.out.println("[Debug] [Card] Setting Low Ace [43]");
			this.value = 1;
			} //sets small ace to 1
		else {
			//System.out.println("[Debug] [Card] Setting Cards [47]");
			this.value = this.rank + 1;
			} //sets other value to themselves
		
		return this.value;
		} //returns the value of the card; jack, queen, king = 10, ace is 11 (temp)
	
	public int[] getInfo() {
		//System.out.println("[Debug] [Card] Obtaining Card Info [55]");
		int cardInfo [] = new int[2];
		cardInfo[0] = this.suit;
		cardInfo[1] = this.rank;
		return cardInfo;
		}
	
	public void setCard(int newSuit, int newRank) {
		//System.out.println("[Debug] [Card] Setting Card Info [63]");
		this.suit = newSuit;
		this.rank = newRank;
		}
	
	public void aceSmall() {
		//System.out.println("[Debug] [Card] Setting Ace Small [69]");
		if (this.rank == 0) {
			this.rank = 13;
			}
		}
	}
