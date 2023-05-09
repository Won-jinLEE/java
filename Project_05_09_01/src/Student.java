
public class Student {
	Test test = new Test();
	String name;

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.test.kor = kor;
		this.test.eng = eng;
		this.test.math = math;
		this.test.sumScore = this.test.kor+this.test.eng+this.test.math;
	}
}
