
public class Quiz4 {
	public static void main(String[] args) {
		int[] qwer = { 1, 1, 2, 3, 4, 5 };
		Quiz4 quiz = new Quiz4();
		System.out.println(quiz.solution(qwer, 1));
	}

	public int solution(int[] array, int n) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				answer = answer + 1;
			}
		}
		return answer;
	}
}
