import java.util.Scanner;

public class ClassRoom {
	String name;
	Student[] student = new Student[100];
	int classRoomStudentCount = 0;
	int maleCount = 0;
	int femaleCount = 0;
	boolean classStatus = false;
	double maleMiKOR = 0;
	double maleMiENG = 0;
	double maleMiMATH = 0;
	double maleFiKOR = 0;
	double maleFiENG = 0;
	double maleFiMATH = 0;
	double femaleMiKOR = 0;
	double femaleMiENG = 0;
	double femaleMiMATH = 0;
	double femaleFiKOR = 0;
	double femaleFiENG = 0;
	double femaleFiMATH = 0;

	public void create() { // 1번 액션
		this.classStatus = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("반의 이름을 입력해주세요.");
		this.name = scanner.nextLine();
	}

	public void inputClass() { // 2번 액션
		if (this.classStatus == false) {
			System.out.println("존재하지 않는 반입니다.");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		for (int i = 0; i < student.length; i++) {
			System.out.println("하실 작업을 입력해주세요.[1] 학생 입력 [m] 메뉴로");
			String inputValue = scanner.nextLine();
			if (inputValue.equals("1")) {
				student[i].create();
				student[i].inputInfo();
				this.classRoomStudentCount++;
				if (student[i].sex == 1) {
					this.maleCount++;
				} else if (student[i].sex == 2) {
					this.femaleCount++;
				}
			} else if (inputValue.equals("m")) {
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	public void classScoreInfo() { // 3번 액션
		if (this.classStatus == false) {
			System.out.println("존재하지 않는 반입니다.");
			return;
		}
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null) {
				System.out.println("아직 학생정보가 입력되지 않았습니다.");
				return;
			} else if (student[i].sex == 1) {
				this.maleMiKOR = this.maleMiKOR + student[i].test[0].korScore;
				this.maleMiENG = this.maleMiENG + student[i].test[0].engScore;
				this.maleMiMATH = this.maleMiMATH + student[i].test[0].mathScore;
				this.maleFiKOR = this.maleFiKOR + student[i].test[1].korScore;
				this.maleFiENG = this.maleFiENG + student[i].test[1].engScore;
				this.maleFiMATH = this.maleFiMATH + student[i].test[1].mathScore;
			} else if (student[i].sex == 2) {
				this.femaleMiKOR = this.femaleMiKOR + student[i].test[0].korScore;
				this.femaleMiENG = this.femaleMiENG + student[i].test[0].engScore;
				this.femaleMiMATH = this.femaleMiMATH + student[i].test[0].mathScore;
				this.femaleFiKOR = this.femaleFiKOR + student[i].test[1].korScore;
				this.femaleFiENG = this.femaleFiENG + student[i].test[1].engScore;
				this.femaleFiMATH = this.femaleFiMATH + student[i].test[1].mathScore;
			}
		}
		System.out.println(this.name + "반의 남학생의 중간고사 국어점수 총점은 " + maleMiKOR + "점");
		System.out.println(this.name + "반의 남학생의 중간고사 국어점수 평균은 " + (maleMiKOR / maleCount) + "점");
		System.out.println(this.name + "반의 남학생의 중간고사 영어점수 총점은 " + maleMiENG + "점");
		System.out.println(this.name + "반의 남학생의 중간고사 영어점수 평균은 " + (maleMiENG / maleCount) + "점");
		System.out.println(this.name + "반의 남학생의 중간고사 수학점수 총점은 " + maleMiMATH + "점");
		System.out.println(this.name + "반의 남학생의 중간고사 수학점수 평균은 " + (maleMiMATH / maleCount) + "점");
		System.out.println(this.name + "반의 남학생의 중간고사 총점은 " + (maleMiKOR + maleMiENG + maleMiMATH) + "점");
		System.out.println(
				this.name + "반의 남학생의 중간고사 평균은 " + ((maleMiKOR + maleMiENG + maleMiMATH) / (3 * maleCount)) + "점");
		System.out.println(this.name + "반의 남학생의 기말고사 국어점수 총점은 " + maleFiKOR + "점");
		System.out.println(this.name + "반의 남학생의 기말고사 국어점수 평균은 " + (maleFiKOR / maleCount) + "점");
		System.out.println(this.name + "반의 남학생의 기말고사 영어점수 총점은 " + maleFiENG + "점");
		System.out.println(this.name + "반의 남학생의 기말고사 영어점수 평균은 " + (maleFiENG / maleCount) + "점");
		System.out.println(this.name + "반의 남학생의 기말고사 수학점수 총점은 " + maleFiMATH + "점");
		System.out.println(this.name + "반의 남학생의 기말고사 수학점수 평균은 " + (maleFiMATH / maleCount) + "점");
		System.out.println(this.name + "반의 남학생의 기말고사 총점은 " + (maleFiKOR + maleFiENG + maleFiMATH) + "점");
		System.out.println(
				this.name + "반의 남학생의 기말고사 평균은 " + ((maleFiKOR + maleMiENG + maleFiMATH) / (3 * maleCount)) + "점");
		System.out.println(this.name + "반의 여학생의 중간고사 국어점수 총점은 " + femaleMiKOR + "점");
		System.out.println(this.name + "반의 여학생의 중간고사 국어점수 평균은 " + (femaleMiKOR / femaleCount) + "점");
		System.out.println(this.name + "반의 여학생의 중간고사 영어점수 총점은 " + femaleMiENG + "점");
		System.out.println(this.name + "반의 여학생의 중간고사 영어점수 평균은 " + (femaleMiENG / femaleCount) + "점");
		System.out.println(this.name + "반의 여학생의 중간고사 수학점수 총점은 " + femaleMiMATH + "점");
		System.out.println(this.name + "반의 여학생의 중간고사 수학점수 평균은 " + (femaleMiMATH / femaleCount) + "점");
		System.out.println(this.name + "반의 여학생의 중간고사 총점은 " + (femaleMiKOR + femaleMiENG + femaleMiMATH) + "점");
		System.out.println(this.name + "반의 여학생의 중간고사 평균은 "
				+ ((femaleMiKOR + femaleMiENG + femaleMiMATH) / (3 * femaleCount)) + "점");
		System.out.println(this.name + "반의 여학생의 기말고사 국어점수 총점은 " + femaleFiKOR + "점");
		System.out.println(this.name + "반의 여학생의 기말고사 국어점수 평균은 " + (femaleFiKOR / femaleCount) + "점");
		System.out.println(this.name + "반의 여학생의 기말고사 영어점수 총점은 " + femaleFiENG + "점");
		System.out.println(this.name + "반의 여학생의 기말고사 영어점수 평균은 " + (femaleFiENG / femaleCount) + "점");
		System.out.println(this.name + "반의 여학생의 기말고사 수학점수 총점은 " + femaleFiMATH + "점");
		System.out.println(this.name + "반의 여학생의 기말고사 수학점수 평균은 " + (femaleFiMATH / femaleCount) + "점");
		System.out.println(this.name + "반의 여학생의 기말고사 총점은 " + (femaleFiKOR + femaleFiENG + femaleFiMATH) + "점");
		System.out.println(this.name + "반의 여학생의 기말고사 평균은 "
				+ ((femaleFiKOR + femaleFiENG + femaleFiMATH) / (3 * femaleCount)) + "점");
	}

	public void classAllStudentInfo() { // 4번 액션
		if (this.classStatus == false) {
			System.out.println("존재하지 않는 반입니다.");
			return;
		}
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null) {
				System.out.println("아직 학생정보가 입력되지 않았습니다.");
				break;
			} else if (student[i].sex == 1 && student[i].name != null) {
				System.out.println(this.name + "반의 " + student[i].name + " 학생의 정보는");
				System.out.println("성별 : 남성, 주소 : " + student[i].address);
				System.out
						.println("중간고사 국어점수 : " + student[i].test[0].korScore + "점, 기말고사 국어점수 : " + student[i].test[1].korScore+"점");
				System.out
						.println("중간고사 영어점수 : " + student[i].test[0].engScore + "점, 기말고사 영어점수 : " + student[i].test[1].engScore+"점");
				System.out.println(
						"중간고사 수학점수 : " + student[i].test[0].mathScore + "점, 기말고사 수학점수 : " + student[i].test[1].mathScore+"점");
			} else if (student[i].sex == 2 && student[i].name != null) {
				System.out.println(this.name + "반의 " + student[i].name + " 학생의 정보는");
				System.out.println("성별 : 여성, 주소 : " + student[i].address);
				System.out
						.println("중간고사 국어점수 : " + student[i].test[0].korScore + ",점 기말고사 국어점수 : " + student[i].test[1].korScore+"점");
				System.out
						.println("중간고사 영어점수 : " + student[i].test[0].engScore + "점, 기말고사 영어점수 : " + student[i].test[1].engScore+"점");
				System.out.println(
						"중간고사 수학점수 : " + student[i].test[0].mathScore + "점, 기말고사 수학점수 : " + student[i].test[1].mathScore+"점");
			}
		}
	}

}
