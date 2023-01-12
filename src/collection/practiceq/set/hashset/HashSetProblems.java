package collection.practiceq.set.hashset;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HashSetProblems {

	/*
	*  Sets - implements collection
	*  unordered collection of objects in which
	*  duplicate values cannot be stored
	*
	* Hashset - implements Set, Serializable and Cloneable (underlying ds structure is HashTable)
	* - unordered collection. Objects inserted based on hashcode
	* - Null elements are allowed
	*/

	public static void main(String[] args) {
		HashSet<Integer> hSet = new HashSet<>();

		hSet.add(1);
		hSet.add(12);
		hSet.add(3);
		hSet.add(1);
		// Q1. to append the specified element to the end of a hash set
		hSet.add(5);
		System.out.println(hSet);

		// Q2. to iterate through all elements in a hash list
		for (int i: hSet) {
			System.out.print(i + " ");
		}
		// or
		Iterator<Integer> it = hSet.iterator();
		System.out.println();
		System.out.println("Using Iterator");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		// Q3. to get the number of elements in a hash set
		System.out.println(hSet.size());

		// Q4. to empty an hash set
//		hSet.removeAll(hSet);
//		System.out.println(hSet.size());

		// Q5.  to test a hash set is empty or not
//		System.out.println("Is hashset empty: " + hSet.isEmpty());

		// Q6. to clone a hash set to another hash set
		HashSet<Integer> hashSet = (HashSet<Integer>) hSet.clone();
		System.out.println(hashSet);

		// Q7. to convert a hash set to an array
		Integer array[] = new Integer[hashSet.size()];
		hashSet.toArray(array);

		// Q8. to convert a hash set to a tree set
		TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
		System.out.println("Tree Set : " + treeSet);

		// Q9. to convert a hash set to a List/ArrayList
		LinkedList<Integer> list = new LinkedList<>(hashSet);
		System.out.println("LinkedList : " + list);

		hashSet.remove(12);

		// Q10. to compare two hash set size
		System.out.println((hSet.size() > hashSet.size()) ? true : false);

		// Q11. to compare two sets and retain elements
		// which are same on both sets
		System.out.println(hSet.stream().filter(x -> hashSet.contains(x)).collect(Collectors.toList()));

		// Q12. to remove all of the elements from a hash set
		hashSet.removeAll(hashSet);
	}

}
