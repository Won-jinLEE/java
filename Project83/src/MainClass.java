import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int respondentValue = 1000;
		int count = 0;
		int maleCount = 0;
		int femaleCount = 0;
		Scanner scanner = new Scanner(System.in);
		Yagada[] yagada = new Yagada[respondentValue];
		for (int i = 0; i < respondentValue; i++) {
			System.out.println("하고 싶은 작업을 골라주세요. [1] 자료 입력 [2] 지역명 입력 [q] 결과 출력(종료)");
			String inputValue = scanner.nextLine();
			if (inputValue.equals("1")) {
				yagada[count] = new Yagada();
				yagada[count].inputData();
				count = count + 1;
			}else if (inputValue.equals("2")) {
				System.out.println("작업이 종료되어 결과값이 출력됩니다.");
				break;
			}
			else if (inputValue.equals("q")) {
				System.out.println("작업이 종료되어 결과값이 출력됩니다.");
				break;
			}
		}
		System.out.println("입력된 전체 데이터는");
		System.out.println("-----------------------------");
		for (int i = 0; i < count; i++) {
			yagada[i].info();
		}
		System.out.println("-----------------------------");
		for (int i = 0; i < count; i++) {
			if (yagada[i].region.equals("서울")) {
				seoulCount = seoulCount + 1;
			} else if (yagada[i].region.equals("경기")) {
				gyeongiCount = gyeongiCount + 1;
			} else if (yagada[i].region.equals("강원")) {
				gangwonCount = gangwonCount + 1;
			} else if (yagada[i].region.equals("충청")) {
				chungcheongCount = chungcheongCount + 1;
			} else if (yagada[i].region.equals("전라")) {
				junraCount = junraCount + 1;
			} else if (yagada[i].region.equals("경상")) {
				gyeongsangCount = gyeongsangCount + 1;
			}
			if (yagada[i].sex.equals("남성")) {
				maleCount = maleCount + 1;
			} else if (yagada[i].sex.equals("여성")) {
				femaleCount = femaleCount + 1;
			}
		}
		System.out.println("지역별 통계는 서울 : " + seoulCount + "명,");
		System.out.println("                  경기 : " + gyeongiCount + "명,");
		System.out.println("                  강원 : " + gangwonCount + "명,");
		System.out.println("                  충청 : " + chungcheongCount + "명,");
		System.out.println("                  전라 : " + junraCount + "명,");
		System.out.println("                  경상 : " + gyeongsangCount + "명이고,");
		System.out.println("성별별 통계는 남성 : " + maleCount + "명,");
		System.out.println("                  여성 : " + femaleCount + "명입니다.");
	}
}
