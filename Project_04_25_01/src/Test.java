
public class Test implements I1, I2 { // extends java.lang.Object = 모든 클래스는 Object클래스를 기본적으로 상속받음 그래서 생략되어있음

	public void doAction() {
		System.out.println("hello");
	}

	public void doAction(int number) {
		System.out.println("hello" + number);
	}

	public void doAction(String name) {
		System.out.println("hello" + name);
	}

	public void doAction(int number1, int number2) {
		System.out.println("hello" + (number1 + number2));
	}

	@Override
	public String toString() {
		System.out.println("sdfsdfsdfsdfdsfsdf");
		return "sdfsdf";
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

}
