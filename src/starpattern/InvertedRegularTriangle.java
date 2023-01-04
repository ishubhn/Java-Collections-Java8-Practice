package starpattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InvertedRegularTriangle {
//	* * * * * *
//	 * * * * *
//	  * * * *
//	   * * *
//		* *
//		 *

	public static void oppTriangle(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		oppTriangle(5);
	}
}
