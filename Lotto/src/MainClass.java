import java.util.Arrays;
import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		int drawingValue = 6;
		int lotto[] = new int[drawingValue];
		Random random = new Random();
		for (int i = 0; i < drawingValue; i++) {
			int draw = random.nextInt(45) + 1;
			lotto[i] = draw;
		}
		for (int i = 0; i < drawingValue; i++) {
			for (int j = 0; j < drawingValue; j++) {
				if (i != j && lotto[i] == lotto[j]) {
					int reDraw = random.nextInt(45) + 1;
					lotto[j] = reDraw;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}
