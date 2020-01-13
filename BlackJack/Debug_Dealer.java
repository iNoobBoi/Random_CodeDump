//Dealer AI
/* DEBUG */
import java.util.Scanner;

public class Dealer {
	public Card dealHand[] = new Card[8]; //creates a hand of 8 cards, the largest hand possible that is allowed for a max value of 17 + 1 (2 + 2 + 2 + 2 + 3 + 3 + 3 = 17) excluding aces
	private final int maxValue = 17; //maximum value of hand in which the dealer can draw - default = 17
	private int handValue; //value of dealer's hand
	private int counter = 0; //counts the cards in hand
	private int aceNum = 0; //counts the aces in hand
	private int winNum = 21; //win number required
	
	public Dealer(int winNum) {
		//System.out.println("[Debug] [Dealer] Making Dealer [14]");
		this.winNum = winNum;
		}
	
	public int getHandValue() {
    int tempValue = 0;
		//System.out.println("[Debug] [Dealer] Getting Hand Value [19]");
		for (int i = 0; i < this.counter; i++) {
			//System.out.println("[Debug] [Dealer] Getting DealHand Value [21]");
			tempValue += this.dealHand[i].getValue();
			} //repeats a loop to add together all of the card values in the hand
    this.handValue = tempValue;
		return this.handValue;
		}
	
	public String getCard(int whatCard) {
		//System.out.println("[Debug] [Dealer] Getting Specified Card [28]");
		return this.dealHand[whatCard].getCardString();
		} //returns the string value of a card in the hand
	
	public int getHandSize() {
		//System.out.println("[Debug] [Dealer] Getting Hand Size [33]");
		return this.counter;
		} //returns size of dealer's hand
	
	public boolean hitOrStay() {
		//System.out.println("[Debug] [Dealer] Deciding To Hit Or Stay[38]");
		if (this.handValue >= this.maxValue) {
			return false;
			}
		else {
			return true;
			}
		} //decides whether or not the dealer can keep drawing cards
	
	public void drawCard(int suit, int rank) {
		//System.out.println("[Debug] [Dealer] Getting New Card [48]");
		this.dealHand[this.counter] = new Card(suit, rank);
		
		//System.out.println("[Debug] [Dealer] Configuring Deal Ace [51]");
		if (this.dealHand[this.counter].getValue() == 11) {
			if (this.handValue + 11 > this.winNum) {
				this.dealHand[this.counter].aceSmall();
				} //sets ace to 1 if the ace being 11 would cause a bust
			} //checks if the card is an ace
		
		this.counter++;
		} //sets the next available card space to have info corresponding to the parameters
	}