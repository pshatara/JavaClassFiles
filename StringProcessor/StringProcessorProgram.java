import java.util.Scanner;


public class StringProcessorProgram {
	
	public static void main(String[] args) {
		
		String text;
		boolean test;

		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.print("Enter a line of text: ");
			text = keyboard.nextLine();
			StringProcessor processString = new StringProcessor(text);

			System.out.println("words: " + processString.wordCount());
			System.out.println("uppercase: " + processString.uppercaseCount());
			System.out.println("digits: " + processString.digitCount());
			System.out.println("digit words: " + processString.digitWordCount());
			System.out.println("line with white spaces removed: \"" + processString.getNoSpaceString() + "\"");
			System.out.println("line with vowels replaced: \"" + processString.getNoVowelString() + "\"");
			System.out.println("line with digit words replaced: \"" + processString.getNoDigitWords() + "\"");

			System.out.println("Do you want to play again(y/n)?");
			char playAgain = keyboard.next().charAt(0);

			if (playAgain == 'y' || playAgain == 'Y') test = true;
			else test = false;

			keyboard.nextLine();

		} while(test);
	}	
}