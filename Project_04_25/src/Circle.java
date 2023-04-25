import java.util.Random;
import java.util.Scanner;

public class Circle extends Base {
	private double half;

	Circle() {
		super();
		this.name = "원";
	}

	@Override
	protected void inputNumber() {
		Random random = new Random();
		this.half = random.nextInt(10)+1;
	}

	@Override
	protected void calcSize() {
		this.size = this.half * this.half * Math.PI;
		this.size = Math.round(this.size*100) / (double)100;
	}

	@Override
	public void printSize() {
		super.printSize();
	}
}
