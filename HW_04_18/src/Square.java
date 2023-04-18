public class Square extends Triangle {
	Square() {
		this.name = "Square";
	}

	@Override // 이걸 명시하지 않으면 오타날시에 재정의의 역할이 아닌 새로운 매서드를 정의하는것으로 인식함
	public void calcSize() {
		this.size = this.width * this.height;
	}

}
