
public class Test {
	int kor;
	int math;
	int eng;
	int sumScore = kor + math + eng;

	Test() {
		this.kor = 0;
		this.math = 0;
		this.eng = 0;
		this.sumScore = 0;
	}
	public void sumScore() {
		this.sumScore = this.kor+this.math+this.eng;
	}
}
