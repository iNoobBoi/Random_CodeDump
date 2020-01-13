//Card deck
/* DEBUG */
import java.util.Random;

public class Deck {
	public int counter = 0;
	public int deckSize = 0;
	Card cardDeck[] = new Card[52]; //creates a deck of 52 cards
	
	public Deck(int deckCount) {
		//System.out.println("[Debug] [Deck] Making Deck [10]");
		int deckIndex = 0;
		
		for (int i = 0; i < deckCount; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 13; k++) {
					this.cardDeck[deckIndex] = new Card(j, k); 
         			//System.out.println("[Debug] [Deck] Card Index: " + deckIndex);
          			//System.out.println("[Debug] [Deck] Card made: Suit: " + cardDeck[deckIndex].getSuit());
         			//System.out.println("[Debug] [Deck] Card made: Suit: " + cardDeck[deckIndex].getRank());
         			//creates a new card based on the values of i and j
         			deckIndex++;
					deckSize++;
					} //sets rank of each card to one 13 ranks
				} //sets suit of each Card to one of 4 suits
			} //creates 1 deck of each kind of card and then repeats until all of the decks are prepared
		}
	
	public void shuffleDeck() {
		Random random = new Random();
		//System.out.println("[Debug] [Deck] Shuffling Deck [25]"); 
		Card temp;
		for(int i = 0; i < 1000; i++) {
			//System.out.println("[Debug] [Deck] Swapping Card Positions [29]");
			int posOne = random.nextInt(deckSize - 1);
			int posTwo = random.nextInt(deckSize - 1);
			temp = this.cardDeck[posTwo];
			this.cardDeck[posTwo] = this.cardDeck[posOne];
			this.cardDeck[posOne] = temp;
			} //swaps random card indexes in the deck
		} //shuffles the deck
	
	public Card drawCard() {
		//System.out.println("[Debug] [Deck] Drawing Card [41]");
		this.counter++;
		return this.cardDeck[this.counter - 1];
		} //returns the first card from the card deck and sets the "first card" to the next index.
	
	public int getDeckSize() {
		return this.deckSize;
		}
	
	public Card getCard(int cardIndex) {
		return this.cardDeck[cardIndex];
		}
	}

  
