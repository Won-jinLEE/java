import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Quiz05 {
	// https://www.acmicpc.net/problem/11279
	public static void main(String[] args) {
		PriorityQueue<Integer> maxqueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int sV = Integer.parseInt(s);
		for (int i = 0; i < sV; i++) {
			String s2 = scanner.nextLine();
			int sV2 = Integer.parseInt(s2);
			if (sV2 == 0) {
				if (maxqueue.peek() == null) {
					System.out.println(0);
				} else {
					System.out.println(maxqueue.peek());
					maxqueue.remove();
				}
			} else {
				maxqueue.offer(sV2);
			}
		}
	}
}
