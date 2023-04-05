import java.util.Scanner;

public class Region {
	String region;

	public void name() {
		System.out.println("추가하고 싶은 지역명을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		this.region = name;
		System.out.println("현재 입력된 지역명은 " + this.region);
	}

	public void info() {
		System.out.println("현재 입력되어있는 지역명은 " + this.region);
	}
}
