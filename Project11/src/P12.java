//숫자를 입력받아서 소수를 판별
import java.util.Scanner;

public class P12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		String userInput = scanner.nextLine();
		int number = Integer.parseInt(userInput);
		if (number < 2) {
			System.out.println("2미만은 소수가 아닙니다.");
			return;
		}
		boolean isPrime = true;
		for (int i = 0; i < number; i++) {
			if (i < 2) {
				continue;
			}
			
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}
}