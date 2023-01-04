package collection;

import java.util.*;

public class ListInterface {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(5);

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		Iterator iterator = list.iterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
