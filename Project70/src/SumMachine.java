
public class SumMachine {
//	public void makeSum(int start, int end) {
//		int sum = 0;
//		for(int i = start; i<=end; i++) {
//			sum = sum + i;
//		}//end for
//		System.out.println(start+"부터 "+end+"까지의 합은 "+sum);
//	}
	public int makeSum(int start, int end) {
		int sum = 0;
		
		for(int i =start; i<=end; i++) {
			sum=sum+i;
		}//end for
		return sum;
	}
}
