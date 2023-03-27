import java.io.FileInputStream;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/inputDC.txt"));
		Scanner sc = new Scanner(System.in);

		int T;
		T = sc.nextInt();// 배열의 갯수를 체크해주는 값
		int N;
		int temp;// 깡통값
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();// 배열의 길이를 체크해주는 값
			int listValue[] = new int[N];// 대입을 위한 깡통배열
			for (int i = 0; i < N; i++) {
				listValue[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {// 배열을 오름차순
				for (int j = i + 1; j < N; j++) {
					if (listValue[i] > listValue[j]) {
						temp = listValue[j];
						listValue[j] = listValue[i];
						listValue[i] = temp;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {//중복값을 int의 최대값으로 변환
					if (listValue[i] == listValue[j]) {
						listValue[i] = Integer.MAX_VALUE;
					}
				}
				if (listValue[i] >= 0 && listValue[i] <= 10) {//배열 안의 값에서 0미만 or 10초과의 값을 카운트 안하고
					System.out.print(listValue[i]);//배열로 출력
				}
			}
			System.out.println("");
		}
	}
}