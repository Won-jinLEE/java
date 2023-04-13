
public class Quiz04 {
	public static void main(String[] args) {
	}

	public long solution(long n) {
		double result = Math.sqrt(n);
		int resultInt = (int) result;
		long resultInt2 = (long)resultInt;
		long answer = 0;
		if (result == resultInt2) {
			resultInt2 = resultInt2 + 1;
			answer = resultInt2 * resultInt2;
			return answer;
		} else {
			answer = -1;
			return answer;
		}
	}
}
