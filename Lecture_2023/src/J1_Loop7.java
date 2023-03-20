import java.util.Arrays;

public class J1_Loop7 {
	public static void main(String[] args) {
		for(int x = 2; x<10; x++) {
			for(int y = 1; y<10; y++) {
				if(y==1) {
					System.out.println(x+"단은 : "+x+"*"+y+"="+(x*y));
				}else {
					System.out.println("          "+x+"*"+y+"="+(x*y));
				}
			}
		}
	}
}
