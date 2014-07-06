import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class HW5 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> scores = new ArrayList<Integer>();

		initialize(names, scores);
	}

	public static void initialize(ArrayList<String> names, ArrayList<Integer> scores) {

		int placeHolderInt = 0;
		String placeHolderString = "";

		Scanner keyboard = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter the name for score #" + (i) + ": ");
			placeHolderString = keyboard.nextLine();
			names.add(i-1, placeHolderString);
			System.out.print("Enter the score for score #" + (i) + ": ");
			placeHolderInt = keyboard.nextInt();
			scores.add(i-1, placeHolderInt);
			keyboard.nextLine();
		}

		sort(names, scores);
		System.out.println("\nTop Scores:");
		display(names, scores);

	}


	public static void sort(ArrayList<String> names, ArrayList<Integer> scores) {
		int max;
		int tempScores;
		String tempNames;

		for (int i = 0; i < scores.size(); i++) {
			max = i;
			for (int j = i+1; j < scores.size(); j++) {
				if (scores.get(max).compareTo(scores.get(j)) > 0) {
					max = j;
				}

				tempScores = scores.get(i);
				tempNames = names.get(i);
				scores.set(i, scores.get(max));
				names.set(i, names.get(max));
				scores.set(max, tempScores);
				names.set(max, tempNames);
			}
		}

	}

	public static void display(ArrayList<String> names, ArrayList<Integer> scores) {

		for (int i = 4; i >= 0; i--) {
			System.out.println(names.get(i) + ": " + scores.get(i));
		}
	}
}