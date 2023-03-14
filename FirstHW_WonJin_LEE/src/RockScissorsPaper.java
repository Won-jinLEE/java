import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {
//	안내메세지 출력
		System.out.println("콘솔창을 클릭하고 숫자를 입력해주세요.\n0 = 가위\n1 = 바위\n2 = 보");
//	유저의 입력값을 받아오기 위한 new Scanner 선언 및 유저의 입력값을 변수 설정
		Scanner U = new Scanner(System.in);
		int User = U.nextInt();
//	컴퓨터에게 랜덤한 입력값을 받아오기 위한 new Random 선언 및 컴퓨터의 입력값(0~2사이)을 변수로 설정
		Random C = new Random();
		int Com = C.nextInt(3);
//	음수값과 3이상의 값을 입력시 종료하는 if문(수업시간 배운것을 재활용)
		if (User < 0 || User > 2) {
			System.out.println("0~2사이의 값을 입력해주세요.");
			return;
		}
//	가위, 바위, 보의 변수를 설정	
		int scissor = 0;
		int rock = 1;
		int paper = 2;
//	유저의 입력값을 받아 콘솔창에 출력해주는 if문
		if (User == scissor) {
			System.out.println("당신이 낸 것은 : 가위");
		} else if (User == rock) {
			System.out.println("당신이 낸 것은 : 바위");
		} else if (User == paper) {
			System.out.println("당신이 낸 것은 : 보");
		}
//	컴퓨터의 입력값을 받아 콘솔창에 출력해주는 if문
		if (Com == scissor) {
			System.out.println("컴퓨터가 낸 것은 : 가위");
		} else if (Com == rock) {
			System.out.println("컴퓨터가 낸 것은 : 바위");
		} else if (Com == paper) {
			System.out.println("컴퓨터가 낸 것은 : 보");
		}
//	win(2종)과 draw의 변수를 설정
		int win1 = 1;
		int win2 = -2;
		int draw = 0;
//	유저와 컴퓨터의 입력값을 뺄셈하여 승리->무승부->나머지는 패배로 판별해 콘솔창에 출력
		if (User - Com == win1 || User - Com == win2) {
			System.out.println("Win!");
		} else if (User - Com == draw) {
			System.out.println("Draw!");
		} else {
			System.out.println("Lose...");
		}
	}
}
