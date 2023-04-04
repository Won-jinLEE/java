import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int studentCount = 30;
		int count = 1;
		double korTotal = 0, engTotal = 0, mathTotal = 0;
		
		Student student[] = new Student[studentCount];

		for(int i = 0; i< studentCount; i++) {
			student[i] = new Student();
			System.out.println(count+"번째 학생의 이름을 입력해주세요");
			Scanner scanner = new Scanner(System.in);
			String inputName = scanner.nextLine();
			count = (count+1);
			student[i].inputGrade();
		}
		
		for(int i = 0; i<studentCount; i++) {
			korTotal = korTotal + student[i].kor;
			engTotal = engTotal + student[i].eng;
			mathTotal = mathTotal + student[i].math;
		}
		
		System.out.println("국어 총점은 : "+korTotal+"점,\n영어 총점은 : "+engTotal+"점,\n수학 총점은 : "+mathTotal+"점,");
		System.out.println("국어 평균은 : "+(korTotal/studentCount)+"점,\n영어 평균은 : "+(engTotal/studentCount)+"점,\n수학 평균은 : "+(mathTotal/studentCount)+"점입니다.");
	}
}
