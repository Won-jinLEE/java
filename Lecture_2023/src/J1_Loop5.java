
public class J1_Loop5 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i < 10) {
				System.out.println("2*" + i + "=" + (2 * i));
			} else if (i < 40) {
				System.out.println("쓸모없는짓임");
			} else {
				System.out.println("쓸데없는짓임ㅅㄱ");
			}
		}
	}
}
