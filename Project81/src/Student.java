import java.util.Scanner;

public class Student {
	String name;
	int kor;
	int eng;
	int math;

	public void inputGrade() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String inputName = scanner.nextLine();
		this.name = inputName;
		System.out.println("국어성적을 입력해주세요.");
		String inputKor = scanner.nextLine();
		int thisKor = Integer.parseInt(inputKor);
		this.kor = thisKor;
		System.out.println("영어성적을 입력해주세요.");
		String inputEng = scanner.nextLine();
		int thisEng = Integer.parseInt(inputEng);
		this.eng = thisEng;
		System.out.println("수학성적을 입력해주세요.");
		String inputMath = scanner.nextLine();
		int thisMath = Integer.parseInt(inputMath);
		this.math = thisMath;
		System.out.println(
				this.name + "의 성적은 국어 : " + this.kor + "점\n영어 : " + this.eng + "점\n수학 : " + this.math + "점입니다.");
	}

}
