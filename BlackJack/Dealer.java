//Dealer AI
import java.util.Scanner;

public class Dealer {
	public Card dealHand[] = new Card[8]; //creates a hand of 8 cards, the largest hand possible that is allowed for a max value of 17 + 1 (2 + 2 + 2 + 2 + 3 + 3 + 3 = 17) excluding aces
	private final int maxValue = 17; //maximum value of hand in which the dealer can draw - default = 17
	private int handValue; //value of dealer's hand
	private int counter = 0; //counts the cards in hand
	private int aceNum = 0; //counts the aces in hand
	private int winNum = 21; //win number required
	
	public Dealer(int winNum) {
		this.winNum = winNum;
		}
	
	public int getHandValue() {
		for (int i = 0; i < this.counter; i++) {
			this.handValue += this.dealHand[i].getValue();
			} //repeats a loop to add together all of the card values in the hand
		return this.handValue;
		}
	
	public String getCard(int whatCard) {
		return this.dealHand[whatCard].getCardString();
		} //returns the string value of a card in the hand
	
	public int getHandSize() {
		return this.counter;
		} //returns size of dealer's hand
	
	public boolean hitOrStay() {
		if (this.handValue >= this.maxValue) {
			return false;
			}
		else {
			return true;
			}
		} //decides whether or not the dealer can keep drawing cards
	
	public void drawCard(int suit, int rank) {
		this.dealHand[this.counter].setCard(suit, rank);
		
		if (this.dealHand[this.counter].getValue() == 11) {
			if (this.handValue + 11 > this.winNum) {
				this.dealHand[this.counter].aceSmall();
				} //sets ace to 1 if the ace being 11 would cause a bust
			} //checks if the card is an ace
		
		this.counter++;
		} //sets the next available card space to have info corresponding to the parameters
	}
