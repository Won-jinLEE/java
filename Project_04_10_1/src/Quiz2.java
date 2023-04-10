
public class Quiz2 {
	public static void main(String[] args) {
		Quiz2 quiz = new Quiz2();
		System.out.println(quiz.solution(102));
	}

	public int solution(int n) {
		int answer = 0;
		for (int i = 0; i <= 999999; i++) {
			if (n > 0 && n <= 1000) {
				if (n % 2 == 0) {
					answer = answer + n;
					n = n - 2;
				} else {
					n = n - 1;
				}
			} else {
				break;
			}
		}
		return answer;
	}
}
