import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		Random r = new Random();
		int randomValue = r.nextInt(100);
		System.out.println("임의의 값은: " + randomValue);
		System.out.println("2로 나눈 나머지 값은: " + (randomValue % 2));
		double d = r.nextDouble();
		System.out.println(d);
//	랜덤한 숫자로 문자 나타내기(아스키 코드)
		int FirstASCII = r.nextInt(26) + 65;//대문자
		int SecondASCII = r.nextInt(26) + 97;//소문자
		char FirstC = (char)FirstASCII;
		System.out.println(FirstC);
		
		boolean a;
		a = 3 == 10;//같냐?
		a = 3 !=4;//다르냐?
		a = 3 > 4;
		a = 3 < 4;
		a = 3>= 4;
		a = 3<= 4;
		System.out.println(a);
		
		int x = 0;
		a = x < 10 || x%2 == 0;
		a = x < 10 && x%2 == 0;
		a = true || (10 < x);
		
		int H = 10;
		if (H<= 10 ) {
			System.out.println("sdfsdf");
		}
	}
}
