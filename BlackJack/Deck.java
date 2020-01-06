//Card deck
import java.util.Random;

public class Deck {
	private int newDeck;
	private int counter = 0;
	Card cardDeck[] = new Card[this.newDeck]; //creates a deck of 52 cards
	
	public Deck(int deckCount) {
		this.newDeck = 52 * deckCount;
		
		int deckIndex;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				deckIndex = i * j;
				this.cardDeck[deckIndex - 1].setCard(i, j); //sets the card in 
				} //sets rank of each card to one 13 ranks
			} //sets suit of each Card to one of 4 suits
		}
	
	public void shuffleDeck() {
		int index;
		Random random = new Random();
		for (int i = 0; i < this.cardDeck[].length(); i++) {
			index = random.nextInt(i + 1);
			if (index != i) {
				this.cardDeck[index] ^= this.cardDeck[i];
				this.cardDeck[i] ^= this.cardDeck[index];
				this.cardDeck[index] ^= this.cardDeck[i];
				}
			}
		} //shuffles the deck
	
	public Card drawCard() {
		this.counter++;
		return cardDeck[this.counter - 1];
		} //returns the first card from the card deck and sets the "first card" to the next index.
	}
