import java.util.Random;
import java.util.Scanner;


public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare initial hands and totals
			int firstCard;
			int secondCard;
			int dealer1;
			int dealer2;
			int userTotal;
			int dealerTotal;
			
			Scanner keyboard = new Scanner(System.in);	//Create a scanner object
			Random randomNumber = new Random();			//Create a random class
			
			firstCard = 1 + randomNumber.nextInt(10);	//Assign the user's first card
			secondCard = 1 + randomNumber.nextInt(10);	//Assign the user's second card
			dealer1 = 1 + randomNumber.nextInt(10);		//Assign the dealer's first card
			dealer2 = 1 + randomNumber.nextInt(10);		//Assign the dealer's second card
			userTotal = firstCard + secondCard;		// Total the user's hand
			dealerTotal = dealer1 + dealer2;		//Total the dealer's hand
			
			System.out.println("Dealer's cards: " + dealer1 + ", ??");	//Display the dealer's first card and leave his second card hidden
			
			System.out.println("First cards: " + firstCard + ", " + secondCard);		//Display the user's initial hand
			System.out.println("Total: " + userTotal);									//Display the user's total

			while (userTotal < 21) {
				System.out.println("Would you like to hit? (y/n)");		//Allows the user to hit or not
				char userResponse = keyboard.next().charAt(0);						//Takes in the user response
				if (userResponse != 'n') {
					int hit;									//Declares a local variable to temporarily hold the value of a new card dealt to the user
					hit = 1 + randomNumber.nextInt(10);			//Assigns a random value between 1-10 to the new card
					userTotal += hit;							//Adds the new card to the user's total
					System.out.println("New card: " + hit);		//Displays the new card
					System.out.println("Total: " + userTotal);	//Displays the new total

				}
				else {
					System.out.println("Total: " + userTotal);	//Display's the user's total if they opt to stay
					break;										//Exits while loop prior to meeting condition userTotal < 21
				}
			}

			if (userTotal > 21)
				System.out.println("Bust! You lose.");				//Informs the user they've lost if they score above 21
			else if (userTotal == 21) {
				System.out.println("Congratulations, you got 21!");					//If the user gets a blackjack, end the game (works after user hits)
			}
			else {
				System.out.println("Dealer's cards: " + dealer1 + ", " + dealer2);	//Displays both the dealer's cards
				System.out.println("Dealer's total: " + dealerTotal);				//Displays the dealer's total
				keyboard.nextLine();
				while (dealerTotal < 17){
					int hit;														//Declares a local variable to temporarily hold the value of a new card dealt to the dealer
					hit = 1 + randomNumber.nextInt(10);								//Assigns a random value between 1-10 to the new card
					dealerTotal += hit;												//Adds the new card to the dealer's total
					System.out.println("Hit enter to continue.");					//Prompts the user to hit enter to continue
					keyboard.nextLine();														//Allows the user to continue the program by hitting enter
					System.out.println("Dealer's new card: " + hit);				//Displays the dealer's new card
					System.out.println("Dealer's Total: " + dealerTotal);			//Displays the dealer's new total
				}
				if (dealerTotal > 21)
					System.out.println("Dealer busts. You win!");				//Displays that the user has won if the dealer busts
				else if (dealerTotal == userTotal) {
					System.out.println("Push. Both you and the dealer scored " + userTotal + ".");		//Displays that there was a tie if both scores are equal
				}
				else if (dealerTotal > userTotal) {
					System.out.println("You lose. " + dealerTotal + " beats " + userTotal + ".");		//Displays that the user has lost to the dealer's hand
				}
				else {
					System.out.println("You win! " + userTotal + " beats " + dealerTotal + ".");	//Displays that the user has beaten the dealer's hand
				}
			}
	}

}
