
public class recursiveFunc {
	public static void main(String[] args) {
		printHello(0);
	}

	public static void printHello(int i) {
		if (i == 100)
			return;
		int j = 0;
		j = i +1;
		printHello(++i);
	}
}
