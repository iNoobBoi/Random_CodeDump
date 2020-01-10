//handles user interface and calls functions
import java.util.Scanner;

public class javaProject_ProjectTwo {
	public static void main(String []args) {
		/* VARIABLES */
		boolean win = false;
		boolean bust = false;
		boolean keepGoing = true;
		
		int cardInfo[] = new int[2]; //array to store the info of the cards drawn
		
		int deckCount = 1; //number of decks the user will be playing with
		int winNum = 21; //number of achieving blackjack
		int bustNum = 22; //number or higher which you will achieve bust
		
		int dealFinal = 0; //final score of dealer
		int userFinal = 0; //final score of user
		
		int userWins = 0; //number of wins the user has
		int dealWins = 0; //number of wins the dealer has
		int tieCount = 0; //number of times user has tied with the dealer
		
		String playAgain = ""; //whether or not the user wants to play again
		String cpuResponse = ""; //cpu's response to user
		
		String userHit = ""; //user either hits or stays
		boolean conTinue = true; //whether or not the loop keeps going
		
		/* INTRODUCTION */
		System.out.print("Hello! What is your name? ");
		Scanner input = new Scanner(System.in);
		String userName = input.nextLine();
	
		System.out.print("Hello " + userName + "!\nFor the duration of this program, I would request you to only enter lowercase characters.\nWould you like to play some BlackJack? ");
		
		for (int j = 0; j > -1; j++) {
			Scanner inPut = new Scanner(System.in);
			String userResponse = inPut.nextLine();
			if (userResponse.equals("yes")) {
				cpuResponse = "Great! Let's get started.";
				}
			else if (userResponse.equals("no")) {
				cpuResponse = "Well, we're going to play anyway. Let's get started.";
				}
			else {
				System.out.println(userResponse + " is an incorrect input. Please enter \"yes\" or \"no\" in lowercase letters to continue.");
				}
		} //infinite loop until correct input
	
		System.out.println(cpuResponse);
		System.out.println("[System] Beginning Game");
		
		for (int i = 0; i > -1; i++) {
			/* SETUP */
			System.out.println("[System] Shuffling Deck");
			Deck cardDeck = new Deck(deckCount); //creates the shuffled card deck
		
			System.out.println("[System] Preparing Hands");
			Hand user = new Hand(winNum); //creates the user hand
		
			System.out.println("[System] Preparing Dealer AI");
			Dealer dealer = new Dealer(winNum); //creates the dealer hand
	
			System.out.println("[System] Dealing Cards");
			cardInfo = cardDeck.drawCard().getInfo().clone();
			dealer.drawCard(cardInfo[0], cardInfo[1]); //one card to dealer
		
			cardInfo = cardDeck.drawCard().getInfo().clone();
			dealer.drawCard(cardInfo[0], cardInfo[1]); //second card to dealer
		
			cardInfo = cardDeck.drawCard().getInfo().clone();
			user.drawCard(cardInfo[0], cardInfo[1]); //one card to user
		
			cardInfo = cardDeck.drawCard().getInfo().clone();
			user.drawCard(cardInfo[0], cardInfo[1]); //second card to user
		
			System.out.println("[System] Starting Game");
			System.out.println("Welcome to BlackJack. The goal is for your hand value to reach " + winNum + ". Getting over " + winNum + ", however, makes you lose. You will play against the dealer, an automatic CPU.");
			System.out.println("Reaching exactly " + winNum + " is essentially an instant win. When scoring, the person with the hand value closest to " + winNum + " wins.");
			System.out.println("Aces can either count as 1 or 11. When being added to either yours or the dealer's hand, the program will see if the ace being 11 will cause you to bust. If not, the ace will remain as 11. If so, the ace will be set to 1.");
		
			System.out.println("Get ready!");
			System.out.println("[System] Ready");
		
			System.out.println("The dealer's cards are the " + dealer.getCard(0) + " and a private card.");
			System.out.println("You have the " + user.getCard(0) + " and the " + user.getCard(1) + ". Your hand value is " + user.getHandValue());
		
			/* USER'S TURN */
			while (user.getHandValue() <= winNum && conTinue == true) {
				System.out.println("Hit or Stay?");
				Scanner iNput = new Scanner(System.in);
				userHit = iNput.nextLine();
				conTinue = true;
			
				if (userHit == "stay") {
					conTinue = false;
					}
				else if (userHit == "hit") {
					cardInfo = cardDeck.drawCard().getInfo().clone();
					user.drawCard(cardInfo[0], cardInfo[1]);
				
					System.out.println("[System] You have drawn the " + user.getCard(user.getHandSize() - 1));
				
					System.out.println("[System] Your hand value is now " + user.getHandValue());
					}
				else {
					System.out.println("[System] Invalid input.");
					}
				} //loops until you get a blackjack, you bust, or you stay
		
			System.out.println("[System] Your cards: ");
			for (int k = 0; k < user.getHandSize(); k++) {
				System.out.println(user.getCard(k) + "\n");
				} //prints out all of the user's cards
		
			System.out.println("[System] Your hand value is " + user.getHandValue());
		
			if (user.getHandValue() == winNum) {
				System.out.println("You have achieved BLACKJACK! Unless the dealer also achieves BLACKJACK, you have won.");
				}
			else if (user.getHandValue() > winNum) {
				System.out.println("You have BUSTED. Unless the dealer busts even more than you, you have lost.");
				}
		
			/* DEALER'S TURN */
			System.out.println("The dealer's cards are the " + dealer.getCard(0) + " and the " + dealer.getCard(1));
		
			while (dealer.hitOrStay() == true) {
				cardInfo = cardDeck.drawCard().getInfo().clone();
				dealer.drawCard(cardInfo[0], cardInfo[1]);
			
				System.out.println("[System] The dealer has drawn the " + dealer.getCard(dealer.getHandSize() - 1));
			
				System.out.println("[System] The dealer's hand value is now " + dealer.getHandValue());
				} //draws cards until dealer's hand is over the max hand value
		
			System.out.println("[System] The dealer's cards: ");
			for (int l = 0; l < dealer.getHandSize(); l++) {
				System.out.println(dealer.getCard(l) + "\n");
				} //prints out all of the dealer's cards
		
			System.out.println("[System] The dealer's hand value is " + dealer.getHandValue());
		
			if (dealer.getHandValue() > winNum) {
				System.out.println("The dealer has BUSTED with a score of " + dealer.getHandValue());
				} //detects bust
			else if (dealer.getHandValue() == winNum) {
				System.out.println("The dealer has achieved BLACKJACK!");
				} //detects blackjack
		
			dealFinal = winNum - dealer.getHandValue();
			userFinal = winNum - user.getHandValue();
		
			/* SCORING */
			if (userFinal == 0 && dealFinal != 0) {
				System.out.println("You have WON! You have achieved BLACKJACK! The dealer had a score of " + dealer.getHandValue());
				userWins++;
				} //if you blackjacked and the dealer does not
			else if (dealFinal == 0 && userFinal != 0) {
				System.out.println("You have LOST! The dealer has achieved BLACKJACK! You had a score of " + user.getHandValue());
				dealWins++;
				} //if the dealer blackjacked and you have not
			else if (dealFinal == userFinal) {
				System.out.println("You have TIED with the dealer. You both had a score of " + user.getHandValue());
				} //if your score was identical to the dealer's
			else if (userFinal < 0 && dealFinal < 0 && userFinal > dealFinal) {
				System.out.println("You have WON! Your score of " + user.getHandValue() + " was closer to " + winNum + " than the dealer's score of " + dealer.getHandValue());
				userWins++;
				} //if you busted less than the dealer
			else if (dealFinal < 0 && userFinal < 0 && dealFinal > userFinal) {
				System.out.println("You have LOST! Your score of " + user.getHandValue() + " was farther from " + winNum + " than the dealer's score of " + dealer.getHandValue());
				dealWins++;
				} //if the dealer busted less than you
			else if (dealFinal < 0 && userFinal > 0) {
				System.out.println("You have WON! You had a score of " + user.getHandValue() + ". The dealer busted with a score of " + dealer.getHandValue());
				userWins++;
				} //if the dealer busted and you did not
			else if (userFinal < 0 && dealFinal > 0) {
				System.out.println("You have LOST! You busted with a score of " + user.getHandValue() + ". The dealer had a score of " + dealer.getHandValue());
				dealWins++;
				} //if you busted and the dealer did not
			else if (userFinal < dealFinal) {
				System.out.println("You have WON! You had a score of " + user.getHandValue() + ". The dealer had a score of " + dealer.getHandValue());
				userWins++;
				} //if your score is closer to the win number
			else if (dealFinal < userFinal) {
				System.out.println("You have LOST! You had a score of " + user.getHandValue() + ". The dealer had a score of " + dealer.getHandValue());
				dealWins++;
				} //if the dealer's score is closer to the win number
			else {
				System.out.println("[System] Error. Your score of " + user.getHandValue() + " and the dealer's score of " + dealer.getHandValue() + " do not match any of the specified win conditions. This will be counted as a tie.");
				tieCount++;
				}
		
			System.out.println("[System] You have " + userWins + ". The dealer has " + dealWins + ". You have tied with the dealer " + tieCount + " times.");
			System.out.println("[System] Do you want to play again?");
		
			Scanner INput = new Scanner(System.in);
			playAgain = INput.nextLine();
		
			if(playAgain == "no") {
				System.out.println("[System] Thank you for playing Java BlackJack.");
				break;
				}
			else {
				System.out.println("[System] Let's play again!");
				}
			}
		}
	}
