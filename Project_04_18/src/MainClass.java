import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		ClassRoom[] classRoom = { new ClassRoom("A반"), new ClassRoom("B반"), new ClassRoom("C반"), new ClassRoom("D반") };
		Scanner scanner = new Scanner(System.in);
		for (int k = 0; k < 9999999; k++) {
			System.out.println("---------전체 반 목록---------");
			for (int i = 0; i < classRoom.length; i++) {
				System.out.println("" + i + " : " + classRoom[i]);
			}
			System.out.println("수정할 반 번호 입력 (종료 : q)");
			String selectClass = scanner.nextLine();
			if (selectClass.equals("q")) {
				break;
			}
			int selectClassNumber = Integer.parseInt(selectClass);
			classRoom[selectClassNumber].showMenu();
			System.out.println();
			System.out.println();
		}
	}
}
