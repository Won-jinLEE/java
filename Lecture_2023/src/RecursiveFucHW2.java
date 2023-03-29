
public class RecursiveFucHW2 {
	public static void main(String[] args) {
		int input = 200;
		System.out.println(sumSum(input, 0));
	}
	public static int sumSum(int i, int j) {//누적변수 j
		if (i < 100) {
			return j; //100까지 더했을시 누적변수 j를 반환
		} else {
			j = j + i; //i값을 누적
			i--;//i값 1씩 감소
			return sumSum(i, j);//반환
		}
	}
}