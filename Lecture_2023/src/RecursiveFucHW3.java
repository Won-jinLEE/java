
public class RecursiveFucHW3 {
	public static void main(String[] args) {
		System.out.println(fibonacci(0, 0));
	}
	public static int fibonacci(int i, int j) {//누적변수 j
		if (i > 10) {//몇번째 수열값까지 더하는지 정하는 값
			return j;
		} else {
			j = j + i;
			i++;
			return fibonacci(i, j);
		}
	}
}
