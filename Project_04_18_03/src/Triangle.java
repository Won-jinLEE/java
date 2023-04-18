import java.util.Scanner;

public class Triangle {
	String name;
	int width = 0;
	int height = 0;
	double size = 0;

	Triangle() {
		this.name = "Triangle";
	}

	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name+"'s Width (cm): ");
		String inputString = scanner.nextLine();
		this.width = Integer.parseInt(inputString);
		System.out.println(this.name+"'s Height (cm): ");
		inputString = scanner.nextLine();
		this.height = Integer.parseInt(inputString);
	}

	public void calcSize() {
		this.size = this.width * this.height / (double)2;
	}

	public void printSize() {
		System.out.println(this.name + " size : " + this.size+"cm²");
	}

	public void doAction() {
		this.inputSize();
		this.calcSize();
		this.printSize();
	}
}
