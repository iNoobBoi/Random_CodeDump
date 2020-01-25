//handles user interface and calls functions
/* DEBUG */
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		/* VARIABLES */
		//System.out.println("[Debug] [Main] Writing Variables [8]");
		int cardInfo[] = {0, 0}; //array to store the info of the cards drawn
		
		int deckCount = 1; //number of decks the user will be playing with
		int winNum = 21; //number of achieving blackjack
		
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
		//System.out.println("[Debug] [Main] Starting [28]");
		System.out.print("Hello! What is your name? ");
		Scanner input = new Scanner(System.in);
		String userName = input.nextLine();
	
		System.out.print("Hello " + userName + "!\nFor the duration of this program, I would request you to only enter lowercase characters.\nWould you like to play some BlackJack? ");
		
		//System.out.println("[Debug] [Main] Entering Infinite Loop [35]");
		for (int j = 0; j > -1; j++) {
			//System.out.println("[Debug] [Main] Loop Initiated [37]");
			Scanner inPut = new Scanner(System.in);
			String userResponse = inPut.nextLine();
			if (userResponse.equals("yes")) {
				cpuResponse = "Great! Let's get started.";
				//System.out.println("[Debug] [Main] Response: yes [42]");
				j = -2;
				}
			else if (userResponse.equals("no")) {
				//System.out.println("[Debug] [Main] Response: no [46]");
				cpuResponse = "Well, we're going to play anyway. Let's get started.";
				j = -2;
				}
			else {
				//System.out.println("[Debug] [Main] Response: invalid [51]");
				//System.out.println(userResponse + " is an incorrect input. Please enter \"yes\" or \"no\" in lowercase letters to continue.");
				}
		} //infinite loop until correct input
	
		System.out.println(cpuResponse);
		System.out.println("[System] Beginning Game");
		//System.out.println("[Debug] [Main] Entering Game Loop [58]");
		
		for (int i = 0; i > -1; i++) {
			/* SETUP */
			System.out.println("[System] Preparing Deck");
		//	System.out.println("[Debug] [Main] Making Deck [63]");
			Deck cardDeck = new Deck(deckCount); //creates the card deck
			//System.out.println("[Debug] [Main] Shuffling Deck [65]");
			cardDeck.shuffleDeck(); //shuffles the card deck
			
			System.out.println("Deck Contents: ");
			for (int q = 0; q < cardDeck.getDeckSize(); q++) {
				System.out.println(cardDeck.getCard(q).getCardString());
				}
			
			//System.out.println("[Debug] [Main] Making Hand [68]");
			System.out.println("[System] Preparing Hands");
			Hand user = new Hand(winNum); //creates the user hand
		
			//System.out.println("[Debug] [Main] Making Dealer [72]");
			System.out.println("[System] Preparing Dealer AI");
			Dealer dealer = new Dealer(winNum); //creates the dealer hand
	
			//System.out.println("[Debug] [Main] Duplicating Drawn Card Info To cardInfo Array (Dealer) [76]");
			System.out.println("[System] Dealing Cards");
			cardInfo = cardDeck.drawCard().getInfo().clone(); //draws a card from the deck, gets the info from the card in an array, then clones that info to the cardInfo array
			//System.out.println("[Debug] [Main] Writing cardInfo As Drawn Card [79]");
			dealer.drawCard(cardInfo[0], cardInfo[1]); //gives one card to dealer
		
			//System.out.println("[Debug] [Main] Duplicating Drawn Card Info To cardInfo Array (Dealer) [82]");
			cardInfo = cardDeck.drawCard().getInfo().clone();
			//System.out.println("[Debug] [Main] Writing cardInfo As Drawn Card [84]");
			dealer.drawCard(cardInfo[0], cardInfo[1]); //gives second card to dealer
		
			//System.out.println("[Debug] [Main] Duplicating Drawn Card Info to cardInfo Array (User) [87]");
			cardInfo = cardDeck.drawCard().getInfo().clone();
			//System.out.println("[Debug] [Main] Writing cardInfo As Drawn Card [89]");
			user.drawCard(cardInfo[0], cardInfo[1]); //gives one card to user
		
			//System.out.println("[Debug] [Main] Duplicating Drawn Card Info to cardInfo Array (User) [92]");
			cardInfo = cardDeck.drawCard().getInfo().clone();
			//System.out.println("[Debug] [Main] Writing cardInfo As Drawn Card [94]");
			user.drawCard(cardInfo[0], cardInfo[1]); //gives second card to user
		
			System.out.println("[System] Starting Game");
			System.out.println("Welcome to BlackJack. The goal is for your hand value to reach " + winNum + ". Getting over " + winNum + ", however, makes you lose. You will play against the dealer, an automatic CPU.");
			System.out.println("Reaching exactly " + winNum + " is essentially an instant win. When scoring, the person with the hand value closest to " + winNum + " wins.");
			System.out.println("Aces can either count as 1 or 11. When being added to either yours or the dealer's hand, the program will see if the ace being 11 will cause you to bust. If not, the ace will remain as 11. If so, the ace will be set to 1.");
		
			System.out.println("Get ready!");

			System.out.println("The dealer's cards are the " + dealer.getCard(0) + " and a private card.");
			System.out.println("You have the " + user.getCard(0) + " and the " + user.getCard(1) + ". Your hand value is " + user.getHandValue());
		
			/* USER'S TURN */
			System.out.println(userName + ", it is your turn.");
			
			//System.out.println("[Debug] [Main] Entering UserLoop [111]");
			while (user.getHandValue() <= winNum && conTinue == true) {
				System.out.println("Hit or Stay?");
				Scanner iNput = new Scanner(System.in);
				userHit = iNput.nextLine();
				conTinue = true;
			
				//System.out.println("[Debug] [Main] Handling User Response [118]");
				if (userHit.equals("stay")) {
					conTinue = false;
					}
				else if (userHit.equals("hit")) {
					//System.out.println("[Debug] [Main] Drawing Card [123]");
					cardInfo = cardDeck.drawCard().getInfo().clone();
					user.drawCard(cardInfo[0], cardInfo[1]);
				
					System.out.println("[System] You have drawn the " + user.getCard(user.getHandSize() - 1));
				
					System.out.println("[System] Your hand value is now " + user.getHandValue());
					}
				else {
					System.out.println("[System] Invalid input.");
					}
				} //loops until you get a blackjack, you bust, or you stay
		
			//System.out.println("[Debug] [Main] Writing Cards [136]");
			System.out.println("[System] Your cards: ");
			for (int k = 0; k < user.getHandSize(); k++) {
			//	System.out.println("[Debug] [Main] Writing Card [139]");
				System.out.println(user.getCard(k) + "\n");
				} //prints out all of the user's cards
		
			//System.out.println("[Debug] [Main] Handling User Hand [143]");
			System.out.println("[System] Your hand value is " + user.getHandValue());
		
			if (user.getHandValue() == winNum) {
				System.out.println("You have achieved BLACKJACK! Unless the dealer also achieves BLACKJACK, you have won.");
				}
			else if (user.getHandValue() > winNum) {
				System.out.println("You have BUSTED. Unless the dealer busts even more than you, you have lost.");
				}
			
			System.out.println(userName + ", your turn has ended.");
		
			/* DEALER'S TURN */
			System.out.println("It is the dealer's turn.");
			System.out.println("The dealer's cards are the " + dealer.getCard(0) + " and the " + dealer.getCard(1));
		
			//System.out.println("[Debug] [Main] Entering Dealer AI [159]");
			while (dealer.hitOrStay() == true) {
				cardInfo = cardDeck.drawCard().getInfo().clone();
				dealer.drawCard(cardInfo[0], cardInfo[1]);
			
				System.out.println("The dealer chose to hit.");
				System.out.println("[System] The dealer has drawn the " + dealer.getCard(dealer.getHandSize() - 1));
			
				System.out.println("[System] The dealer's hand value is now " + dealer.getHandValue());
				} //draws cards until dealer's hand is over the max hand value
		
			//System.out.println("[Debug] [Main] Printing Dealer's Cards [170]");
			System.out.println("[System] The dealer's cards: ");
			for (int l = 0; l < dealer.getHandSize(); l++) {
				System.out.println("[Debug] [Main] Printing Card [173]");
				System.out.println(dealer.getCard(l) + "\n");
				} //prints out all of the dealer's cards
		
			System.out.println("[System] The dealer's hand value is " + dealer.getHandValue());
			
			//System.out.println("[Debug] [Main] Handling Dealer Hand [179]");
			if (dealer.getHandValue() > winNum) {
				System.out.println("The dealer has BUSTED with a score of " + dealer.getHandValue());
				} //detects bust
			else if (dealer.getHandValue() == winNum) {
				System.out.println("The dealer has achieved BLACKJACK!");
				} //detects blackjack
		
			dealFinal = winNum - dealer.getHandValue();
			userFinal = winNum - user.getHandValue();
		
			/* SCORING */
			//System.out.println("[Debug] [Main] Scoring [191]");
			if (userFinal == 0 && dealFinal != 0) {
				//System.out.println("[Debug] [Main] Scoring (1)");
				System.out.println("You have WON! You have achieved BLACKJACK! The dealer had a score of " + dealer.getHandValue());
				userWins++;
				} //if you blackjacked and the dealer does not
			else if (dealFinal == 0 && userFinal != 0) {
				//System.out.println("[Debug] [Main] Scoring (2)");
				System.out.println("You have LOST! The dealer has achieved BLACKJACK! You had a score of " + user.getHandValue());
				dealWins++;
				} //if the dealer blackjacked and you have not
			else if (dealFinal == userFinal) {
				//System.out.println("[Debug] [Main] Scoring (3)");
				System.out.println("You have TIED with the dealer. You both had a score of " + user.getHandValue());
				} //if your score was identical to the dealer's
			else if (userFinal < 0 && dealFinal < 0 && userFinal > dealFinal) {
				//System.out.println("[Debug] [Main] Scoring (4)");
				System.out.println("You have WON! Your score of " + user.getHandValue() + " was closer to " + winNum + " than the dealer's score of " + dealer.getHandValue());
				userWins++;
				} //if you busted less than the dealer
			else if (dealFinal < 0 && userFinal < 0 && dealFinal > userFinal) {
				//System.out.println("[Debug] [Main] Scoring (5)");
				System.out.println("You have LOST! Your score of " + user.getHandValue() + " was farther from " + winNum + " than the dealer's score of " + dealer.getHandValue());
				dealWins++;
				} //if the dealer busted less than you
			else if (dealFinal < 0 && userFinal > 0) {
				//System.out.println("[Debug] [Main] Scoring (6)");
				System.out.println("You have WON! You had a score of " + user.getHandValue() + ". The dealer busted with a score of " + dealer.getHandValue());
				userWins++;
				} //if the dealer busted and you did not
			else if (userFinal < 0 && dealFinal > 0) {
				//System.out.println("[Debug] [Main] Scoring (7)");
				System.out.println("You have LOST! You busted with a score of " + user.getHandValue() + ". The dealer had a score of " + dealer.getHandValue());
				dealWins++;
				} //if you busted and the dealer did not
			else if (userFinal < dealFinal) {
			//	System.out.println("[Debug] [Main] Scoring (8)");
				System.out.println("You have WON! You had a score of " + user.getHandValue() + ". The dealer had a score of " + dealer.getHandValue());
				userWins++;
				} //if your score is closer to the win number
			else if (dealFinal < userFinal) {
				//System.out.println("[Debug] [Main] Scoring (9)");
				System.out.println("You have LOST! You had a score of " + user.getHandValue() + ". The dealer had a score of " + dealer.getHandValue());
				dealWins++;
				} //if the dealer's score is closer to the win number
			else {
				//System.out.println("[Debug] [Main] Scoring (10)");
				System.out.println("[System] Error. Your score of " + user.getHandValue() + " and the dealer's score of " + dealer.getHandValue() + " do not match any of the specified win conditions. This will be counted as a tie.");
				tieCount++;
				}
		
			//System.out.println("[Debug] [Main] Will User Play Again? [242]");
			System.out.println("[System] You have " + userWins + " wins. The dealer has " + dealWins + " wins. You have tied with the dealer " + tieCount + " times.");
			System.out.println("[System] Do you want to play again?");
		
			Scanner INput = new Scanner(System.in);
			playAgain = INput.nextLine();
		
			//System.out.println("[Debug] [Main] Handling User Choice [249]");
			if(playAgain.equals("no")) {
				System.out.println("[System] Thank you for playing Java BlackJack.");
				break;
				}
			else {
				System.out.println("[System] Let's play again!");
				}
			}
		}
	}
