package collection.practiceq.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list);
		Collections.sort(list);

		// Q11. Reverse arraylist
		Collections.reverse(list);
		System.out.println(list);

		// Q12. to extract a portion of a array list
		System.out.println(list.subList(1, 3));

		// Q13. to compare two array lists, if matching add in third array
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 4, 5));
		System.out.println("Common elements: " +
				list.stream().filter(list2::contains).collect(Collectors.toList()));

		// Q14. Swap two elements from list
		System.out.println("Before swapping: " + list2);
		Collections.swap(list2, 0, 1);
		System.out.println("After swapping: " + list2);

		// Q15. to join two array lists
		list.addAll(list2);
		System.out.println("Joining array: " + list);

		// Q16. Clone an array
		ArrayList<Integer> list3 = (ArrayList) list2.clone();
		System.out.println("Cloned: " + list3);

		// Q17. to empty an array list
		list.removeAll(list);
		System.out.println(list);
	}
}
