
public class MainClass {
	public static void main(String[] args) {
		Student[] student = new Student[30];
		for (int i = 0; i < student.length; i++) {
			// 객체 생성
			student[i] = new Student();
			student[i].inputData();
		}

		// 계산
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		for (int i = 0; i < student.length; i++) {
			korTotal = korTotal + student[i].kor;
			engTotal = engTotal + student[i].eng;
			mathTotal = mathTotal + student[i].math;
		}

		// 출력
		System.out.println("국어 점수 총점 : " + korTotal + ", 평균 : " + (korTotal / (double) student.length));
		System.out.println("영어 점수 총점 : " + engTotal + ", 평균 : " + (engTotal / (double) student.length));
		System.out.println("수학 점수 총점 : " + mathTotal + ", 평균 : " + (mathTotal / (double) student.length));
	}
}
