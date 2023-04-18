import java.util.Scanner;

public class Trapezoid extends Triangle {
	int lowWidth;

	Trapezoid() {
		this.name = "Trapezoid";
	}

	@Override
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name+"'s LowWidth (cm): ");
		String inputString = scanner.nextLine();
		this.lowWidth = Integer.parseInt(inputString);
		System.out.println(this.name+"'s HighWidth (cm): ");
		inputString = scanner.nextLine();
		this.width = Integer.parseInt(inputString);
		System.out.println(this.name+"'s Height (cm): ");
		inputString = scanner.nextLine();
		this.height = Integer.parseInt(inputString);
	}

	@Override
	public void calcSize() {
		this.size = (this.width + this.lowWidth) * this.height / (double) 2;
	}
}
