import java.util.PriorityQueue;
import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		PriorityQueue<Integer> minqueue = new PriorityQueue<Integer>();
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int sV = Integer.parseInt(s);
		for (int i = 0; i < sV; i++) {
			String s2 = scanner.nextLine();
			int sV2 = Integer.parseInt(s2);
			if (sV2 == 0) {
				if (minqueue.peek() == null) {
					System.out.println(0);
				} else {
					System.out.println(minqueue.peek());
					minqueue.remove();
				}
			} else {
				minqueue.offer(sV2);
			}
		}
	}
}
