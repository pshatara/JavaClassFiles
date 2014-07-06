public class HighScores {
	private String name;
	private int score;

	public HighScores(String n, int s) {
		name = n;
		score = s;
	}

	void setName(String n) {
		name = n;
	}

	String getName() {
		return name;
	}

	void setScore(int s) {
		score = s;
	}

	int getScore() {
		return score;
	}
}