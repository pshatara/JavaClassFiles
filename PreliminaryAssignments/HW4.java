import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class HW4 {

	public static void main(String[] args) {
		int[] cards = new int[5];

		cards = getCards();
		testHand(cards);
		System.out.println();
	}

	public static int[] getCards() {
		int[] cards = new int[5];

			Scanner keyboard = new Scanner(System.in);

			System.out.print("Card 1: ");
			cards[0] = keyboard.nextInt();
			System.out.print("Card 2: ");
			cards[1] = keyboard.nextInt();
			System.out.print("Card 3: ");
			cards[2] = keyboard.nextInt();
			System.out.print("Card 4: ");
			cards[3] = keyboard.nextInt();
			System.out.print("Card 5: ");
			cards[4] = keyboard.nextInt();

			Arrays.sort(cards);


			return cards;
	}

	public static void testHand(int[] hand) {
		if(fourOfAKind(hand)) {
			System.out.print("Four of a kind!");
		}
		else if(straight(hand)) {
			System.out.print("Straight!");
		}
		else if(fullHouse(hand)) {
			System.out.print("Full house!");
		}
		else if(threeOfAKind(hand)) {
			System.out.print("Three of a kind!");
		}
		else if(twoPair(hand)) {
			System.out.print("Two pairs!");
		}
		else if(pair(hand)) {
			System.out.print("Pair!");
		}
		else {
			System.out.print("High card is " + hand[4]);
		}
	}

	public static boolean fourOfAKind(int[] hand) {
		boolean test = false;

		for (int i = 0; i < 2; i++) {
			if (hand[i] == hand[i+1] && hand[i] == hand[i+2] && hand[i] == hand[i+3]) {
				test = true;
			}
		}
		
		return test;
	}

	public static boolean straight(int[] hand) {
		boolean test = true;

		for (int i = 0; i < 4; i++) {
			if (hand[i] + 1 != hand[i+1]) {
				test = false;
				return test;
			}
		}

		return test;
	}

	public static boolean fullHouse(int[] hand) {
		boolean test = false;

		if (hand[0] == hand[1] && hand[3] == hand[4] && (hand[2] == hand[0] || hand[2] ==hand[4])) {
			test = true;
		}
		
		return test;
	}

	public static boolean threeOfAKind(int[] hand) {
		boolean test = false;

		for (int i = 0; i < 3; i++) {
			if (hand[i] == hand[i+1] && hand[i] == hand[i+2]) {
				test = true;
			}
		}
		
		return test;
	}

	public static boolean twoPair(int[] hand) {
		boolean test = false;

		for (int i = 0; i < 2; i++) {
			if (hand[i] == hand[i+1] && (hand[i+2] == hand[i+3] || hand[i+2] == hand[i+4] || hand[i+3] == hand[i+4])) {
				test = true;
			}
		}
		
		return test;
	}

	public static boolean pair(int[] hand) {
		boolean test = false;

		for (int i = 0; i < 4; i++) {
			if (hand[i] == hand[i+1]) {
				test = true;
			}
		}
		
		return test;
	}
}