import java.util.Scanner;

public class Data {
	String name;
	int region;
	int sex;

	public void inputData() {
		System.out.println("이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		this.name = name;
		System.out.println("주소를 입력해주세요.(서울, 경기, 강원, 충청, 전라, 경상)");
		String region = scanner.nextLine();
		if(region.equals("서울")) {
			this.region = 0;
		}else if(region.equals("경기")) {
			this.region = 1;
		}else if(region.equals("강원")) {
			this.region = 2;
		}else if(region.equals("충청")) {
			this.region = 3;
		}else if(region.equals("전라")) {
			this.region = 4;
		}else if(region.equals("경상")) {
			this.region = 5;
		}
		System.out.println("성별을 입력해주세요.");
		String sex = scanner.nextLine();
		if (sex.equals("남") || sex.equals("남자")||sex.equals("남성")) {
			this.sex = 0;
		}else if(sex.equals("여") || sex.equals("여자")||sex.equals("여성")) {
			this.sex = 1;
		}
		System.out.println("입력된 이름은 : " + this.name + ",");
		if(this.region==0) {
			System.out.println("입력된 주소는 : 서울,");
		}else if(this.region==1) {
			System.out.println("입력된 주소는 : 경기,");
		}else if(this.region==2) {
			System.out.println("입력된 주소는 : 강원,");
		}else if(this.region==3) {
			System.out.println("입력된 주소는 : 충청,");
		}else if(this.region==4) {
			System.out.println("입력된 주소는 : 전라,");
		}else if(this.region==5) {
			System.out.println("입력된 주소는 : 경상,");
		}
		if(this.sex==0) {
			System.out.println("입력된 성별은 : 남성입니다.");
		}else if(this.sex==1){
			System.out.println("입력된 성별은 : 여성입니다.");
		}
	}
	public void info() {
		if(this.region==0&&this.sex==0) {
			System.out.println("[이름 : "+this.name+", 주소 : 서울, 성별 : 남]");
		}else if(this.region==1&&this.sex==0) {
			System.out.println("[이름 : "+this.name+", 주소 : 경기, 성별 : 남]");
		}else if(this.region==2&&this.sex==0) {
			System.out.println("[이름 : "+this.name+", 주소 : 강원, 성별 : 남]");
		}else if(this.region==3&&this.sex==0) {
			System.out.println("[이름 : "+this.name+", 주소 : 충청, 성별 : 남]");
		}else if(this.region==4&&this.sex==0) {
			System.out.println("[이름 : "+this.name+", 주소 : 전라, 성별 : 남]");
		}else if(this.region==5&&this.sex==0) {
			System.out.println("[이름 : "+this.name+", 주소 : 경상, 성별 : 남]");
		}
		if(this.region==0&&this.sex==1) {
			System.out.println("[이름 : "+this.name+", 주소 : 서울, 성별 : 여]");
		}else if(this.region==1&&this.sex==1) {
			System.out.println("[이름 : "+this.name+", 주소 : 경기, 성별 : 여]");
		}else if(this.region==2&&this.sex==1) {
			System.out.println("[이름 : "+this.name+", 주소 : 강원, 성별 : 여]");
		}else if(this.region==3&&this.sex==1) {
			System.out.println("[이름 : "+this.name+", 주소 : 충청, 성별 : 여]");
		}else if(this.region==4&&this.sex==1) {
			System.out.println("[이름 : "+this.name+", 주소 : 전라, 성별 : 여]");
		}else if(this.region==5&&this.sex==1) {
			System.out.println("[이름 : "+this.name+", 주소 : 경상, 성별 : 여]");
		}
	}
}