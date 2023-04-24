import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/inputRabbit.txt"));
		Scanner sc = new Scanner(System.in);
		int huntNum = sc.nextInt();
		boolean [][]space = new boolean[20][20];
		for(int i =0; i<huntNum; i++) {
			int rabbitNum = sc.nextInt();
			int foxY = sc.nextInt();
			int foxX = sc.nextInt();
			int count = 0;
			System.out.println("space["+foxY+"]"+"["+foxX+"] = 여우의 좌표");
			for(int j =0; j<rabbitNum; j++) {
				int rabbitY = sc.nextInt();
				int rabbitX = sc.nextInt();
				space[rabbitY][rabbitX] = true;
				System.out.println("space["+rabbitY+"]"+"["+rabbitX+"] = 사냥 가능 여부 "+space[rabbitY][rabbitX]);
			}
			for(int j =0; j<20; j++) {
				if(space[foxY][j] == true) {
					space[foxY][j] = false;
					count = count+1;
				}
			}
			for(int j =0; j<20; j++) {
				if(space[j][foxX] == true) {
					space[j][foxX] = false;
					count = count+1;
				}
			}
			if(foxY==foxX) {
				for(int j =0; j<20-foxY; j++) {
					if(space[foxY+j][foxX+j]==true) {
						space[foxY+j][foxX+j] = false;
						count = count+1;
					}
				}
				for(int j =0; j<=foxY; j++) {
					if(space[foxY-j][foxX-j]==true) {
						space[foxY-j][foxX-j] = false;
						count = count+1;
					}
				}
			}
//			if(foxY>foxX) {
//				for(int j =0; j<=20-foxY; j++) {
//					if(space[foxY+j][foxX+j]==true) {
//						space[foxY+j][foxX+j] = false;
//						count = count+1;
//					}
//				}
//				for(int j =20-foxX; j>=0; j--) {
//					if(space[foxY+j][foxX+j]==true) {
//						space[foxY+j][foxX+j] = false;
//						count = count+1;
//					}
//				}
//			}
//			if(foxX>foxY) {
//				for(int j =0; j<=20-foxX; j++) {
//					if(space[foxY+j][foxX+j]==true) {
//						space[foxY+j][foxX+j] = false;
//						count = count+1;
//					}
//				}
//				for(int j =20-foxY; j>=0; j--) {
//					if(space[foxY+j][foxX+j]==true) {
//						space[foxY+j][foxX+j] = false;
//						count = count+1;
//					}
//				}
//			}
			System.out.println(count);
		}
	}
}
