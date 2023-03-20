import java.util.Random;
import java.util.Scanner;

public class J1_Loop {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요(0~100)");
		Scanner s = new Scanner(System.in);
		int user = s.nextInt();
			for (int i=0; i<1; i++) {
			if (user > 100) {
				System.out.println("100을 초과했습니다.");
				continue;
			} else if (user < 0) {
				System.out.println("0미만입니다.");
				continue;
			}
			Random c = new Random();
			int com = c.nextInt(10)+1;
			int division = user / com;
			if (division % 2 == 1) {
				System.out.println("당신의 숫자" + user + "에서 임의의 값" + com + "을 나눈 값은" + division + "이고," + "나머지는"
						+ (user % com) + "이며, 나머지의 몫은 홀수 입니다");
			} else {
				System.out.println("당신의 숫자" + user + "에서 임의의 값" + com + "을 나눈 값은" + division + "이고," + "나머지는"
						+ (user % com) + "이며, 몫은 짝수 입니다");
			}
		}
	}
}