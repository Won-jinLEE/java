import java.util.Scanner;

public class pp2 {
	public static void main(String[] args) {
//스캐너선언		
		Scanner s = new Scanner(System.in);
//첫번째 문자열
		System.out.println("첫번째 단어를 입력하세요.");
		System.out.println("입력한 단어:");
		String FirstS = s.nextLine();
//두번째 문자열
		System.out.println("두번째 단어를 입력하세요.");
		System.out.println("입력한 단어:");
		String SecondS = s.nextLine();
//결과값
		String PlusS = FirstS + SecondS;
		System.out.println("두단어를 붙이면 '" + PlusS + "'입니다.");
	}
}