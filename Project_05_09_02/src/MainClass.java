import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Student>student = new ArrayList<Student>();
		student.add(new Student("홍길동", 100));
		student.add(new Student("둘리", 50));
		student.add(new Student("희동", 20));
		
		for(int i =0; i<student.size(); i++) {
			System.out.println(student.get(i).name+":"+student.get(i).score);
		}
		
		student.add(new Student("또치", 30));
		
		for(int i =0; i<student.size(); i++) {
			System.out.println(student.get(i).name+":"+student.get(i).score);
		}
	}
}
