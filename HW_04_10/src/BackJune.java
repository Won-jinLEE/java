import java.util.Arrays;
import java.util.Scanner;

public class BackJune {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Integer arr[] = new Integer[N];
		for (int i = 0; i < N; i++) {
			int D = scanner.nextInt();
			arr[i] = D;
		}
		Arrays.sort(arr, (a, b) -> {
			return a - b;
		});
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}
}
