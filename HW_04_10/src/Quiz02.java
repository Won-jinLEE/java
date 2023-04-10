import java.util.Arrays;

public class Quiz02 {
	public static void main(String[] args) {
		Quiz02 quiz = new Quiz02();
		System.out.println(quiz.solution(12));
	}

	public boolean solution(int x) {
		boolean answer = false;
		String num = Integer.toString(x);
		int[] arrNum = new int[num.length()];
		int tmp = 0;
		for (int i = 0; i < num.length(); i++) {
			arrNum[i] = num.charAt(i) - '0';
			tmp = tmp + arrNum[i];
		}
		int numInt = Integer.parseInt(num);
		if ((numInt % tmp) == 0) {
			answer = true;
			return answer;
		} else {
			return answer;
		}
	}
}
