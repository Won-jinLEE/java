import java.util.Scanner;

public class P41 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 99999999; i++) {
			System.out.println("숫자를 입력하거나, q를 입력해 종료해주세요");
			String inputMenu = s.nextLine();
			if (inputMenu.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			}
			int number = Integer.parseInt(inputMenu);
			if (number % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
	}
}