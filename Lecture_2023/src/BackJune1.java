
public class BackJune1 {
	public static void main(String[] args) {
		asdf(7, 0);
	}
	public static void asdf(int T, int S) {
		if(T<=11 ||T>16||S==1) {
			System.out.println("280");
		}else if(T<0||T>24||S<0||S>1) {
			return;
		}else {
			System.out.println("320");
		}
	}
}
