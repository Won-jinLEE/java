import java.util.Arrays;
import java.util.Scanner;

public class Answer2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputN = scanner.nextLine();
		int N = Integer.parseInt(inputN);
		String data[] = new String[N];
		int countA = 0;
		for (int i = 0; i < N; i++) {
			data[i] = scanner.nextLine();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < data[i].length(); j++) {
				if (data[i].charAt(j) == 65) {

					if (j == data[i].length() - 1) {
						countA++;
						System.out.println(countA);
						countA = 0;
					}

					else {
						countA++;
					}

				} else if (j == data[i].length() - 1) {
					System.out.println(countA);
				}

			}

		}
	}
}
