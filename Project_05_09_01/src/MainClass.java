import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		ClassRoom classRoom = new ClassRoom();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 99999; i++) {
			System.out.println("어떤 작업을 실행하시겠습니까?[1]성적 입력[2]성적 출력[3]성적 정렬 출력[q]종료");
			String inputAction = scanner.nextLine();
			if (inputAction.equals("1")) {
				classRoom.inputInfo();
			} else if (inputAction.equals("2")) {
				classRoom.viewInfo();
			} else if (inputAction.equals("3")) {
				classRoom.viewSortInfo();
			} else if (inputAction.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("오입력입니다.");
			}
		}
	}
}
