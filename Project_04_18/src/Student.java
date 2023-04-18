import java.util.Scanner;

public class Student {
	String name;
	String sex;
	String address;
	Test[] test = { new Test("중간고사"), new Test("기말고사") };

	Student(String name, String sex, String address) {
		this.name = name;
		this.sex = sex;
		this.address = address;
	}

	@Override
	public String toString() { // .toString()을 생략하여도 메서드가 자동으로 호출됨
		return this.name + " (" + this.sex + ", " + this.address + ")";
	}

	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < this.test.length; i++) {
			System.out.println("" + i + " : " + this.test[i].name);
		}
		System.out.println("입력을 원하는 시험을 선택해주세요.");
		String selectTest = scanner.nextLine();
		int selectTestNumber = Integer.parseInt(selectTest);
		this.test[selectTestNumber].inputScore();
	}
}
