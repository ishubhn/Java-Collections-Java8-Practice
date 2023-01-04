package interviewCodes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OddNumbers {
	// for loop
	public static boolean isOddNumber(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	// stream parallel
	public static boolean isOddNumberStream(List<Integer> list) {
		return list
				.parallelStream()
				.anyMatch(x -> x % 2 != 0);
	}

	public static void main(String[] args) {

		Integer[] arr = {1,3,4};

		List<Integer> list = Arrays.asList(arr);

//		System.out.println(isOddNumber(list));
		System.out.println(isOddNumberStream(list));
	}
}
