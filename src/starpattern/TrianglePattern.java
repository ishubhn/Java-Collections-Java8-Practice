package starpattern;

public class TrianglePattern {
	// regular triangle
	public static void printTriangle(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) { // j will always be lesser than or equal to i
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		printTriangle(5);
	}

}
