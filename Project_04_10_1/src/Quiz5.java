
public class Quiz5 {
	public static void main(String[] args) {
		Quiz5 quiz = new Quiz5();
		String asdf = quiz.solution(1);
		System.out.println(asdf);
	}

	public String solution(int num) {
		String answer = "";
		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}
}
