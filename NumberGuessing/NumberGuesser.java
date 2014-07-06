public class NumberGuesser {

	private int min;
	private int max;
	private int orgLowerBound;
	private int orgUpperBound;
	private int midPoint = 0;
	private boolean test = true;

	public NumberGuesser(int lowerBound, int upperBound) {
		min = lowerBound;
		max = upperBound;
		orgLowerBound = lowerBound;
		orgUpperBound = upperBound;
	}

	public void higher() {
		min = midPoint;
		test = true;
	}

	public void lower() {
		max = midPoint;
		test = false;
	}

	public int getCurrentGuess() {
		if (test) {
			midPoint += (max - min) / 2;
			if ((max - min) % 2 == 1) midPoint++;
		}
		else {
			midPoint -= (max - min) / 2;
			if ((max - min) % 2 == 1) midPoint--;
		}
		return midPoint;
	}

	public void reset() {
		min = orgLowerBound;
		max = orgUpperBound;
		midPoint = 0;
		test = true;
	}

}