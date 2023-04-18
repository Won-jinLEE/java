
public class Static_Remember {
	static int maxLength = 100; // static (2). static 키워드를 붙여서 초기화가 안됨
	
	final static int MAX_LENGTH = 100; // final : 바뀌면 안되는놈한테 붙임
	
	public static void likeFunction() { // static (1). 객체를 선언하지 않아도 사용가능 
		System.out.println(maxLength);
		maxLength++;
//		MAX_LENGTH++;
	}
}
