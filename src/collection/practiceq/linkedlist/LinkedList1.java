package collection.practiceq.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 3, 4, 2, 55, 131));

		// Q1. to append the specified element to the end of a linked list
		list.addLast(121);
		System.out.println(list);

		// Q2. to iterate through all elements in a linked list
//		Iterator it = list.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		// Q3. to iterate through all elements in a linked list
		// at the specified position
		/*
			for (int i = 3; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
		*/

		// Q4. to iterate a linked list in reverse order
		/*
			Iterator itr = list.descendingIterator();

			while(itr.hasNext()) {
				System.out.print(itr.next() + " ");
			}
		*/

		// Q5. to insert the specified element at the specified
		// position in the linked list
		list.add(3, 12);
		System.out.println(list);

		// Q6-8 . to insert elements into the linked list at the
		// first and last position
		list.addFirst(0);       // return void
		list.addLast(199);
		list.offerFirst(1000);  // return boolean
		list.offerLast(0);
//		System.out.println(list);

		// Q9. to insert some elements at the specified
		// position into a linked list
		list.addAll(5, Arrays.asList(99, 98, 97));
		System.out.println(list);

		// Q10. to get the first and last occurrence of
		// the specified elements in a linked list
		System.out.println("First Element is: " + list.getFirst());
		System.out.println("Last Element is: " + list.getLast());

		// Q12. remove specified element
		list.remove(0);

		// Q13. remove first and last element
		list.removeFirst();
		list.removeLast();
		System.out.println(list);

		// Q14. remove all
		list.removeAll(list);
		System.out.println(list);
	}
}
