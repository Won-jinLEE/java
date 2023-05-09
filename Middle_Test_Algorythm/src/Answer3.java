import java.util.Arrays;
import java.util.Scanner;

public class Answer3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputI = scanner.nextLine();
		int valuei = Integer.parseInt(inputI);
		String inputJ = scanner.nextLine();
		int valuej = Integer.parseInt(inputJ);
		int arr[][] = new int[valuei][valuej];
		for (int i = 0; i < valuei; i++) {
			for (int j = 0; j < valuej; j++) {
				String inputValue = scanner.nextLine();
				int value = Integer.parseInt(inputValue);
				arr[i][j] = value;
			}
		}
		int sum1 = 0;
		int sum2 = 0;
		String inputN = scanner.nextLine();
		int N = Integer.parseInt(inputN);
		for (int i = 0; i < N; i++) {
			String inputI2 = scanner.nextLine();
			int valuei2 = Integer.parseInt(inputI2)-1;
			String inputJ2 = scanner.nextLine();
			int valuej2 = Integer.parseInt(inputJ2)-1;
			for (int j = 0; j < valuei; j++) {
				sum1 = sum1 +arr[j][valuej2];
			}
			for (int j = 0; j < valuej; j++) {
				sum2 = sum2 +arr[valuei2][j];
			}
			System.out.print(sum2+" ");
			System.out.print(sum1);
			System.out.println();
			sum1 =0;
			sum2 =0;
		}
	}
}
