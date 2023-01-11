package collection.practiceq.linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,3,4,2,55,131));

		// Q1. to append the specified element to the end of a linked list
		list.addLast(121);
		System.out.println(list);

		// Q2. to iterate through all elements in a linked list
//		Iterator it = list.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		// Q3. to iterate through all elements in a linked list starting at the specified position
	}
}
