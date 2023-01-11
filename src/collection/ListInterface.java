package collection;

import java.util.*;

public class ListInterface {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(128);
		list.add(2);
		list.add(12);

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
