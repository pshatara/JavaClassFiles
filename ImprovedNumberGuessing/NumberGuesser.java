public class NumberGuesser {

	protected int min;
	protected int max;
	private int orgLowerBound;
	private int orgUpperBound;

	public NumberGuesser(int lowerBound, int upperBound) {
		this.min = orgLowerBound = lowerBound;
		this.max = orgUpperBound = upperBound;
	}

	public void higher() {
		min = getCurrentGuess() + 1;
	}

	public void lower() {
		max = getCurrentGuess() - 1;
	}

	public int getCurrentGuess() {
		return (max - min) / 2;
	}

	public void reset() {
		min = orgLowerBound;
		max = orgUpperBound;
	}

}