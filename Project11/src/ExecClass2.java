import java.util.Arrays;
import java.util.Random;

public class ExecClass2 {
	public static void main(String[] args) {
		int[][] number = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				number[i][j] = random.nextInt(100);
			}
		}
		for (int i = 0; i<3; i++) {
			for (int j =0; j<3; j++) {
				number[i][3] = number[i][3]+number[i][j];
				number[3][j] = number[3][j]+number[i][j];
				number[3][3] = number[3][3]+number[i][j];
			}
		}
		
		for (int i = 0; i<number.length; i ++) {
			for (int j = 0; j<number.length; j++) {
				System.out.printf("%02d ", number[i][j]);
			}
			System.out.println();
		}
	}
}
