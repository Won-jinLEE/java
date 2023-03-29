import java.util.Scanner;

public class SaveBox {
	int coin;
	String name;
	boolean isBroken = false;

	public void deposit() {
		if (this.isBroken) {
			System.out.println("이 저금통은 더 이상 사용이 불가능합니다.");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name + "에 입금할 금액을 입력해주세요.");
		String inputString = scanner.nextLine();
		int inputCoin = Integer.parseInt(inputString);
		this.coin = this.coin + inputCoin;
		System.out.println("땡그랑~");
		System.out.println("현재 " + this.name + "의 보유금액은 " + this.coin + "원 입니다.");
	}

	public void withdraw() {
		if (this.isBroken) {
			System.out.println("이 저금통은 더 이상 사용이 불가능합니다.");
			return;
		}
		System.out.println(this.name + "을 깼습니다.");
		System.out.println("최종 출금 금액은 " + coin + "원입니다.");
		this.coin = 0;
		this.isBroken = true;
	}

	public void setName(String name) {
		this.name = name;
	}
}
