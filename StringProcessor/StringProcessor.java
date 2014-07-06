import java.util.regex.*;

public class StringProcessor {

	String s;

	public StringProcessor(String text) {
		setString(text);
		getString();
	}

	public void setString(String text) {
		s = text;
	}

	public String getString() {
		return s;
	}

	public int wordCount() {

		int wordCount = 0;
		boolean word = false;
		int endOfLine = s.length() - 1;

		for (int i = 0; i < s.length(); i++) {
		    if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
		        word = true;
		    } 
		    else if (!Character.isLetter(s.charAt(i)) && word) {
		        wordCount++;
		        word = false;
		    } 
		    else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
		        wordCount++;
		    }
		}

		return wordCount;
	}

	public int uppercaseCount() {
		int capitalLetters = 0;

		for(int i = 0; i < s.length(); i++) {
		    if (Character.isUpperCase(s.charAt(i))) {
		        capitalLetters++; 
		    }
		}

		return capitalLetters;
	}

	public int digitCount() {
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
		    if (Character.isDigit(s.charAt(i))) {
		        count++;
		    }
		}

		return count;		
	}

	public int digitWordCount() {
		int count = 0;
		String holder = s.toLowerCase();
		String[] split = holder.split(" ");

		for (int i = 0; i < split.length; i++) {
			if (split[i].equals("zero") || split[i].equals("one") || split[i].equals("two") || split[i].equals("three") || split[i].equals("four") || split[i].equals("five") || split[i].equals("six") || split[i].equals("seven") || split[i].equals("eight") || split[i].equals("nine")) {
				count++;
			}
		}

		return count;
	}

	public String getNoSpaceString() {
		String noSpaces = s.replaceAll("\\s+",  "");

		return noSpaces;
	}

	public String getNoVowelString() {
		String noVowels = s.replaceAll("[aeiouAEIOU]", "-");

		return noVowels;
	}

	public String getNoDigitWords() {
		String noDigitWords = s;

		noDigitWords = noDigitWords.replaceAll("(?i)zero", "0");
		noDigitWords = noDigitWords.replaceAll("(?i)one", "1");
		noDigitWords = noDigitWords.replaceAll("(?i)two", "2");
		noDigitWords = noDigitWords.replaceAll("(?i)three", "3");
		noDigitWords = noDigitWords.replaceAll("(?i)four", "4");
		noDigitWords = noDigitWords.replaceAll("(?i)five", "5");
		noDigitWords = noDigitWords.replaceAll("(?i)six", "6");
		noDigitWords = noDigitWords.replaceAll("(?i)seven", "7");
		noDigitWords = noDigitWords.replaceAll("(?i)eight", "8");
		noDigitWords = noDigitWords.replaceAll("(?i)nine", "9");

		return noDigitWords;
	}
}