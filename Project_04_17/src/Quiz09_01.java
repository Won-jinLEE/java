
public class Quiz09_01 {
	public int solution(int[] array, int n) {
		int answer = 0;
		int count[] = {};
		for (int i = 0; i < array.length; i++) {
			if (array[i] != n) {
				count[i] = array[i];
			}
		}
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count.length; j++) {
				if (i != j && count[i] == count[j] && count[i] != 0 && count[j] != 0) {
					count[i] = 0;
					count[j] = 0;
					answer++;
				}
			}
		}
		return answer;
	}
}
