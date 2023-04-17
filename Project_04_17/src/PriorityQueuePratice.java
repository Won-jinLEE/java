import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePratice {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		System.out.println(queue.toString());
		
		Iterator<Integer> through = queue.iterator();
		while (through.hasNext()) {
			System.out.print(through.next() + " ");
		}
		
		while (!queue.isEmpty())
			System.out.println(queue.poll());
	}
}
