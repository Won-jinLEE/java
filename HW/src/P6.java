
public class P6 {
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			if (i < 8) {
				for (int j = 0; j < i; j++) {
					System.out.print("  ");
				}
				for (int j = 15; j > (i * 2); j--) {
					System.out.print("*");
				}
				System.out.println("");
			} 
			else {
				for (int j = 0; j < 14 - i; j++) {
					System.out.print("  ");
				}
				for (int j = 0; j < (i * 2) -13; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
