import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 10, 216, 517, 1, 199, 22, 503 }; // int = 단순숫자

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr, Collections.reverseOrder(null)); // 타입이 맞지 않아서 뒤집지 못함
		Integer[] arr2 = new Integer[arr.length]; // Integer =

		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}

		Arrays.sort(arr2, Collections.reverseOrder(null));
		System.out.println(Arrays.toString(arr2));

		myCompareClass mcc = new myCompareClass(); // 1번 유형
		Arrays.sort(arr2, mcc);
		System.out.println(Arrays.toString(arr2));

		Comparator<Integer> myCompare = new Comparator<Integer>() { // 2번 유형
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		};
		Arrays.sort(arr2, myCompare);
		System.out.println(Arrays.toString(arr2));

		Arrays.sort(arr2, new Comparator<Integer>() { // 3번 유형
			public int compare(Integer i1, Integer i2) {
				return i1 - i2;
			}
		});
		System.out.println(Arrays.toString(arr2));

		Arrays.sort(arr2, (a, b) -> { // 4번 유형 : 람다식 -> 코테 대비용
			return b - a;
		});
		System.out.println(Arrays.toString(arr2));
		
		
	}
} // end of Main
// <T> : Generic

class myCompareClass implements Comparator<Integer> { // 1번 유형
	public int compare(Integer a, Integer b) {
		return a - b;
	}
}
