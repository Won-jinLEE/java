import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Answer5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[6];
		int arr2[] = new int[6];
		for (int i = 0; i < arr.length; i++) {
			String inputValue = scanner.nextLine();
			int value = Integer.parseInt(inputValue);
			arr[i] = value;
		}
		for (int i = 0; i < arr2.length; i++) {
			String inputValue = scanner.nextLine();
			int value = Integer.parseInt(inputValue);
			arr2[i] = value;
		}
		Arrays.sort(arr);
		Arrays.sort(arr2);
		boolean a = true;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==arr2[i]) {
				
			}else {
				a =false;
				break;
			}
		}
		if(a==false) {
			System.out.println("F");
		}else {
			System.out.println("T");
		}
	}
}
