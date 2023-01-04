package interviewCodes;

import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.LinkedList;

public class ListLinked {
	int hi;

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 1; i < 15; i++) {
			list.add(i);
		}

		Iterator<Integer> ite = list.iterator();

		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

	}



}
