import java.util.Scanner;

public class Kaup {
	double weight = 0;
	double height = 0;


	public void inputVar() {
		System.out.println("몸무게를 입력해주세요 (단위kg)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		weight = Double.parseDouble(inputString);
		System.out.println("키를 입력해주세요 (단위 cm)");
		inputString = scanner.nextLine();
		height = Double.parseDouble(inputString);
		height = height / (double) 100;
	}

	public void calcKaup() {
		double result = (double) weight / (height * height);

		if (result >= 30) {
			System.out.println("비만");
		} else if (result > 24) {
			System.out.println("과체중");
		} else if (result > 20) {
			System.out.println("정상");
		} else if (result > 15) {
			System.out.println("저체중");
		} else if (result > 13) {
			System.out.println("여윔");
		} else if (result > 10) {
			System.out.println("영양 실조");
		} else {
			System.out.println("소모증");
		}
	}
}
