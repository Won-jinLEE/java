import java.util.Arrays;

public class Quiz3 {
	public static void main(String[] args) {
		int arr[][] = { { 10, 33, 44 }, { 27, 5, 98 } };
		int adsf[][] = new int[arr.length+1][5];
		System.out.println(arr.length);
		
		for (int i = 0; i < adsf.length; i++) {
			for (int j = 0; j < adsf[i].length; j++) {
				int rowLen = adsf.length;
				int colLen = adsf[i].length;
				if (i < rowLen-1 && j < colLen-2) {
					adsf[i][j] = arr[i][j];
					adsf[rowLen-1][j] = adsf[rowLen-1][j] + adsf[i][j];
				} else if (i < rowLen-1 && j == colLen-2) {
					adsf[i][colLen-2] = adsf[i][0] + adsf[i][1] + adsf[i][2];
				} else if (i < colLen-1 && j == colLen-1) {
					adsf[i][colLen-1] = (adsf[i][0] + adsf[i][1] + adsf[i][2]) / rowLen;
				}
			}
		}
		System.out.println(Arrays.deepToString(adsf));
	}
}
