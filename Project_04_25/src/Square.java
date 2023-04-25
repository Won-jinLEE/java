import java.util.Random;
import java.util.Scanner;

public class Square extends Base{
	private int width;
	private int height;
	
	Square(){
		this.name = "사각형";
	}
	
	@Override
	protected void inputNumber() {
		Random random = new Random();
		this.width = random.nextInt(10)+1;
		this.height = random.nextInt(10)+1;
	}
	
	@Override
	protected void calcSize() {
		this.size = this.height*this.width;
	}
	
	@Override
	public void printSize() {
		super.printSize();
	}
}
