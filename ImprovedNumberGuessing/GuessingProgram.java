import java.util.*;


public class GuessingProgram {
	
	public static void main(String[] args) {
		
		int lowerBound = 1;
		int upperBound = 100;
		char value = 'x';
		boolean test = false;
		boolean correct = true;
		int midpoint = 0;

		RandomNumberGuesser guessNum = new RandomNumberGuesser(lowerBound, upperBound);
		Scanner keyboard = new Scanner(System.in);

		do {
			guessNum.reset();
			System.out.println("Think of a number between " + lowerBound + " and " + upperBound);
			correct = true;
			
			do {
				midpoint = guessNum.getCurrentGuess();

				System.out.println("Is it " + midpoint + "? (h/l/c)");
				value = keyboard.next().charAt(0);

				if (value == 'h' || value == 'H') {
					guessNum.higher();
				}
				else if (value == 'l' || value == 'L') {
					guessNum.lower();
				}
				else if (value == 'c' || value == 'C') {
					correct = false;
				}

			} while(correct);

			System.out.println("You picked " + midpoint + "? Great pick!");
			System.out.println("Do you want to play again(y/n)?");
			char playAgain = keyboard.next().charAt(0);

			if (playAgain == 'y' || playAgain == 'Y') test = true;
			else test = false;

		} while(test);

		System.out.println("Good bye!");
	}	
}