import java.util.Scanner;
//장준하 : [ClassRoom]클래스의 [classAllStudentInfo]메서드(4번 액션) 개발 및 전 클래스 예외처리 작업,  그 외 : 이원진
public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ClassRoom classRoom[] = new ClassRoom[1000];
		int classRoomCount = 1;
		for (int i = 0; i < classRoom.length; i++) {
			classRoom[i] = new ClassRoom();
		}
		for (int i = 0; i < 9999999; i++) {
			System.out.println("하고 싶은 작업을 입력해주세요. [1] 반 생성 [2] 반별 학생 입력 [3] 반별 통계 조회 [4] 반별 학생정보 전체 조회 [q]종료");
			String inputAction = scanner.nextLine();
			if (inputAction.equals("1")) {
				classRoom[classRoomCount] = new ClassRoom();// 반생성 액션
				classRoom[classRoomCount].create();
				System.out.println("생성된 반의 정보는 : " + classRoomCount + "번째 반, 반 이름 : " + classRoom[classRoomCount].name);
				classRoomCount = classRoomCount + 1;
			} else if (inputAction.equals("2")) {
				System.out.println("몇번째 반의 정보를 입력하시겠습니까?");
				if (classRoomCount == 1) {
					System.out.println("생성된 반이 없습니다. 메뉴로 돌아갑니다.");
					continue;
				} else {
					for (int j = 1; j < classRoomCount; j++) {
						System.out.println(j+"번째 반 : "+classRoom[j].name+"반");
					}
				}
				String inputClass = scanner.nextLine();
				int classValue = Integer.parseInt(inputClass);
				classRoom[classValue].inputClass();
			} else if (inputAction.equals("3")) {
				System.out.println("몇반의 정보를 조회하시겠습니까?");
				if (classRoomCount == 1) {
					System.out.println("생성된 반이 없습니다. 메뉴로 돌아갑니다.");
					continue;
				} else {
					for (int j = 1; j < classRoomCount; j++) {
						System.out.println(j+"번째 반 : "+classRoom[j].name+"반");
					}
				}
				String inputClass = scanner.nextLine();
				int classValue = Integer.parseInt(inputClass);
				classRoom[classValue].classScoreInfo();
			} else if (inputAction.equals("4")) {
				System.out.println("몇반의 학생 정보를 조회하시겠습니까?");
				if (classRoomCount == 1) {
					System.out.println("생성된 반이 없습니다. 메뉴로 돌아갑니다.");
					continue;
				} else {
					for (int j = 1; j < classRoomCount; j++) {
						System.out.println(j+"번째 반 : "+classRoom[j].name+"반");
					}
				}
				String inputClass = scanner.nextLine();
				int classValue = Integer.parseInt(inputClass);
				classRoom[classValue].classAllStudentInfo();
			} else if (inputAction.equals("q")) {
				break;
			} else {
				System.out.println("오입력입니다.");
			}
		}
	}
}
