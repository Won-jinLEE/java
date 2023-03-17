import java.util.Scanner;

public class Dugeon_and_Dragon {
	public static void main(String[] args) {
		int l = 7;
		System.out.println("숫자입력 : ");
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		if (k > 0 && k < 21) {
			for (int i = k; i < 21; i++) {
				System.out.println(l + "*" + i + "=" + (l * i));
			}
		} else {
			System.out.println("ERROR");
		}
	}
}