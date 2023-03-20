
public class J1_Loop6 {
	public static void main(String[] args) {
//	// 정수형 배열 선언
//	int a[] = { 1, 2, 3 };
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//	}
//	// 실수형 배열 선언		
//	double b[] = { 1.1, 2.2, 3.3 };
//	for (int i = 0; i < b.length; i++) {
//		System.out.println(b[i]);
//	}
//	// 문자열 배열 선언		
//	String str[] = { "mon", "tue", "wed" };
//	for (int i = 0; i < str.length + 1; i++) {
//		System.out.println(str[i]);
//	}
//	// 배열의 평균 구하기
//	int aLen = a.length;
//	System.out.println(aLen);
//	// swap fuction
//	// call by value VS call by reference	
//	// int c1[] = {1, 2, 3, 4, 5};
//	// c1[] = reference -> 저장되어있는 주소값을 알려줌(ex 주석에 a논문의 b페이지의 c~d줄에서 발췌)
//	// c1[0] = value -> 지정된 값을 박아버림(ex 주석에 "천상천하 유아독존")
//	int c = 3;
//	int d = 4;
//	int tmp;
//	tmp = c; // 3
//	c = d; //4
//	d = tmp; //
//	System.out.println(c);
//	System.out.println(d);
		int[] num = new int[5]; // <-인덱스값이 아닌 공간의 갯수
		num[0] = 2;
		num[1] = 3;
		num[2] = 1;
		num[3] = 5;
		num[4] = 4;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		// 최소값을 담을 변수를 초기화 할때는 Integer.MAX_VALUE(최대값)값으로 초기화를 해야한다.
		// 최대값을 담을 변수를 초기화 할때는 Integer.MIN_VALUE(최소값)값으로 초기화를 해야한다.
		// 최대, 최소 값을 출력해주세요.
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("최대값은 " + max + ", 최소값은 " + min);
	}
}