import java.util.Arrays;
import java.util.Scanner;

public class P10 {
	public static void main(String[] args) {
		int inputValue[] = new int[7];
		int inputValueLen = inputValue.length;
		Scanner scanner = new Scanner(System.in);
		System.out.println("7개의 숫자를 입력해주세요.");
		for (int i = 0; i < inputValueLen; i++) {
			inputValue[i] = scanner.nextInt();
		}
		int swapIndexValue = 0;
		for (int i = 0; i < inputValueLen; i++) {
			for (int j = 0; j < inputValueLen; j++) {
				if (j > 0 && inputValue[j - 1] > inputValue[j]) {
					swapIndexValue = inputValue[j];
					inputValue[j] = inputValue[j - 1];
					inputValue[j - 1] = swapIndexValue;
				}
			}
		}
		System.out.println("최소값은 : " + inputValue[0]);
		System.out.println("최대값은 : " + inputValue[inputValueLen - 1]);
		int avgValue = 0;
		int lenCount = 0;
		for (int i = 0; i < inputValueLen; i++) {
			if (i > 0 && inputValue[0] == inputValue[i]) {
				inputValue[i] = 0;
			} else if (inputValue[inputValueLen - 1] == inputValue[i]) {
				inputValue[i] = 0;
			} else if (i > 0) {
				avgValue = avgValue + inputValue[i];
				lenCount = lenCount + 1;
			}
		}
		if (lenCount > 0) {
			System.out.println("최소값과 최대값을 제외한 평균은 " + (avgValue / lenCount) + "입니다.");
		}else if(lenCount ==0) {
			System.out.println("분모가 0이라서 평균을 못구합니다.");
		}
	}
}