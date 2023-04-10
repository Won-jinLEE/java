import java.util.Arrays;

public class Quiz3 {
	public static void main(String[] args) {
		Quiz3 quiz = new Quiz3();
		int[] asdf = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(quiz.solution(asdf)));
	}

	public int[] solution(int[] num_list) {
		int answer[] = new int[2];
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 1) {
				answer[1] = answer[1] + 1;
			} else {
				answer[0] = answer[0] + 1;
			}
		}
		return answer;
	}
}
