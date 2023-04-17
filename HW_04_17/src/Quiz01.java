
public class Quiz01 {
	//최대공약수와 최소공배수를 리턴
	public int[] solution(int n, int m) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d =0;
		int[] answer = {};
		for(int i=0; i<99999; i++) {
			if(n>m) {
				a = n;
				b = m;
				c = a%b;
				for(int j =0; j<999999; j++) {
					if(c!=0) {
						d = b%c;
						b = c;
						c = d;
					}else {
						break;
					}
				}
			}else if(n<m) {
				a = m;
				b = n;
				c = a%b;
				for(int j =0; j<999999; j++) {
					if(c!=0) {
						d = b%c;
						b = c;
						c = d;
					}else {
						break;
					}
				}
			}else if(n==m) {
				answer[0] = n;
				answer[1] = n;
			}
		}
        return answer;
    }
}
