import java.util.Scanner;

public class HJ {
	public static void main(String[] args) {
		System.out.println("국어점수를 입력하세요.");

		Scanner s = new Scanner(System.in);

		int score = s.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("0~100사이의 값을 입력해주세요.");
			return;
		}

		if (score >= 90) {
			System.out.println("당신의 학점은 : A");
		} else if (score >= 80) { // ==(score < 90 && number >=80)
			System.out.println("당신의 학점은 : B");
		} else if (score >= 70) { // ==(score < 80 && number >=70)
			System.out.println("당신의 학점은 : C");
		} else if (score >= 60) { // ==(score < 70 && number >=60)
			System.out.println("당신의 학점은 : D");
		} else {
			System.out.println("당신의 학점은 : F");
		}
	}
}
