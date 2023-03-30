import java.util.Scanner;

public class SaveBox {
	int coin;
	String name;
	boolean useStatus = false;// ture==존재하는 계좌 false==존재하지 않는 계좌

	public void create() {// 계좌 생성 메소드
		if (this.useStatus == true) {
			System.out.println("입력하신 인덱스값은 이미 배정되어있습니다.");
			return;
		}
		this.useStatus = true;// 생성
		System.out.println("[" + this.name + "] 계좌가 생성되었습니다.");
	}

	public void select() {// 계좌 조회 메소드
		if (this.useStatus == false) {
			System.out.println("존재하지 않는 계좌입니다.");
			return;
		}
		System.out.println("본 계좌의 이름은 [" + this.name + "]이며, [" + this.name + "] 계좌의 현재 금액은 " + this.coin + "원입니다.");
	}

	public void deposit() {// 입금 메소드(수업시간때 했던거 재활용)
		if (this.useStatus == false) {
			System.out.println("존재하지 않는 계좌입니다.");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("[" + this.name + "] 계좌에 입금할 금액을 입력해주세요.");
		String inputString = scanner.nextLine();
		int inputCoin = Integer.parseInt(inputString);
		this.coin = this.coin + inputCoin;
		System.out.println("[" + this.name + "] 계좌에 " + inputCoin + "원이 입금되었습니다.");
		System.out.println("본 [" + this.name + "] 계좌의 보유금액은 " + this.coin + "원 입니다.");
	}

	public void withdraw() {// 출금 메소드(수업시간때 했던거 재활용)
		if (this.useStatus == false) {
			System.out.println("존재하지 않는 계좌입니다.");
			return;
		}
		System.out.println("[" + this.name + "] 계좌를 깼습니다.");
		System.out.println("최종 출금 금액은 " + coin + "원입니다.");
		this.coin = 0;
		this.useStatus = false;
	}

	public void setName(String name) {// 작명 메소드(수업시간때 했던거 재활용)
		this.name = name;
	}

}