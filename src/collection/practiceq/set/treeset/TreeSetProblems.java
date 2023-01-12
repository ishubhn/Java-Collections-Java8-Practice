package collection.practiceq.set.treeset;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetProblems {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Red");
		set.add("Green");
		set.add("Yellow");
		set.add("Blue");

		// Q2. to iterate through all elements in a tree set
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Q3. to add all the elements of a specified tree
		// set to another tree set
		TreeSet<String> tr = new TreeSet<>();
		tr.addAll(set);
		System.out.println(tr);

		// Q4. to create a reverse order view of the
		// elements contained in a given tree set
		Iterator<String> itr = tr.descendingIterator();
		System.out.println("Reverse Order");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Q5. to get the first and last elements in a tree set
		System.out.println();
		System.out.println("First and last elements");
		System.out.println("first element" + tr.first());
		System.out.println("last element" + tr.last());

		// Q6. to clone a tree set list to another tree set
		TreeSet<String> tSet = (TreeSet<String>) set.clone();
		System.out.println(tSet);

		// Q7. to get the number of elements in a tree set
		System.out.println("Total Elements in set: " + tSet.size());

		// Q9. to find the numbers less than 7 in a tree set
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(7);
		treeSet.add(9);
		treeSet.add(4);

		System.out.println(treeSet.stream().filter(x -> (x < 7)).collect(Collectors.toSet()));

		// Q10. to get the element in a tree set which is greater
		// than or equal to the given element
		System.out.println(treeSet.stream().filter(x -> (x > 7)).collect(Collectors.toSet()));

		// Q11.
	}
}
