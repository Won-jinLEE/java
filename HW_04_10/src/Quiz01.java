import java.util.Arrays;

public class Quiz01 {

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
