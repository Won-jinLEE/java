import java.util.Random;
import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0, userWin = 0, comWin = 0;
		for (int i = 0; i < 9999999; i++) {
			System.out.println("가위(0), 바위(1), 보(2)중 하나를 입력해주세요.종료(q)");
			String inputString = scanner.nextLine();
			if (inputString.equals("q")) {
				System.out.println("게임이 종료되었습니다.");
				System.out.println("총"+gameCount+"중 사용자는 "+userWin+"번 이겼고, 컴퓨터는 "+comWin+"번 이겼습니다.");
				break;
			}
			gameCount++;
			System.out.println(gameCount + "번째 게임");
			int userInput = Integer.parseInt(inputString);
			int comInput = random.nextInt(3);

			if (comInput == 0) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
			} else if (comInput == 1) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
			} else if (comInput == 2) {
				System.out.println("컴퓨터는 보를 냈습니다.");
			}
			if (userInput == comInput) {
				System.out.println("비겼습니다.");
			} else if ((userInput == 0 && comInput == 1) || (userInput == 1 && comInput == 2)
					|| (userInput == 2 & comInput == 0)) {
				System.out.println("컴퓨터가 이겼습니다.");
				comWin++;
			} else {
				System.out.println("사용자가 이겼습니다.");
				userWin++;
			}
			System.out.println("계속 진행하시려면 엔터를 눌러주세요");
			scanner.nextLine();
		}
	}
}
