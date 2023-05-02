import java.util.Scanner;

public class Goods {
	String name;
	int price;
	int inventory;
	double discount;

	Goods() {
		this.name = "기본상품명";
		this.price = 0;
		this.inventory = 0;
		this.discount = 0;
	}

	public void registration() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품의 이름을 입력해주세요.");
		this.name = scanner.nextLine();
		System.out.println("상품의 가격을 입력해주세요.");
		String inputPrice = scanner.nextLine();
		this.price = Integer.parseInt(inputPrice);
		System.out.println("상품의 재고를 입력해주세요.");
		String inputInventory = scanner.nextLine();
		this.inventory = Integer.parseInt(inputInventory);
		System.out.println("상품의 할인율을 입력해주세요.");
		String inputDiscount = scanner.nextLine();
		this.discount = (Double.parseDouble(inputDiscount) / (double) 100);
	}

	public void info() {
		System.out.println("상품명 : " + this.name + ", ");
		System.out.println("상품 가격 : " + this.price + "원, ");
		System.out.println("상품의 재고 : " + this.inventory + "개, ");
		System.out.println("상품의 할인율 : " + (this.discount * 100) + "%입니다.");
		System.out.println();
	}

	public void sell() {
		this.inventory = this.inventory - 1;
	}

	public void Change() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("현재 상품의 재고량 : " + this.inventory);
		System.out.println("몇개로 수정하시겠습니까?");
		String input = scanner.nextLine();
		this.inventory = Integer.parseInt(input);
	}

}
