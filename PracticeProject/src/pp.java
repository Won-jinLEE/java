import java.util.Scanner;

public class pp {
	public static void main(String[] args) {
//스캐너 선언
		Scanner s = new Scanner(System.in);
//첫번째 입력값
		System.out.println("나눌 숫자를 입력해주세요");
		double FirstNumber = s.nextDouble();
//두번째 입력값		
		System.out.println("나눌 숫자를 입력해주세요");
		double SecondNumber = s.nextDouble();
//결과값
		double DivisionNumber = FirstNumber / SecondNumber;
		System.out.println("결과는 (" + DivisionNumber + ")이고");
		System.out.println("올림하면 (" + Math.ceil(DivisionNumber) + ")이며");
		System.out.println("반올림하면 (" + Math.round(DivisionNumber) + ")이며");
		System.out.println("버림하면 (" + Math.floor(DivisionNumber) + ")입니다.");
	}
}