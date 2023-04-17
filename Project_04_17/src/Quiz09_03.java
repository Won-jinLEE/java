
public class Quiz09_03 {
	 public String solution(int n) {
	        String answer = "";
	        for(int i =0; i<n; i++) {
	        	if(i%2==0||i==0) {
	        		answer = answer+"코";
	        	}else {
	        		answer = answer+"포";
	        	}
	        }
	        return answer;
	    }
}
