import java.util.Scanner;

public class Manager {
	SaveBox[] saveBox = new SaveBox[100];
	int saveBoxCount = 0;

	public boolean showMenu() {
		System.out.println("---------------------현재 저금통 목록.---------------------");
		for (int j = 0; j < saveBoxCount; j++) {
			System.out.print(j + " : ");
			saveBox[j].info();
		}
		System.out.println();
		System.out.println("---------------------원하시는 메뉴를 선택해주세요.---------------------");
		System.out.println("1. 저금통 생성");
		System.out.println("2. 저금통 액션 (입금, 출금)");
		System.out.println("q. 종료");

		Scanner scanner = new Scanner(System.in);
		String menuSelect = scanner.nextLine();
		if (menuSelect.equals("q")) {
			System.out.println("작업종료");
			return false;
		} else if (menuSelect.equals("1")) {
			if (saveBoxCount < saveBox.length) {
				saveBox[saveBoxCount] = new SaveBox();
				saveBoxCount++;
			} else {
				System.out.println("저금통 생성 개수를 초과했습니다. 최대 만들 수 있는 저금통 갯수는 " + saveBox.length + "입니다.");
			}
		} else if (menuSelect.equals("2")) {
			// 저금통 액션 (입금, 출금)
			System.out.println("현재 " + saveBoxCount + "의 저금통이 있습니다.  0부터 " + (saveBoxCount - 1) + "의 숫자를 입력");
			System.out.println("액션을 원하는 저금통의 숫자(INDEX)를 입력해주세요.");
			String saveBoxSelect = scanner.nextLine();
			// 정수인지 검사해서 종료(이번 수업에선 들어가지 않음.)
			int selectNumber = Integer.parseInt(saveBoxSelect);
			if (selectNumber < 0 || selectNumber >= saveBoxCount) {
				System.out.println("입력된 값이 잘못 되엇습니다.");
				this.showMenu();
			}
			saveBox[selectNumber].doAction();
		} else {
			System.out.println("오입력입니다.");
		}
		return true;
	}
}
