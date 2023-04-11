import java.util.Scanner;

public class People {
	String name;
	String adress;
	String sex;
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		this.name = scanner.nextLine();
		System.out.println("주소를 입력해주세요.");
		this.adress = scanner.nextLine();
		System.out.println("성별을 입력해주세요.");
		this.sex = scanner.nextLine();
	}
	public void printInfo() {
		System.out.println("이름 :"+this.name+",주소 :"+this.adress+",성별 :"+this.sex);
	}
}
