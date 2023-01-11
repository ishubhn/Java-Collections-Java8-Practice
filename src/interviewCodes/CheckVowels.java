package interviewCodes;

public class CheckVowels {
	// to check if a vowel is present in a string.
	public static boolean checkVowels(String ex) {
		return ex.toLowerCase().matches(".*[aeiou].*");
	}

	public static void main(String[] args) {
		String h = "Hlla";

		System.out.println(checkVowels(h));
	}
}
