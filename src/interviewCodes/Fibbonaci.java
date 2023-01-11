package interviewCodes;

import java.util.Arrays;

public class Fibbonaci {
	public static int printSeries(int length) {
		if (length <= 1) {
			return length;
		}

		return printSeries(length - 1) + printSeries(length - 2);
	}

	public static void main(String[] args) {
		int length = 10;

		for (int i = 0; i < length; i++) {
			System.out.print(printSeries(i) + " ");
		}
	}
}
