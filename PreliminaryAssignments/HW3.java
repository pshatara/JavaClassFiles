import java.util.Scanner;


public class HW3 {
	
	public static void main(String[] args) {
		do {
			playOneGame();
		} while (shouldPlayAgain());
	}	
	
	public static void playOneGame() {
		System.out.println("Guess a number between 1 and 100.");
		getMidpoint(0, 100);
	}

	public static boolean shouldPlayAgain() {
		boolean test;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Great! Do you want to play again (y/n)");
		char playAgain = keyboard.next().charAt(0);

		if (playAgain == 'y' || playAgain == 'Y') {
			test = true;
		}
		else test = false;

		return test;
	}

	public static char getUserResponseToGuess(int guess) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Is it " + guess + "?   (h/l/c)");
		char value = keyboard.next().charAt(0);
		return value;
	}

	public static int getMidpoint(int low, int high) {
		int midpoint = 50;
		char userInput = 'x';

		while (userInput != 'c' && userInput != 'C') {

			userInput = getUserResponseToGuess(midpoint);

			if (userInput == 'h' || userInput == 'H') {
				high = midpoint;
				midpoint -= ((high - low) / 2);
			}
			else {
				low = midpoint;
				midpoint += ((high - low) / 2);
			}
		}
		return 0;
	}
}
