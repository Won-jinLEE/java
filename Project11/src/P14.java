
public class P14 {
	public static void main(String[] args) {
//증가하는 별 삼각형
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");// 의미X
//증가하는 숫자 삼각형
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(j+1);
			}
			System.out.println("");
		}
		System.out.println("");// 의미X
//숫자 꼬깔
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < (i * 2) + 1; j++) {
				System.out.print(i + 1);
			}
			System.out.println("");
		}
		System.out.println("");// 의미X
// 밑으로 줄어드는 별 삼각형
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < 7 - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");// 의미X
// 다이아 위
		for (int i = 1; i < 7; i++) {
			if (i <= 6) {
				System.out.print(" ".repeat(7 - i));
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
// 다이아 아래
		for (int i = 7; i > 0; i--) {
			if (i <= 7) {
				System.out.print(" ".repeat(7 - i));
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
//이하 메인~~
	}
}
