import java.util.Arrays;

public class J1_Loop9 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		String str = Arrays.toString(a);
		String num[] = str.split(",");
		for (int i = 0; i < num.length; i++) {
			num[i] = num[i].replace("[", "");
			num[i] = num[i].replace("]", "");
			num[i] = num[i].trim();
			System.out.println(num[i]);
		}
	}
}