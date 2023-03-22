
public class P3 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			if (i == 0 || i == 8) {
				for (int j = 0; j < 9; j++) {
					System.out.print("*");
				}
			}else {
				System.out.print("*               *");
			}System.out.println("");
		}
	}
}
