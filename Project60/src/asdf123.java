public class asdf123 {
	public static void main(String[] args) {
		for (int a = 7; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				if((a*b)%2==1) {
					System.out.println(a+"*"+b+"="+(a*b)+",홀수입니다");
				}else {
					System.out.println(a+"*"+b+"="+(a*b)+",짝수입니다");
				}
				if(b==9) {
					System.out.println("-----------------------------------");
				}
			}
		}
	}
}