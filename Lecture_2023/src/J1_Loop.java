
public class J1_Loop {
	public static void main(String[] args) {
		// 반복문 for
		// for(초기값 ; 종료조건 ; 증가분)
		for (int i = 0; i > -5; i -= 1) { // duplicated
			System.out.println(i);
		}
		
		for (int l = 1; l < 10; l++) {
			for (int k = 1; k < 10; k++)
				for (int j = 1; j < 10; j++)
					System.out.println(l + "*" + k + "*" + j + "=" + (l * k * j));
			
			String str[] = { "김기동", "이원진" };
			System.out.println(str[1]);
			
			int array[] = { -21, 2, 3, 4, 52 };
			for(int i=0; i <array.length; i++) {
				System.out.println(array[i]);}
			
			for(int a: array) {
				System.out.println(a);
			}
		}
	}
}