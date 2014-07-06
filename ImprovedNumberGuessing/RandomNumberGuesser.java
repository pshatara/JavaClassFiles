import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser {
	private int randomMidpoint;
	private boolean testRand;
	private Random newRandom;
	
	public RandomNumberGuesser(int lowerBound, int upperBound) {
		super(lowerBound, upperBound);
		
		testRand = true;
		newRandom = new Random();
	}
	
	public int getCurrentGuess() {
		
		if (testRand) {
			randomMidpoint = min + (newRandom.nextInt((max - min) + 1));
			testRand = false;
		}
		
		return randomMidpoint;
	}
	
	public void higher() {
		super.higher();
		testRand = true;
	}
	
	public void lower() {
		super.lower();
		testRand = true;
	}
	
	public void reset() {
		super.reset();
		testRand = true;
	}
}