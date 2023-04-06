import java.util.Scanner;

public class Region {
	String regionName;
	int regionCount;
	public void region() {
		System.out.println("지역명을 입력해주세요.");
		Scanner scanner =new Scanner(System.in);
		String name = scanner.nextLine();
		this.regionName = name;
		this.regionCount = this.regionCount+1;
	}
}
