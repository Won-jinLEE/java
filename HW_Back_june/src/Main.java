import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData1 = scanner.nextLine();
		int testN = Integer.parseInt(inputData1);
		int temp = 0;
		for (int i = 0; i < 9999999; i++) {
			if (testN > 100000 || testN < 1) {
				String inputData2 = scanner.nextLine();
				temp = Integer.parseInt(inputData2);
				if (temp > 100000 || temp < 1) {
					String inputData3 = scanner.nextLine();
					temp = Integer.parseInt(inputData3);
				} else {
					break;
				}
			} else {
				temp = testN;
				break;
			}
		}
		int N = temp;
		int[] asdf1 = new int[N];
		int[] asdf2 = new int[N];
		int tmp;
		for (int i = 0; i < N; i++) {
			String inputData2 = scanner.next();
			String inputData3 = scanner.next();
			int xi = Integer.parseInt(inputData2);
			if (xi > 100000 || xi < -100000) {
				return;
			}
			int yi = Integer.parseInt(inputData3);
			if (yi > 100000 || yi < -100000) {
				return;
			}
			asdf1[i] = xi;
			asdf2[i] = yi;
		}
		for (int i = 0; i < N; i++) {// 배열을 오름차순
			for (int j = i + 1; j < N; j++) {
				if (asdf1[i] > asdf1[j]) {
					tmp = asdf1[j];
					asdf1[j] = asdf1[i];
					asdf1[i] = tmp;
				}
				if (asdf2[i] > asdf2[j]) {
					tmp = asdf2[j];
					asdf2[j] = asdf2[i];
					asdf2[i] = tmp;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(asdf1[i] + " " + asdf2[i]);
		}
	}
}