
public class Quiz03 {
	public static void main(String[] args) {
		Quiz03 quiz = new Quiz03();
		System.out.println(quiz.solution(626331));
	}

	public int solution(int num) {
		int answer = 0;
		for (int i = 0; i < 9999999; i++) {
			if (num == 1) {
				break;
			} else {
				if (num % 2 == 0) {
					num = (num / 2);
					answer = answer + 1;
				} else {
					num = (num * 3) + 1;
					answer = answer + 1;
				}
				if (answer == 500) {
					answer = -1;
					break;
				}
			}
		}
		return answer;
	}
}
