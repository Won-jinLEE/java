import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int respondentValue = 1000;
		int respondentCount = 0;
		int region01Count = 0;
		int region02Count = 0;
		int region03Count = 0;
		int region04Count = 0;
		int region05Count = 0;
		int region06Count = 0;
		int maleCount = 0;
		int femaleCount = 0;
		Scanner scanner = new Scanner(System.in);
		Yagada basic = new Yagada();
		Yagada[] yagada = new Yagada[respondentValue];
		for (int i = 0; i < respondentValue; i++) {
			System.out.println("하고 싶은 작업을 골라주세요. [1] 자료 입력 [2] 지역변경 [q] 결과 출력(종료)");
			String inputValue = scanner.nextLine();
			if (inputValue.equals("1")) {
				yagada[respondentCount] = new Yagada();
				yagada[respondentCount].inputNameSex();
				System.out.println(
						"주소를 입력해주세요.([1] " + basic.region01 + ", [2] " + basic.region02 + ", [3] " + basic.region03
								+ ", [4] " + basic.region04 + ", [5] " + basic.region05 + ", [6] " + basic.region06);
				yagada[respondentCount].inputRegion();
				if (yagada[respondentCount].region == 1) {
					System.out.println("입력된 지역은 : " + basic.region01 + "입니다.");
				}else if (yagada[respondentCount].region == 2) {
					System.out.println("입력된 지역은 : " + basic.region02 + "입니다.");
				}else if (yagada[respondentCount].region == 3) {
					System.out.println("입력된 지역은 : " + basic.region03 + "입니다.");
				}else if (yagada[respondentCount].region == 4) {
					System.out.println("입력된 지역은 : " + basic.region04 + "입니다.");
				}else if (yagada[respondentCount].region == 5) {
					System.out.println("입력된 지역은 : " + basic.region05 + "입니다.");
				}else if (yagada[respondentCount].region == 6) {
					System.out.println("입력된 지역은 : " + basic.region06 + "입니다.");
				}
				respondentCount = respondentCount + 1;
			} else if (inputValue.equals("2")) {
				basic.regionChange();
			} else if (inputValue.equals("q")) {
				System.out.println("작업이 종료되어 결과값이 출력됩니다.");
				break;
			}
		}
		System.out.println("입력된 전체 데이터는");
		System.out.println("-----------------------------");
		for (int i = 0; i < respondentCount; i++) {
			yagada[i].info();
			if (yagada[i].region == 1) {
				System.out.println(", 지역 : "+basic.region01);
			} else if (yagada[i].region == 2) {
				System.out.println(", 지역 : "+basic.region02);
			} else if (yagada[i].region == 3) {
				System.out.println(", 지역 : "+basic.region03);
			} else if (yagada[i].region == 4) {
				System.out.println(", 지역 : "+basic.region04);
			} else if (yagada[i].region == 5) {
				System.out.println(", 지역 : "+basic.region05);
			} else if (yagada[i].region == 6) {
				System.out.println(", 지역 : "+basic.region06);
			}
		}
		System.out.println("-----------------------------");
		for (int i = 0; i < respondentCount; i++) {
			if (yagada[i].region == 1) {
				region01Count = region01Count + 1;
			} else if (yagada[i].region == 2) {
				region02Count = region02Count + 1;
			} else if (yagada[i].region == 3) {
				region03Count = region03Count + 1;
			} else if (yagada[i].region == 4) {
				region04Count = region04Count + 1;
			} else if (yagada[i].region == 5) {
				region05Count = region05Count + 1;
			} else if (yagada[i].region == 6) {
				region06Count = region06Count + 1;
			}
			if (yagada[i].sex.equals("남성")) {
				maleCount = maleCount + 1;
			} else if (yagada[i].sex.equals("여성")) {
				femaleCount = femaleCount + 1;
			}
		}
		System.out.println("지역별 통계는 " + basic.region01 + " : " + region01Count + "명,");
		System.out.println("                  " + basic.region02 + " : " + region02Count + "명,");
		System.out.println("                  " + basic.region03 + " : " + region03Count + "명,");
		System.out.println("                  " + basic.region04 + " : " + region04Count + "명,");
		System.out.println("                  " + basic.region05 + " : " + region05Count + "명,");
		System.out.println("                  " + basic.region06 + " : " + region06Count + "명이고,");
		System.out.println("성별별 통계는 남성 : " + maleCount + "명,");
		System.out.println("                  여성 : " + femaleCount + "명입니다.");
	}
}
