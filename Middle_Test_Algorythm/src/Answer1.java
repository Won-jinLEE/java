import java.util.Arrays;
import java.util.Scanner;

public class Answer1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputN = scanner.next();
		int N = Integer.parseInt(inputN);
		String inputM = scanner.next();
		int M = Integer.parseInt(inputM);
		String inputK = scanner.next();
		int K = Integer.parseInt(inputK);
		int data[] = new int[N];
		int sum = 0;
		int a = data.length - 1;
		for (int i = 0; i < N; i++) {
			String inputValue = scanner.next();
			int value = Integer.parseInt(inputValue);
			data[i] = value;
		}
		Arrays.sort(data);
		for (int i = 0; i <= M; i++) {
			for (int j = 0; j < K; j++) {
				if (j == K - 1) {
					sum = sum + data[a];
					a = a - 1;
				} else {
					sum = sum + data[a];
					i++;
				}
			}
		}
		System.out.println(sum);
	}
}
