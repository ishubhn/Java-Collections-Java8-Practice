package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();

		queue.add(5);
		queue.add(6);
		queue.add(1);
		queue.add(8);
		queue.poll();

		Iterator it = queue.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
