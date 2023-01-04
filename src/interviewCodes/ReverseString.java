package interviewCodes;

public class ReverseString {
	// Reverse the string
	public String reverse(String input) {
		StringBuilder str = new StringBuilder();
		char[] ch = input.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			str.append(ch[i]);
		}

		return str.toString();
	}

	public static void main(String[] args) {
		String i = "Hello World!";
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverse(i));
	}
}
