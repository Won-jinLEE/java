import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ClassRoom classRoom[] = new ClassRoom[1000];
		int classRoomCount = 1;
		for (int i = 0; i < classRoom.length; i++) {
			classRoom[i] = new ClassRoom();
		}
		for (int i = 0; i < 9999999; i++) {
			System.out.println("하고 싶은 작업을 입력해주세요. [1] 반 생성 [2] 반별 학생 입력 [3] 반별 통계 조회 [q]종료");
			String s = scanner.nextLine();
			if (s.equals("1")) {
				classRoom[classRoomCount] = new ClassRoom();// 반생성 액션
				classRoom[classRoomCount].create();
				classRoom[classRoomCount].rename();
				classRoomCount = classRoomCount + 1;
			} else if (s.equals("2")) {
				System.out.println("몇반의 정보를 입력하시겠습니까?");
				String q = scanner.nextLine();
				int w = Integer.parseInt(q);
				classRoom[w].inputClass();
			} else if (s.equals("3")) {
				System.out.println("몇반의 정보를 조회하시겠습니까?");
				String q = scanner.nextLine();
				int w = Integer.parseInt(q);
				classRoom[w].classScoreInfo();
			} else if (s.equals("q")) {
				break;
			} else {
				System.out.println("오입력입니다.");
			}
		}
	}
}
