
public class Quiz06 {

	public int solution(int[] nums) {
		int a = nums.length;
		int pokeGet = a / 2;
		int count = 0;
		int answer = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (i != j && nums[i] == nums[j] && nums[i] !=0 && nums[j] !=0) {
					nums[j] = 0;
					count= count+1;
				}
			}
		}
		int pokeCount = a-count;
		if (pokeGet > pokeCount) {
			answer = pokeCount;
		} else if (pokeGet < pokeCount) {
			answer = pokeGet;
		} else {
			answer = pokeGet;
		}
		return answer;
	}
}
