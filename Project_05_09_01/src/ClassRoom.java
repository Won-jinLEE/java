import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
	ArrayList<Student> student = new ArrayList<Student>();
	int studentCount = 0;

	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println((this.studentCount + 1) + "번 학생의 이름을 입력해주세요");
		String inputName = scanner.nextLine();
		try {
			System.out.println((this.studentCount + 1) + "번 학생의 국어 성적을 입력해주세요");
			String inputKor = scanner.nextLine();
			int kor = Integer.parseInt(inputKor);
			System.out.println((this.studentCount + 1) + "번 학생의 영어 성적을 입력해주세요");
			String inputEng = scanner.nextLine();
			int eng = Integer.parseInt(inputEng);
			System.out.println((this.studentCount + 1) + "번 학생의 수학 성적을 입력해주세요");
			String inputMath = scanner.nextLine();
			int math = Integer.parseInt(inputMath);
			student.add(new Student(inputName, kor, eng, math));
		} catch (Exception e) {
			System.out.println("성적이 비정상적인 값으로 입력되었습니다.");
			return;
		}
		this.studentCount++;
	}

	public void viewInfo() {
		System.out.println("입력된 학생들의 이름과 성적은");
		for (int i = 0; i < this.studentCount; i++) {
			System.out.println((i + 1) + "번 학생 의 이름 : " + student.get(i).name);
			System.out.println("              국어성적 : " + student.get(i).test.kor);
			System.out.println("              영어성적 : " + student.get(i).test.eng);
			System.out.println("              수학성적 : " + student.get(i).test.math);
			System.out.println("              총점 : " + student.get(i).test.sumScore);
		}
	}

	public void viewSortInfo() {
		System.out.println("어떤 기준으로 정렬할까요?[1]국어성적[2]영어성적[3]수학성적[4]총점");
		Student tmp = new Student("tmp", 0, 0, 0);
		Scanner scanner = new Scanner(System.in);
		String inputAction = scanner.nextLine();
		if (inputAction.equals("1")) {
			for (int i = 0; i < this.studentCount; i++) {
				for (int j = 0; j < this.studentCount; j++) {
					if (i != j && student.get(i).test.kor > student.get(j).test.kor) {
						tmp = student.get(i);
		                student.set(i, student.get(j));
		                student.set(j, tmp);
					}
				}
			}
		}

		else if (inputAction.equals("2")) {
			for (int i = 0; i < this.studentCount; i++) {
				for (int j = 0; j < this.studentCount; j++) {
					if (i != j && student.get(i).test.eng > student.get(j).test.eng) {
						tmp = student.get(i);
		                student.set(i, student.get(j));
		                student.set(j, tmp);
					}
				}
			}
		}

		else if (inputAction.equals("3")) {
			for (int i = 0; i < this.studentCount; i++) {
				for (int j = 0; j < this.studentCount; j++) {
					if (i != j && student.get(i).test.math > student.get(j).test.math) {
						tmp = student.get(i);
		                student.set(i, student.get(j));
		                student.set(j, tmp);
					}
				}
			}
		}

		else if (inputAction.equals("4")) {
			for (int i = 0; i < this.studentCount; i++) {
				for (int j = 0; j < this.studentCount; j++) {
					if (i != j && student.get(i).test.sumScore > student.get(j).test.sumScore) {
						tmp = student.get(i);
		                student.set(i, student.get(j));
		                student.set(j, tmp);
					}
				}
			}
		}

		else {
			System.out.println("오입력");
			return;
		}

		System.out.println("선택한 기준대로 정렬시 입력되어있는 학생들의 등수, 이름, 성적은");

		for (int i = 0; i < this.studentCount; i++) {
			System.out.println((i + 1) + "등 학생의 이름 : " + student.get(i).name);
			System.out.println("             국어점수 : " + student.get(i).test.kor);
			System.out.println("             영어점수 : " + student.get(i).test.eng);
			System.out.println("             수학점수 : " + student.get(i).test.math);
			System.out.println("             총점 : " + student.get(i).test.sumScore);
		}

	}

}
