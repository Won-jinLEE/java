import java.util.Arrays;

public class Quiz1 {
	public static void main(String[] args) {
		String name[] = { "A", "B", "C", "D", "E" };
		int kor[] = { 50, 60, 70, 80, 90 };
		int eng[] = { 10, 70, 80, 90, 100 };
		int math[] = { 95, 80, 90, 85, 80 };
		int sumValue[] = new int[name.length];//합산값을 담을 깡통배열
		int temp; //sumValue를 sort하기 위한 int 깡통값
		String empty; //name를 sort하기 위한 String 깡통값
		for (int i = 0; i < name.length; i++) { //합산을 위한 for문
			sumValue[i] = kor[i] + eng[i] + math[i];
		}
		for (int i = 0; i < name.length; i++) {//내림차순을 위한 for문
			for (int j = i + 1; j < name.length; j++) {
				if (sumValue[i] < sumValue[j]) {
					temp = sumValue[j];
					sumValue[j] = sumValue[i];
					sumValue[i] = temp;
					empty = name[j];
					name[j] = name[i];
					name[i] = empty;
				}
			}
		}for (int i = 0; i<name.length; i++) {//출력을 위한 for문
			System.out.println((i+1)+"등 : "+name[i]+"("+sumValue[i]+")");
		}
	}
}