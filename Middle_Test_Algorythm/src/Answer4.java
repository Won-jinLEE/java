import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Answer4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputN = scanner.nextLine();
		int N = Integer.parseInt(inputN);
		int arr[] = new int[5]; 
		int count= 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			String inputValue = scanner.nextLine();
			int value = Integer.parseInt(inputValue);
			arr[i] = value;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] %N ==0) {
				list.add(arr[i]);
				count++;
			}
		}
		if(count==0) {
			System.out.println("-1");
		}else {
			  Collections.sort(list);
		        for (int i = 0; i < list.size(); i++) {
		            System.out.println(list.get(i));
		        }
		}
	}
}
