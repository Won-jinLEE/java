import java.util.Scanner;

public class P50 {
	public static void main(String[] args) {
		for (int i = 0; i < 9999; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("숫자를 입력해 주세요. (종료시 q 입력)");
			String inputString = s.nextLine();
			if (inputString.equals("q")){
				System.out.println("종료되었습니다.");
				break;
			}
			int inputNumber = Integer.parseInt(inputString);
			if (inputNumber % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
	}
}