
public class P5 {
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			if (i < 8) {
				for (int j = 0; j < 7 - i; j++) {
					System.out.print("  ");
				}
				for (int j = 0; j < (i * 2) + 1; j++) {
					System.out.print("*");
				}
				System.out.println("");
			} 
			else {
				for (int j = 0; j < i-7; j++) {
					System.out.print("  ");
				}
				for (int j = 30; j > (i * 2) + 1; j--) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
