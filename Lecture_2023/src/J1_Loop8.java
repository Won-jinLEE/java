import java.util.Scanner;

public class J1_Loop8 {
	public static void main(String[] args) {
		int ss[]= new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			Scanner s = new Scanner(System.in);
			ss[i] = s.nextInt();
			if(ss[i]>max) {
				max=ss[i];
			}if(ss[i]<min){
				min=ss[i];
			}
		} 
		System.out.println("최대값은 : "+max+"최소값은 : "+min);
	}
}
