
public class Quiz08_01 {
	public static void main(String[] args) {
		Quiz08_01 quiz = new Quiz08_01();
		System.out.println(quiz.solution(2, 5));
	}
	public Integer solution(Integer start, Integer n) {
		Integer answer = 0;
		Integer a[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = start;
			start++;
		}
		for (int i = 0; i < n; i++) {
			answer = answer + a[i];
		}
		return answer;
	}
}
