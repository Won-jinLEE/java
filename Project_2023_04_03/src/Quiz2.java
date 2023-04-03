import java.util.Arrays;

public class Quiz2 {
	public static void main(String[] args) {
		int[][] res = new int[8][9];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				res[i][j] = (i + 2) * (j + 1);
			}
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.println(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
