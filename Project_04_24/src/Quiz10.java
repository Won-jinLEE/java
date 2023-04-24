
public class Quiz10 {
	public static void main(String[] args) {
		Quiz10 quiz = new Quiz10();
		System.out.println(quiz.solution(510));
	}

	public int solution(int input) {
		int money = 1000 - input;
		int coin500 = 500;
		int coin100 = 100;
		int coin50 = 50;
		int coin10 = 10;
		int coin5 = 5;
		int coin1 = 1;
		int answer = 0;
		
		for (int i = 0; i < 999999; i++) {
			if (money - coin500 >= 0) {
				money = money - coin500;
				answer = answer + 1;
			} else {
				break;
			}
		}
		
		for (int i = 0; i < 999999; i++) {
			if (money - coin100 >= 0) {
				money = money - coin100;
				answer = answer + 1;
			} else {
				break;
			}
		}
		
		for (int i = 0; i < 999999; i++) {
			if (money - coin50 >= 0) {
				money = money - coin50;
				answer = answer + 1;
			} else {
				break;
			}
		}
		
		for (int i = 0; i < 999999; i++) {
			if (money - coin10 >= 0) {
				money = money - coin10;
				answer = answer + 1;
			} else {
				break;
			}
		}
		
		for (int i = 0; i < 999999; i++) {
			if (money - coin5 >= 0) {
				money = money - coin5;
				answer = answer + 1;
			} else {
				break;
			}
		}
		
		for (int i = 0; i < 999999; i++) {
			if (money - coin1 >= 0) {
				money = money - coin1;
				answer = answer + 1;
			} else {
				break;
			}
		}
		
		return answer;
	}
}
