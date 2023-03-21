
public class P17 {
	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {
			if (i <= 6) {
				System.out.print(" ".repeat(7 - i));
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		for (int i = 7; i > 0; i--) {
			if (i <= 7) {
				System.out.print(" ".repeat(7 - i));
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
