//Hand
import java.util.Scanner;

public class Hand {
	public Card userHand[] = new Card[10]; //creates a hand of 10 cards, the largest hand possible that cannot bust + 1 (2 + 2 + 2 + 2 + 3 + 3 + 3 + 3 = 21) excluding aces
	private int handValue; //value of user's hand
	private int counter = 0; //counts the cards in hand
	private int winNum = 21; //win number required
	
	public Hand(int winNum) {
		this.winNum = winNum;
		}
	
	public int getHandValue() {
		int tempValue = 0;
		
		for (int i = 0; i < this.counter; i++) {
			tempValue += this.userHand[i].getValue();
			} //repeats a loop to add together all of the card values in the hand
		
		this.handValue = tempValue;
		return this.handValue;
		}
	
	public String getCard(int whatCard) {
		return this.userHand[whatCard].getCardString();
		} //returns the string value of a card in the hand
	
	public int getHandSize() {
		return this.counter;
		} //returns size of user's hand
	
	public void drawCard(int suit, int rank) {
		this.userHand[this.counter] = new Card(suit, rank);
		
		if (this.userHand[this.counter].getValue() == 11) {
			if (this.handValue + 11 > this.winNum) {
				this.userHand[this.counter].aceSmall();
				} //sets ace to 1 if the ace being 11 would cause a bust
			} //checks if the card is an ace
		
		this.counter++;
		} //sets the next available card space to have info corresponding to the parameters
	}
