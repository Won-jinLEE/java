import java.util.Scanner;

public class Yagada {
	String name;
	String region;
	String sex;

	public void inputData() {
		System.out.println("이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		this.name = name;
		System.out.println("주소를 입력해주세요.([1] 서울, [2] 경기, [3] 강원, [4] 충청, [5] 전라, [6] 경상)");
		String region = scanner.nextLine();
		if (region.equals("1")) {
			this.region = "서울";
		} else if (region.equals("2")) {
			this.region = "경기";
		} else if (region.equals("3")) {
			this.region = "강원";
		} else if (region.equals("4")) {
			this.region = "충청";
		} else if (region.equals("5")) {
			this.region = "전라";
		} else if (region.equals("6")) {
			this.region = "경상";
		} else {
			System.out.println("오입력입니다. 처음부터 다시 입력해주세요.");
			return;
		}
		System.out.println("성별을 입력해주세요.([1] 남성, [2] 여성)");
		String sex = scanner.nextLine();
		if (sex.equals("1")) {
			this.sex = "남성";
		} else if (sex.equals("2")) {
			this.sex = "여성";
		} else {
			System.out.println("오입력입니다. 처음부터 다시 입력해주세요.");
			return;
		}
		System.out.println("입력된 이름은 : " + this.name + ",");
		System.out.println("입력된 지역은 : " + this.region + ",");
		System.out.println("입력된 성별은 : " + this.sex + "입니다.");
	}

	public void info() {
		System.out.println("이름 : " + this.name + ", 지역 : " + this.region + ", 성별 : " + this.sex);
	}
}
