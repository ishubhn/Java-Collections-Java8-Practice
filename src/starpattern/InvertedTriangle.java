package starpattern;

public class InvertedTriangle {
	public static void invertedTriangle(int n) {
		// inverted triangle
		for(int i = 0; i <= n; i++ ) {
			for(int j = n; j >= i; j--) {
				// j will start with n, and will always be more or equal than i
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		invertedTriangle(5);
	}
}
