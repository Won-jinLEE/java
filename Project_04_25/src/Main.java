import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Base[] b = new Base[10];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < b.length; i++) {
			System.out.println((i + 1) + "번째 도형은 무엇으로 할까요?[1]삼각형[2]사각형[3]원");
			String inputNum = scanner.nextLine();
			int num = Integer.parseInt(inputNum);

			if (num == 1) {
				b[i] = new Triangle();
			} else if (num == 2) {
				b[i] = new Square();
			} else if (num == 3) {
				b[i] = new Circle();
			} else {
				System.out.println("오입력");
				i--;
				continue;
			}

			if (i == (b.length - 1)) {
				for (int j = 0; j < b.length; j++) {
					System.out.print((j + 1) + "번째 도형은 ");
					b[j].doAction();
				}
			}

			Base b2 = new C2();
			((C2) b2).test(); // 객체 캐스팅, 실제 기능은 자식 클래스지만 컴퓨터는 부모 클래스로 인지하기 때문에 객체 캐스팅을 통해 자식 클래스로 인지 시켜줘야 자식
										// 클래스의 기능을 사용이 가능해짐

		}
	}
}
