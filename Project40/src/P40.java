import java.util.Scanner;

public class P40 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 999999999; i++) {
			System.out.println("다음 중 원하는 메뉴를 선택하세요.");
			System.out.println(" 1 : Hello 출력");
			System.out.println(" q : 종료");
			String inputMenu = s.nextLine();// 문자열 입력을 받을 때는 .nextLine을 사용
			// 만약 입력받은 문자열을 숫자로 변경하고 싶은 경우
			// int number = Integer.parseInt(inputMenu);

			if (inputMenu.equals("1")) { // 문자열 비교는 == 대신 .equals를 사용
				System.out.println("hello");
			} else if (inputMenu.equals("q")) {
				break;
			} else {
				System.out.println("입력값이 잘못 되었습니다. 다시 입력해주세요.");
			}
		}
	}
}
