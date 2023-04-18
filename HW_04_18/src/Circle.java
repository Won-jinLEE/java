import java.util.Scanner;

public class Circle extends Triangle {
	Circle() {
		this.name = "Circle";
	}
	@Override
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name+"'s radius (cm): ");
		String inputString = scanner.nextLine();
		this.width = Integer.parseInt(inputString);
	}
	@Override
	public void calcSize() {
		this.size = this.width * this.width *Math.PI;
	}
}
