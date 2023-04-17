
public class Quiz08_02 {
	public static void main(String[] args) {
		Quiz08_02 quiz = new Quiz08_02();
		System.out.println(quiz.solution("123"));
	}
	
	public int solution(String s) {
		int answer = 0;
		answer = Integer.parseInt(s);
		return answer;
	}
}
