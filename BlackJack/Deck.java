//Card deck
import java.util.Random;

public class Deck {
	private int counter = 0;
	Card cardDeck[] = new Card[52]; //creates a deck of 52 cards
	
	public Deck(int deckCount) {
		int deckIndex;
		
		for (int i = 0; i < deckCount; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 13; k++) {
					deckIndex = (i * 13) + j;
					this.cardDeck[deckIndex] = new Card(i, j); //creates a new card based on the values of i and j
					} //sets rank of each card to one 13 ranks
				} //sets suit of each Card to one of 4 suits
			} //creates 1 deck of each kind of card and then repeats until all of the decks are prepared
		}
	
	public void shuffleDeck() {
		int index;
		Random random = new Random();
		for (int i = 0; i < this.counter; i++) {
			index = random.nextInt(i + 1);
			if (index != i) {
				this.cardDeck[index] = this.cardDeck[i];
				this.cardDeck[i] = this.cardDeck[index];
				this.cardDeck[index] = this.cardDeck[i];
				}
			}
		} //shuffles the deck
	
	public Card drawCard() {
		this.counter++;
		return cardDeck[this.counter - 1];
		} //returns the first card from the card deck and sets the "first card" to the next index.
	}
