import java.util.Scanner;

public class Student {// 학생 이름, 주소, 성별에 관련된 메서드만
	String name;
	String address;
	int sex = 0; // 1=남성 2=여성
	Test test[] = new Test[2];
	boolean studentStatus = false;

	public void create() {
		this.studentStatus = true;
	}

	public void inputInfo() {
		if (studentStatus == false) {
			System.out.println("없는 학생입니다.");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		this.name = scanner.nextLine();
		System.out.println("주소를 입력해주세요.");
		this.address = scanner.nextLine();
		System.out.println("성별을 입력해주세요.[1]남성 [2]여성");
		String asdf = scanner.nextLine();
		int a = Integer.parseInt(asdf);
		if (a == 1 || a == 2) {
			this.sex = a;
		}else {
			System.out.println("다시 입력하세요.");
			return;
		}
		System.out.println("중간고사의 성적을 입력해주세요.");
		this.test[0] = new Test();
		this.test[0].inputScore();
		System.out.println("기말고사의 성적을 입력해주세요.");
		this.test[1] = new Test();
		this.test[1].inputScore();
	}
}
