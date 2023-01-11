package collection.practiceq.arraylist;

import java.util.*;

public class PrintArrayList {
	/*
	*   Q1. Write a Java program to create a new array list,
	*	add some colors (string) and print out the collection
	*/
	/*
	*   Q2. Write a Java program to iterate through all
	*   elements in a array list
	*/
	/*
	*   Q3. Write a Java program to insert an element into the array
	*   list at the first position
	*
	*/

	public static void main(String[] args) {
		// Q1
		ArrayList<String> arr = new ArrayList<>();

		arr.add("Red");
		arr.add("Yellow");
		arr.add("Blue");

//		System.out.println(arr.toString());
//		System.out.println();

		// Q2
		Iterator it = arr.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

//		System.out.println();

		// Q3
		arr.add(0, "Green");
//		System.out.println(arr);

		//	Q4. Write a Java program to retrieve an element
		//  (at a specified index) from a given array list.
//		System.out.println(arr.get(2));

		//	Q5. Write a Java program to update
		//	specific array element by given element.
		arr.set(1, "Orange");
//		System.out.println(arr);

		//	Q6. Write a Java program to remove the third
		//	element from a array list.
		arr.remove(2);
//		System.out.println(arr);

		//  Q7. Write a Java program to search an element
		//  in a array list.
		if (arr.contains("Orange")) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}

		// Q8. Write a Java program to sort a given array list
		Collections.sort(arr);
		System.out.println(arr);

		// Q9. Write a Java program to copy one array list into another.
		// List.copyOf() or (Type cast) arr.clone()
		ArrayList<String> arr2 = new ArrayList<>(List.copyOf(arr));
		// arr2 = (ArrayList<String>) arr.clone();
		System.out.println(arr2);

		// Q10. to shuffle elements in a array list
		Collections.shuffle(arr2);
		System.out.println(arr2);
	}

}
