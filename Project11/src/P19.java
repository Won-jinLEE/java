import java.util.Arrays;
import java.util.Scanner;

public class P19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[10];
		int maxScore = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력해주세요.");
			String inputNumber = scanner.nextLine();
			score[i] = Integer.parseInt(inputNumber);
			for (int j = 0; j < i + 1; j++) {
				System.out.print("[" + score[j] + "]");
			}
			if (score[i] > maxScore) {
				maxScore = i + 1;
			}
			System.out.println("");
		}
		System.out.println("가장 점수가 높은 학생은 : " + (maxScore) + "번째 학생입니다.");
	}
}
