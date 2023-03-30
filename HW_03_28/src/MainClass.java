import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int account = 500;// 계좌의 갯수 변수
		SaveBox saveBox[] = new SaveBox[account + 1];// 배열 생성
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= account; i++) {// 생성된 배열에 각각 SaveBox를 부여
			saveBox[i] = new SaveBox();
		}
		for (int i = 0; i < 999999; i++) {
			System.out.println("어떤 작업을 실행하시겠습니까?"); // 메인메뉴
			System.out.println("[1]계좌 생성");
			System.out.println("[2]계좌 조회");
			System.out.println("[3]입금");
			System.out.println("[4]출금");
			System.out.println("[q]종료");
			String menuSelect = scanner.nextLine();
			if (menuSelect.equals("q")) {// 종료 액션
				System.out.println("작업이 종료되었습니다.");
				break;
			}
			for (int j = 0; j < 9999999; j++) {
				if (menuSelect.equals("1")) {// 계좌 생성
					System.out.println("계좌의 이름을 입력해주세요.");
					String naming = scanner.nextLine();//계좌명 입력
					System.out.println("몇번째 인덱스에 계좌를 생성하시겠습니까?(1~" + account + "번 인덱스까지 사용가능)");
					int accountNumber = scanner.nextInt();//계좌 인덱스 입력
					saveBox[accountNumber].setName(naming);// 계좌 작명 액션
					saveBox[accountNumber].create();// 계좌생성 액션
					for (int k = 0; k < 9999999; k++) {// 메뉴 2번 출력되는것을 방지하기 위한 for문(1)
						String asdf = scanner.nextLine();
						break;
					}
					break;
				} else if (menuSelect.equals("2")) {// 계좌 조회
					System.out.println("몇번 계좌를 조회하시겠습니까?");
					String checkNumber = scanner.nextLine();//계좌 인덱스 체크
					int accountNumber = Integer.parseInt(checkNumber);
					saveBox[accountNumber].select();// 조회 액션
					for (int k = 0; k < 9999999; k++) {
						System.out.println("추가적인 작업을 하시겠습니까?(존재하지 않는 계좌를 선택하셨을시 [q]를 눌러주세요)"); // 조회 후 추가메뉴
						System.out.println("[1]입금");
						System.out.println("[2]출금");
						System.out.println("[q]메뉴로");
						String addAction = scanner.nextLine();
						if (addAction.equals("1")) {
							saveBox[accountNumber].deposit();// 입금 액션
						} else if (addAction.equals("2")) {
							saveBox[accountNumber].withdraw();// 출금 액션
							break;
						} else if (addAction.equals("q")) {// 메인 메뉴로
							break;
						}
					}
					break;
				} else if (menuSelect.equals("3")) {// 입금
					System.out.println("몇번 계좌에 입금하시겠습니까?");
					String checkNumber = scanner.nextLine();
					int accountNumber = Integer.parseInt(checkNumber);
					saveBox[accountNumber].deposit();// 입금 액션
					for (int k = 0; k < 9999999; k++) {
						System.out.println("본 계좌에 추가로 입금을 하시겠습니까?"); // 입금 후 추가메뉴
						System.out.println("[1]네");
						System.out.println("[2]아니요");
						String addAction = scanner.nextLine();
						if (addAction.equals("1")) {//입금 액션
							saveBox[accountNumber].deposit();
						} else if (addAction.equals("2")) {//메인 메뉴로
							break;
						}
					}
					break;
				} else if (menuSelect.equals("4")) {// 출금
					System.out.println("몇번 계좌에서 출금하시겠습니까?");
					String checkNumber = scanner.nextLine();
					int accountNumber = Integer.parseInt(checkNumber);
					saveBox[accountNumber].withdraw();// 출금 액션
					for (int k = 0; k < 9999999; k++) {// 메뉴 2번 출력되는것을 방지하기 위한 for문(2)
						break;
					}
					break;
				} else {
					System.out.println("오입력입니다. 다시 입력해주세요.");
					break;
				}
			}
		}
	}
}
