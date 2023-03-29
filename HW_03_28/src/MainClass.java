import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int account=500;//계좌의 갯수 변수
		SaveBox saveBox[] = new SaveBox[account+1];//배열 생성
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= account; i++) {//생성된 배열에 각각 SaveBox를 부여
			saveBox[i] = new SaveBox();
		}
		for (int i = 0; i < 999999; i++) {
			System.out.println("어떤 작업을 실행하시겠습니까?");
			System.out.println("[1]계좌 생성");
			System.out.println("[2]계좌 조회");
			System.out.println("[3]입금");
			System.out.println("[4]출금");
			System.out.println("[q]종료");
			String menuSelect = scanner.nextLine();
			if (menuSelect.equals("q")) {//종료 액션
				System.out.println("작업이 종료되었습니다.");
				break;
			}
			for (int j = 0; j < 9999999; j++) {
				if (menuSelect.equals("1")) {//생성 액션
					System.out.println("계좌의 이름을 입력해주세요.");
					String naming = scanner.nextLine();
					System.out.println("몇번째 인덱스에 계좌를 생성하시겠습니까?(1~"+account+"번 인덱스까지 사용가능)");
					int accountNumber = scanner.nextInt();
					saveBox[accountNumber].setName(naming);
					saveBox[accountNumber].create();
					break;
				} else if (menuSelect.equals("2")) {//조회 액션
					System.out.println("몇번 계좌를 조회하시겠습니까?");
					String checkNumber = scanner.nextLine();
					int accountNumber = Integer.parseInt(checkNumber);
					saveBox[accountNumber].select();
					System.out.println("본 계좌에서 추가적인 작업을 하시겠습니까?");
					System.out.println("[1]입금");
					System.out.println("[2]출금");
					System.out.println("[q]메뉴로");
					String addAction = scanner.nextLine();
					if(addAction.equals("1")) {
						saveBox[accountNumber].deposit();
					}else if(addAction.equals("2")) {
						saveBox[accountNumber].withdraw();
					}else if(addAction.equals("q")) {
						break;
					}
					break;
				} else if (menuSelect.equals("3")) {//입금 액션
					System.out.println("몇번 계좌에 입금하시겠습니까?");
					String checkNumber = scanner.nextLine();
					int accountNumber = Integer.parseInt(checkNumber);
					saveBox[accountNumber].deposit();
					break;
				} else if (menuSelect.equals("4")) {//출금 액션
					System.out.println("몇번 계좌에서 출금하시겠습니까?");
					String checkNumber = scanner.nextLine();
					int accountNumber = Integer.parseInt(checkNumber);
					saveBox[accountNumber].withdraw();
					break;
				}
			}
		}
	}
}
