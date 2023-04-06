import java.util.Scanner;

public class Yagada {
	String name;
	int region;
	String sex;
	String region01 = "서울";
	String region02 = "경기";
	String region03 = "강원";
	String region04 = "충청";
	String region05 = "전라";
	String region06 = "경상";

	public void inputNameSex() {
		System.out.println("이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		this.name = name;
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
		System.out.println("입력된 성별은 : " + this.sex + "입니다.");
	}

	public void inputRegion() {
		Scanner scanner =new Scanner(System.in);
		String region = scanner.nextLine();
		if (region.equals("1")) {
			this.region = 1;
		} else if (region.equals("2")) {
			this.region = 2;
		} else if (region.equals("3")) {
			this.region = 3;
		} else if (region.equals("4")) {
			this.region = 4;
		} else if (region.equals("5")) {
			this.region = 5;
		} else if (region.equals("6")) {
			this.region = 6;
		} else {
			System.out.println("오입력입니다. 처음부터 다시 입력해주세요.");
			return;
		}
	}

	public void regionChange() {
		System.out.println("몇번 주소를 바꾸시겠습니까?[1] " + region01 + "[2] " + region02 + "[3] " + region03 + "[4] " + region04
				+ "[5] " + region05 + "[6] " + region06);
		Scanner scanner = new Scanner(System.in);
		String inputRegion = scanner.nextLine();
		int region = Integer.parseInt(inputRegion);
		if (region == 1) {
			System.out.println("바꾸고 싶은 주소명을 입력해주세요");
			String changeRegion = scanner.nextLine();
			region01 = changeRegion;
			System.out.println("바꾸어진 주소는 [" + region01 + "]입니다.");
		} else if (region == 2) {
			System.out.println("바꾸고 싶은 주소명을 입력해주세요");
			String changeRegion = scanner.nextLine();
			region02 = changeRegion;
			System.out.println("바꾸어진 주소는 [" + region02 + "]입니다.");
		} else if (region == 3) {
			System.out.println("바꾸고 싶은 주소명을 입력해주세요");
			String changeRegion = scanner.nextLine();
			region03 = changeRegion;
			System.out.println("바꾸어진 주소는 [" + region03 + "]입니다.");
		} else if (region == 4) {
			System.out.println("바꾸고 싶은 주소명을 입력해주세요");
			String changeRegion = scanner.nextLine();
			region04 = changeRegion;
			System.out.println("바꾸어진 주소는 [" + region04 + "]입니다.");
		} else if (region == 5) {
			System.out.println("바꾸고 싶은 주소명을 입력해주세요");
			String changeRegion = scanner.nextLine();
			region05 = changeRegion;
			System.out.println("바꾸어진 주소는 [" + region05 + "]입니다.");
		} else if (region == 6) {
			System.out.println("바꾸고 싶은 주소명을 입력해주세요");
			String changeRegion = scanner.nextLine();
			region06 = changeRegion;
			System.out.println("바꾸어진 주소는 [" + region06 + "]입니다.");
		}
	}

	public void info() {
		if(this.region==1) {
			System.out.print("이름 : " + this.name + ", 성별 : " + this.sex);
		}else if(this.region==2) {
			System.out.print("이름 : " + this.name + ", 성별 : " + this.sex);
		}else if(this.region==3) {
			System.out.print("이름 : " + this.name + ", 성별 : " + this.sex);
		}else if(this.region==4) {
			System.out.print("이름 : " + this.name + ", 성별 : " + this.sex);
		}else if(this.region==5) {
			System.out.print("이름 : " + this.name + ", 성별 : " + this.sex);
		}else if(this.region==6) {
			System.out.print("이름 : " + this.name + ", 성별 : " + this.sex);
		}
	}
}
