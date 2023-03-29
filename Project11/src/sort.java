import java.util.Arrays;
import java.util.Random;

public class sort {
	public void doSort() {
		int[] number = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		Random random = new Random();
		for (int i = 0; i < number.length; i++) {
			// number[i] = random.nextInt(100) + 1;
			number[i] = (int) Math.floor(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(number));
		// sort (selection sort)
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					int tmp = number[i];
					number[i] = number[j];
					number[j] = tmp;
				}
			}
		}
//		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
	}
	public void abc() {
		System.out.println("Hello");
	}
}
