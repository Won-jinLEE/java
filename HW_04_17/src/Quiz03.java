
public class Quiz03 {
	// 문자 밀기
	public String solution(String s, int n) {
		String answer = "";
		int alphaNum = 26;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int num = (int) ch;
			if (num == 32) {
				answer = answer + " ";
			} else if (num >= 65 && num <= 90) {
				num = num + n;
				if (num > 90) {
					num = num - alphaNum;
				}
				char put = (char) num;
				answer = answer + put;
			} else if (num >= 97 && num <= 122) {
				num = num + n;
				if (num > 122) {
					num = num - alphaNum;
				}
				char put = (char) num;
				answer = answer + put;
			}
		}
		return answer;
	}
}
