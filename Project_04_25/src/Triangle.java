import java.util.Random;

public class Triangle extends Base{
	private int width;
	private int height;
	
	Triangle(){
		this.name = "삼각형";
	}
	
	@Override
	protected void inputNumber() {
		Random random = new Random();
		this.width = random.nextInt(10)+1;
		this.height = random.nextInt(10)+1;
	}
	
	@Override
	protected void calcSize() {
		this.size = this.height*this.width/ (double)2;
	}
	
	@Override
	public void printSize() {
		super.printSize();
	}
}
