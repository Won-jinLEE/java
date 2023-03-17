import java.util.Scanner;

public class pp2 {
	public static void main(String[] args) {
	System.out.println("숫자를 입력해주세요 :");
	Scanner s = new Scanner(System.in);
	int userNum = s.nextInt();
	
	for (int i = userNum; i>0; i-=3) {
		System.out.println("입력하신 숫자"+userNum+"를 3으로 나눈 값은"+i+"입니다.");
	}
	}
}