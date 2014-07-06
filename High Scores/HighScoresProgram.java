import java.util.Scanner;
import java.util.Arrays;

public class HighScoresProgram {

	public static void main(String[] args) {

		HighScores[] scoresArr = new HighScores[5];

		initialize(scoresArr);
		sort(scoresArr);
		display(scoresArr);
	}

	public static void initialize(HighScores[] scores) {
		int placeHolderInt = 0;
		String placeHolderString = "";

		Scanner keyboard = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter the name for score #" + (i) + ": ");
			placeHolderString = keyboard.nextLine();

			System.out.print("Enter the score for score #" + (i) + ": ");
			placeHolderInt = keyboard.nextInt();

			keyboard.nextLine();

			scores[i-1] = new HighScores(placeHolderString, placeHolderInt);
		}
	}

	public static void sort(HighScores[] scores) {
		int max;
		int tempScores;
		String tempNames;

		for (int i = 0; i < 5; i++) {
			max = i;
			for (int j = i+1; j < 5; j++) {
				if (scores[max].getScore() < scores[j].getScore()) {
					max = j;
				}

				tempScores = scores[i].getScore();
				tempNames = scores[i].getName();
				scores[i].setScore(scores[max].getScore());
				scores[i].setName(scores[max].getName());
				scores[max].setScore(tempScores);
				scores[max].setName(tempNames);
			}
		}
	}

	public static void display(HighScores[] scores) {
		for (int i = 0; i < 5; i++) {
			System.out.println(scores[i].getName() + ": " + scores[i].getScore());
		}
	}
}