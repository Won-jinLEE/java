import java.util.Scanner;

public class P16 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		
		for (int i = 0; i < 5; i++) {
			System.out.print(" ".repeat(5 - i));
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
