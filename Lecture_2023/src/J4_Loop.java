import java.lang.reflect.Array;
import java.util.Arrays;

public class J4_Loop {
	public static void main(String[] args) {
		int c[] = { 4, 5, 6, 1, 2 };
		int temp;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					mySwap(c, i, j);
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}

	public static void mySwap(int array[], int i, int j) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
}
