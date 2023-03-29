import java.util.Scanner;

public class Simulater {
	public double tall() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력해주세요.");
		double inputTall = scanner.nextDouble();
		double tall = (inputTall / 100);
		System.out.println("당신의 키는 : " + tall + "m입니다.");
		return tall;
	}

	public double weight() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몸무게를 입력해주세요.");
		double weight = scanner.nextDouble();
		System.out.println("당신의 몸무게는 : " + weight + "kg입니다.");
		return weight;
	}

	public void result(double weight, double tall) {
		double result = (weight / (tall * tall));
		if (result >= 30) {
			System.out.print("당신의 카우프 지수는 : ");
			System.out.printf("%2.2f", result);
			System.out.print(", 비만입니다.");
		} else if (result > 24) {
			System.out.print("당신의 카우프 지수는 : ");
			System.out.printf("%2.2f", result);
			System.out.print(", 과체중입니다.");
		} else if (result > 20) {
			System.out.print("당신의 카우프 지수는 : ");
			System.out.printf("%2.2f", result);
			System.out.print(", 정상입니다.");
		} else if (result > 15) {
			System.out.print("당신의 카우프 지수는 : ");
			System.out.printf("%2.2f", result);
			System.out.print(", 저체중 상태입니다.");
		} else if (result > 13) {
			System.out.print("당신의 카우프 지수는 : ");
			System.out.printf("%2.2f", result);
			System.out.print(", 저체중이며, 여윈 상태입니다.");
		} else if (result > 10) {
			System.out.print("당신의 카우프 지수는 : ");
			System.out.printf("%2.2f", result);
			System.out.print(", 저체중이며, 영양실조증 상태입니다.");
		} else {
			System.out.print("당신의 카우프 지수는 : ");
			System.out.printf("%2.2f", result);
			System.out.print(", 저체중이며, 소모증 상태입니다.");
		}
	}
}