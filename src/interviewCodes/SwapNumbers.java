package interviewCodes;

public class SwapNumbers {
	// Swap numbers without using third variable
	// a = a + b
	// b = a - b
	// a = a - b

	public static String swapNumbers(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;

		return "A = " + a + " ,and B = " + b;
	}

	public static void main(String[] args) {
		int a = 25;
		int b = 32;

		System.out.println("Initially A = " + a + " and B = " + b);
		System.out.println("SWAPPED: " + swapNumbers(a,b));
	}
}
