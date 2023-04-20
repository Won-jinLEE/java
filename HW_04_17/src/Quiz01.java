
public class Quiz01 {
	// 최대공약수와 최소공배수를 리턴
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		// 최대공약수
		int a= n;
		int b= m;
		int c = 1;
		if (n > m && n % m == 0) {
			answer[0] = m;
		} else if (m > n && m % n == 0) {
			answer[0] = n;
		} else if (n > m && n % m != 0) {
			for (int i = b; i >= 2; i--) {
				for(int j = 0; j<99999; j++) {
					if (n % i == 0 && m % i == 0) {
						n = n / i;
						m = m / i;
						c = c * i;
					}else {
						break;
					}
				}
			}
			answer[0] = c;
		} else if (m > n && m % n != 0) {
			for (int i = a; i >= 2; i--) {
				for(int j = 0; j<99999; j++) {
					if (n % i == 0 && m % i == 0) {
						n = n / i;
						m = m / i;
						c = c * i;
					}else {
						break;
					}
				}
			}
			answer[0] = c;
		} else if (n == m) {
			answer[0] = n;
		}
		// 최소공배수
		if (n > m && n % m == 0) {
			answer[1] = n;
		} else if (m > n && m % n == 0) {
			answer[1] = m;
		} else if (n > m && n % m != 0) {
			for (int i = b; i >= 2; i--) {
				for(int j = 0; j<99999; j++) {
					if (n % i == 0 && m % i == 0) {
						n = n / i;
						m = m / i;
						c = c * i;
					}else {
						break;
					}
				}
			}
			answer[1] = n * m * c;
		} else if (m > n && m % n != 0) {
			for (int i = a; i >= 2; i--) {
				for(int j = 0; j<99999; j++) {
					if (n % i == 0 && m % i == 0) {
						n = n / i;
						m = m / i;
						c = c * i;
					}else {
						break;
					}
				}
			}
			answer[1] = n * m * c;
		} else if (n == m) {
			answer[1] = n;
		}
		return answer;
	}
}
