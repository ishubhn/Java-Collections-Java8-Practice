package collection.practiceq.arraylist;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList3 {
	public static void main(String[] args) {
		// Q18. to test an array list is empty or not
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,12,213,12));
		System.out.println("arr is empty?: " + arr.isEmpty());
		//	arr.removeAll(arr);
		System.out.println("arr is empty?: " + arr.isEmpty());

		// Q19. to trim the capacity of an array list
		// the current list size
		arr.trimToSize();
		System.out.println(arr);

		// Q20. to increase the size of an array list
		arr.ensureCapacity(10);
		System.out.println(arr.size());

		// Q21. to replace the second element of a
		// ArrayList with the specified element
		arr.set(2,0);
		System.out.println(arr);
		System.out.println();

		// Q22.	to print all the elements of a ArrayList
		// using the position of the elements (basic For loop)
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(i + " : " + arr.get(i));
		}
	}
}
