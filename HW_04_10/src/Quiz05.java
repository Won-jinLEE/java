import java.util.Arrays;

public class Quiz05 {
	public static void main(String[] args) {
		Quiz05 quiz = new Quiz05();
		System.out.println(quiz.solution("try hello world"));
	}

	public String solution(String s) {
		String answer = "";

		String[] array = s.split("");
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				array[i] = array[i].toUpperCase();
			}
			if (i % 2 == 0) {
				array[i] = array[i].toUpperCase();
			}
		}
		StringBuilder answerBuild = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			answerBuild.append(array[i]);
		}

		answer = answerBuild.toString();

		return answer;
	}
}
