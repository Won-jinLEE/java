import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value[] = new int[5];
		int tmp = 0;
		int swap = 0;
		for (int i = 0; i < value.length; i++) {
			int s = scanner.nextInt();
			value[i] = s;
			tmp = tmp + value[i];
		}
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value.length; j++) {
				if (j > 0 && value[j - 1] > value[j]) {
					swap = value[j];
					value[j] = value[j - 1];
					value[j - 1] = swap;
				}
			}
		}
		System.out.println(tmp / value.length);
		System.out.println(value[value.length - 3]);
	}
}