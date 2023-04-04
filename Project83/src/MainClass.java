
public class MainClass {
	public static void main(String[] args) {
		int respondentValue = 5;
		int seoulCount = 0;
		int gyeongiCount = 0;
		int gangwonCount = 0;
		int chungcheongCount = 0;
		int junraCount = 0;
		int gyeongsangCount = 0;
		int maleCount = 0;
		int femaleCount = 0;
		Yagada[] yagada = new Yagada[respondentValue];
		for(int i = 0; i<respondentValue; i++) {
			yagada[i]=new Yagada();
			yagada[i].inputData();
		}
		System.out.println("입력된 전체 데이터는");
		System.out.println("-----------------------------");
		for (int i = 0; i<respondentValue; i++) {
			yagada[i].info();
		}
		System.out.println("-----------------------------");
		for(int i = 0; i<respondentValue; i++) {
			if(yagada[i].region==0) {
				seoulCount = seoulCount+1;
			}else if(yagada[i].region==1) {
				gyeongiCount = gyeongiCount+1;
			}else if(yagada[i].region==2) {
				gangwonCount = gangwonCount+1;
			}else if(yagada[i].region==3) {
				chungcheongCount = chungcheongCount+1;
			}else if(yagada[i].region==4) {
				junraCount = junraCount+1;
			}else if(yagada[i].region==4) {
				gyeongsangCount = gyeongsangCount+1;
			}
			if(yagada[i].sex==0) {
				maleCount = maleCount+1;
			}else if(yagada[i].sex==1) {
				femaleCount = femaleCount+1;
			}
		}
		System.out.println("지역별 통계는 서울 : "+seoulCount+"명,");
		System.out.println("                  경기 : "+gyeongiCount+"명,");
		System.out.println("                  강원 : "+gangwonCount+"명,");
		System.out.println("                  충청 : "+chungcheongCount+"명,");
		System.out.println("                  전라 : "+junraCount+"명,");
		System.out.println("                  경상 : "+gyeongsangCount+"명이고,");
		System.out.println("성별별 통계는 남성 : "+maleCount+"명,");
		System.out.println("                  여성 : "+femaleCount+"명입니다.");
	}
}
