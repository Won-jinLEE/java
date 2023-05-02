import java.util.Scanner;

public class Bilge {
	String productName;
	double sellValue;
	String buyerName;
	String buyerCall;
	String buyerAddress;

	Bilge() {
		this.productName = "기본상품명";
		this.sellValue = 0;
		this.buyerName = "김기동";
		this.buyerCall = "";
		this.buyerAddress = "";
	}

	public void inputInfo1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("구매자의 이름을 입력해주세요.");
		this.buyerName = scanner.nextLine();
		System.out.println("구매자의 연락처를 입력해주세요.");
		this.buyerCall = scanner.nextLine();
		System.out.println("배송지 주소를 입력해주세요.");
		this.buyerAddress = scanner.nextLine();
	}

	public void info() {
		System.out.println("구매서에 작성된 상품명 : " + this.productName);
		System.out.println("구매서에 작성된 판매가 : " + this.sellValue + "원");
		System.out.println("구매서에 작성된 구매자 이름 : " + this.buyerName);
		System.out.println("구매서에 작성된 구매자 연락처 : " + this.buyerCall);
		System.out.println("구매서에 작성된 배송지 주소 : " + this.buyerAddress);
	}

	public void inputInfo2(String productName, double sellValue) {
		this.productName = productName;
		this.sellValue = (Math.ceil((sellValue) / 10)) * 10;
	}

	public void modify() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수정하실 연락처를 입력해주세요.");
		this.buyerCall = scanner.nextLine();
		System.out.println("수정하실 배송지를 입력해주세요.");
		this.buyerAddress = scanner.nextLine();
	}
}
