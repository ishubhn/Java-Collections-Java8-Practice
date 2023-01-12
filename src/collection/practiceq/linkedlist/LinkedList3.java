package collection.practiceq.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
		LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
		LinkedList<Integer> list3 = new LinkedList<>();

		// Q24. to compare two linked lists
		for (int i : list1) {
			if (list2.contains(i)) {
				list3.add(i);
			}
		}

		System.out.println(list3);

		// Q25. to test an linked list is empty or not
		System.out.println("List is empty: " + list1.isEmpty());
		list1.removeAll(list1);
		System.out.println("List is empty: " + list1.isEmpty());

		// Q26. to replace an element in a linked list
		list2.set(2,0);
		System.out.println(list2);
	}

}
