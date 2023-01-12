package collection.practiceq.linkedlist;

import java.util.*;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(Arrays.asList("Suzuki", "Honda", "Mercedes"));
		LinkedList<String> list2 = new LinkedList<>(Arrays.asList("Motorola", "Apple", "Lava"));

		// Q15. swap two elements in linkedlist
		Collections.swap(list, 1,2);
		System.out.println(list);

		// Q16. to shuffle the elements in a linked list
		Collections.shuffle(list);
		System.out.println(list);

		// Q17. to join two linked lists
		list.addAll(list2);
//		System.out.println(list);

		// Q18. to clone an linked list to another linked list
		LinkedList li3 = (LinkedList) list.clone();
		System.out.println(li3);

		// Q19. to remove and return the first element of a linked list
		System.out.println("first element removed and print: " + li3.pop());

		// Q20. to retrieve but does not remove, the first element of a linked list
		System.out.println("PeekFirst first element: " + li3.peekFirst()); // or
		System.out.println("Peek first element: " + li3.peek());

		// Q21. to retrieve but does not remove, the last element of a linked list
		System.out.println("Last element: " + li3.peekLast());

		// Q22. to check if a particular element exists in a linked list
		System.out.println("is Honda present - " + li3.contains("Honda"));
		System.out.println("is Lava present - " + doesContains(li3, "aLava"));

		// Q23. to convert a linked list to array list
		ArrayList<String> arr = new ArrayList<>(list2);
		System.out.println(arr);
	}

	public static boolean doesContains(List<?> list, String element) {
		return list.stream().anyMatch(x -> Objects.equals(x, element));
	}
}

