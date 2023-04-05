import java.util.Scanner;

public class Data {
	String name;
	int sex;
	String region;

	public void inputData() {
		System.out.println("이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		this.name = name;
		System.out.println("성별을 입력해주세요.");
		String sex = scanner.nextLine();
		if (sex.equals("남") || sex.equals("남자")||sex.equals("남성")) {
			this.sex = 0;
		}else if(sex.equals("여") || sex.equals("여자")||sex.equals("여성")) {
			this.sex = 1;
		}
		System.out.println("입력된 이름은 : " + this.name + ",");
		System.out.println("");
		if(this.sex==0) {
			System.out.println("입력된 성별은 : 남성입니다.");
		}else if(this.sex==1){
			System.out.println("입력된 성별은 : 여성입니다.");
		}
	}
	public void info() {
	}
}