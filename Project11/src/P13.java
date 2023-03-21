//100까지의 소수를 출력
public class P13 {
	public static void main(String[] args) {
		for (int i = 2; i < 101; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}