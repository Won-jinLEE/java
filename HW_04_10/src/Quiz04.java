
public class Quiz04 {
	public static void main(String[] args) {
		Quiz04 quiz = new Quiz04();
		System.out.println(quiz.solution(1));
	}

	public long solution(long n) {
		double result = Math.sqrt(n);
		int resultInt = (int) result;
		long answer = 0;
		if (result == resultInt) {
			resultInt = resultInt + 1;
			answer = resultInt * resultInt;
			return answer;
		} else {
			answer = -1;
			return answer;
		}
	}
}
