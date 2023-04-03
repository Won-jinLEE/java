import java.util.Arrays;
import java.util.Random;

public class Quiz1 {
	public static void main(String[] args) {
		Random random = new Random();
		int array[] = new int[20];// 랜덤값을 받기 위한 깡통 배열
		for (int i = 0; i < 20; i++) {
			int randomValue = random.nextInt(100) + 1;// 100까지의 랜덤값
			array[i] = randomValue;
		}
		System.out.println(Arrays.toString(array));// 정렬 전의 랜덤값을 프린트
		int temp = 0;// 비교값
		for (int i = 0; i < array.length; i++) {// 내림차순을 위한 for문
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));// 정렬 후의 랜덤값을 프린트
	}
}
