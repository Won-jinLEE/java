import java.util.Arrays;

public class Array2D {
	public static void main(String[] args) {

		int[][] a = { { 1, 2, }, { 3, 4 }, { 5, 6 } };
		System.out.println(Arrays.deepToString(a));

		int[][] b = new int[2][2];
		int cnt = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = ++cnt;
			}
		}
		System.out.println(Arrays.deepToString(b));

		int[][] org = { { 1, 2 }, { 3, 4, } };
		int[][] tar = new int[2][2];
		for (int i = 0; i < org.length; i++) {
			for (int j = 0; j < org[i].length; j++) {
				tar[i][j] = org[i][j];
			}
		}
		System.out.println(Arrays.deepToString(tar));
		int tar2[] [] = new int [2] [2];
		System.arraycopy(org, 0, tar2, 0, org[0].length);
		System.out.println("----------------------------");
		System.out.println(Arrays.deepToString(tar2));
	}
}
