
public class RecursiveFucHW1 {
	public static void main(String[] args) {
		System.out.println(factorial(5, 1));
	}
	public static int factorial(int i, int j) {//누적변수 j
		if (i == 1) {
			return j; // i가 1이 될때 누적변수 j를 반환
		} else {
			j = j*i; //i의 값을 곱해서 누적
			i--;
			return factorial(i, j);
		}
	}
}