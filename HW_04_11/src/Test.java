import java.util.Scanner;

public class Test {// 시험점수 관리에 관한 메서드만
	int korScore;
	int engScore;
	int mathScore;

	public void inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 성적을 입력해주세요.");
		String inputKor = scanner.nextLine();
		int korScore = Integer.parseInt(inputKor);
		this.korScore = korScore;
		System.out.println("영어 성적을 입력해주세요.");
		String inputEng = scanner.nextLine();
		int engScore = Integer.parseInt(inputEng);
		this.engScore = engScore;
		System.out.println("수학 성적을 입력해주세요.");
		String inputMath = scanner.nextLine();
		int mathScore = Integer.parseInt(inputMath);
		this.mathScore = mathScore;
	}
}
