import java.util.Scanner;

public class SaveBox {
	int coin = 0;
	boolean isBroken = false;
	String name = "돼지";

	// 입금
	public void deposit() {
		System.out.println("입금할 금액을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String inputCoinString = scanner.nextLine();
		int inputCoin = Integer.parseInt(inputCoinString);
		this.coin = this.coin + inputCoin;
		System.out.println("" + inputCoin + "이 입금되었습니다. 현재 총액은 " + this.coin);
	}

	// 출금
	public void withdraw() {
		System.out.println("" + this.coin + "이 출금되었습니다.");
		this.isBroken = true;
	}

	// 액션
	public void doAction() {
		if (this.isBroken) {
			System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
			return;
		}
		System.out.println("1. 입금, 2. 출금, 3. 저금통 이름 지정, 4. 저금통 조회 중 선택해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputAction = scanner.nextLine();
		if (inputAction.equals("1")) {
			this.deposit();
		} else if (inputAction.equals("2")) {
			this.withdraw();
		} else if (inputAction.equals("3")) {
			this.setName();
		} else if (inputAction.equals("4")) {
			this.info();
		} else {
			System.out.println("입력이 잘못되었습니다. 다시 입력해주세요.");
			this.doAction();
		}
	}

	public void setName() {
		System.out.println("변경할 이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.nextLine();
		this.name = inputName;
	}

	public void info() {
		if (this.isBroken) {
			System.out.println(this.name + " (더이상 사용할 수 없습니다.)");
		} else {
			System.out.println(this.name + " (현재 잔액 : " + this.coin + ")");
		}
	}

	public String toString() { // 객체에서 메소드를 실행시 자동으로 불려가는 메소드
		String infoString = this.name + " (현재 잔액 : " + this.coin + ")";
		return infoString;
	}
}
