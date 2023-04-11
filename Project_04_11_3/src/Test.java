import java.util.Scanner;

public class Test {// 시험점수 관리에 관한 메서드만
	String category; // middle=중간 final=기말
	int korScore;
	int engScore;
	int mathScore;

	public void inputCategory() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("시험유형을 선택해주세요.[1]중간 [2]기말");
		String inputTestType = scanner.nextLine();
		int testType = Integer.parseInt(inputTestType);
		if (testType == 1) {
			this.category = "middle";
		} else if (testType == 2) {
			this.category = "final";
		}
	}

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
