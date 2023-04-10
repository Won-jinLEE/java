import java.util.Arrays;

public class Quiz01 {
	public static void main(String[] args) {
		int[] qwer = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] zxcv = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		Quiz01 quiz = new Quiz01();
		System.out.println(Arrays.toString(quiz.solution(qwer, zxcv)));
	}

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int a = commands[i][0] - 1;
			int b = commands[i][1] - 1;
			int c = commands[i][2] - 1;
			int answerArray[] = new int[b - a + 1];
			for (int j = 0; j < b - a + 1; j++) {
				for (int k = a; k <= b; k++) {
					answerArray[j] = array[k];
					j++;
				}
			}
			Arrays.sort(answerArray);
			answer[i] = answerArray[c];
		}
		return answer;
	}
}
