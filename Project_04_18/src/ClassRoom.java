import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ClassRoom {
	String name;
	Student[] student = new Student[100];
	int index = 0;
	int middleScoreTotal = 0;
	int finalScoreTotal = 0;

	ClassRoom(String name) {
		this.name = name;
	}

	@Override
	public String toString() { //.toString()을 생략하여도 메서드가 자동으로 호출됨
		return this.name + " (" + this.index + "명)";
	}

	public void addStudent() { //1번 액션
		System.out.println("추가할 학생 정보를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("성별 (남자 or 여자) : ");
		String sex = scanner.nextLine();
		System.out.println("주소 (서울, 부산 ...) : ");
		String address = scanner.nextLine();
		this.student[this.index] = new Student(name, sex, address);
		this.index++;
	}

	public void printStudents() { //2번 액션
		for (int i = 0; i < this.index; i++) {
			System.out.println("" + i + " : " + student[i]);
		}
	}

	public void inputScore() { //3번 액션
		this.printStudents();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력을 원하는 학생 선택");
		String selectStudent = scanner.nextLine();
		int selectStudentNumber = Integer.parseInt(selectStudent);
		if (this.student[selectStudentNumber] != null) {
			this.student[selectStudentNumber].showMenu();
		}
	}

	public void calcTotal() { //4번 액션
		this.middleScoreTotal = 0;
		this.finalScoreTotal = 0;
		for (int i = 0; i < this.index; i++) {
			this.middleScoreTotal = this.middleScoreTotal + this.student[i].test[0].total;
			this.finalScoreTotal = this.finalScoreTotal + this.student[i].test[1].total;
		}
	}

	public void sortMiddleTotal() { //5번 액션
		for (int i = 0; i < this.index; i++) {
			for (int j = 0; j < this.index; j++) {
				if (i != j && this.student[i].test[0].total > this.student[j].test[0].total) {
					Student temp = this.student[i];
					this.student[i] = this.student[j];
					this.student[j] = temp;
				}
			}
		}

//		Arrays.sort(student, new Comparator<Student>() {
//			@Override
//			public int compare(Student i1, Student i2) {
//				return i1.test[0].total - i2.test[0].total;
//			}
//		});

		this.printStudents();
	}

	public void sortFinalTotal() { //6번 액션
		for (int i = 0; i < this.index; i++) {
			for (int j = 0; j < this.index; j++) {
				if (i != j && this.student[i].test[1].total > this.student[j].test[1].total) {
					Student temp = this.student[i];
					this.student[i] = this.student[j];
					this.student[j] = temp;
				}
			}
		}

//		Arrays.sort(student, new Comparator<Student>() {
//			@Override
//			public int compare(Student i1, Student i2) {
//				return i1.test[1].total - i2.test[1].total;
//			}
//		});

		this.printStudents();
	}

	public void showMenu() { //메뉴 액션
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 목록 출력");
		System.out.println("3. 시험 점수 입력");
		System.out.println("4. 시험 총점 출력");
		System.out.println("5. 중간 순위 출력");
		System.out.println("6. 기말 순위 출력");
		String selectMenu = scanner.nextLine();
		if (selectMenu.equals("1")) {
			this.addStudent();
		} else if (selectMenu.equals("2")) {
			this.printStudents();
		} else if (selectMenu.equals("3")) {
			this.inputScore();
		} else if (selectMenu.equals("4")) {
			this.calcTotal();
			System.out.println("중간고사 총점 : " + this.middleScoreTotal);
			System.out.println("기말고사 총점 : " + this.finalScoreTotal);
		} else if (selectMenu.equals("5")) {
			this.sortMiddleTotal();
		} else if (selectMenu.equals("6")) {
			this.sortFinalTotal();
		} else {
			System.out.println("입력이 잘못 되었습니다.");
			this.showMenu();
		}
	}

}
