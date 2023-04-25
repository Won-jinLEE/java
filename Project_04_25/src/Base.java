
public abstract class Base { 
	protected String name;
	protected double size;
	
	Base(){
		this.name = "도형";
	}
	
	protected abstract void inputNumber(); //abstract = 추상화
																		//상속 받은곳에서 해당 메소드의 구현을 강제함
	protected abstract void calcSize();
	
	protected void printSize() {
		System.out.println(this.name + " size : " + this.size+"(cm²)");
	}
	
	public void doAction() {
		this.inputNumber();
		this.calcSize();
		this.printSize();
	}
	
}
