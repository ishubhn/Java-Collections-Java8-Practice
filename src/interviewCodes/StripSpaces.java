package interviewCodes;

public class StripSpaces {
	//	remove spaces from a string in Java
	public static String isStrip(String input) {
		StringBuilder str = new StringBuilder();

		char[] charArray = input.toCharArray();

		for (char c: charArray) {
			if(!Character.isWhitespace(c)) {
				str.append(c);
			}
		}
		return str.toString();
	}

	public static void main(String[] args) {
		String i = "Hello world i am shubham";

		System.out.println(isStrip(i));
	}
}
