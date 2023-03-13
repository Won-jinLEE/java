
public class debugClass2 {
	public static void main(String[] args) {
		int[] newArray = { 1, 3, 5, 7, 5, 6, 17, 18, 9, 20 };
		
		suma(newArray);
		
	}
		private static void suma(int[] inArray) {
		int sumation = 0;
		for (int i = 0; i < inArray.length; i++) {
			sumation = sumation + inArray[i];
			System.out.println(inArray[i] + "합은" + sumation);
		}
	}
}
