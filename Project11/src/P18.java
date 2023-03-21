import java.util.Random;
import java.util.Scanner;

public class P18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		for (int i = 0; i < 9999999; i++) {
			System.out.println((i+1)+"번째 게임");
			System.out.println("엔터를 누르면 사용자의 주사위가 굴러갑니다.");
			scanner.nextLine();
			int userDice = random.nextInt(6) + 1;
			System.out.println("당신이 뽑은 숫자는" + userDice);
			
			System.out.println("엔터를 누르면 컴퓨터가 주사위를 굴립니다.");
			scanner.nextLine();
			int comDice = random.nextInt(6) + 1;
			System.out.println("컴퓨터가 뽑은 숫자는" + comDice);
			
			if (userDice - comDice > 0) {
				System.out.println("You Win!");
			} else if (userDice - comDice == 0) {
				System.out.println("Draw");
			} else {
				System.out.println("You Lose!");
			}
			System.out.println("다시 실행하고 싶으면 [r],\n종료하고 싶으시면 [q]를 \n입력하고 엔터를 눌러주세요.");
			String resetAndExitButton = scanner.nextLine();
			if (resetAndExitButton.equals("r")) {
				System.out.println("다시 시작하겠습니다.");
				continue;
			} else if (resetAndExitButton.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 실행해주세요");
				break;
			}
			
		}
	}
}
