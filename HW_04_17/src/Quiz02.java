
public class Quiz02 {
	// 정수 n의 약수를 모두 더한값을 리턴
	public int solution(int n) {
		int answer = 0;
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				answer = answer + i;
			}
		}
		return answer;
	}
}
