package hell;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/inputAS.txt"));
		Scanner sc = new Scanner(System.in);

		int T;
		T = sc.nextInt();// 배열의 갯수를 체크해주는 값
		int N;
		N = sc.nextInt();
		int asdf[][] = new int[T][N];
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < N; j++) {
				asdf[i][j] = sc.nextInt();
			}
		}
		int S;
		S = sc.nextInt();
		int tmp = 0;
		for (int i = 0; i < S; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt() - 1;
			int d = sc.nextInt() - 1;
			for (int j = a; j <= c; j++) {
				for (int k = b; k <= d; k++) {
					tmp = tmp + asdf[j][k];
				}
			}
			System.out.println(tmp);
			tmp = 0;
		}
	}
}