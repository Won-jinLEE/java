
public class Quiz09_02 {
  public int[] solution(int[] array, int n) {
        int[] answer = new int[array.length];
        for(int i =0; i<array.length; i++) {
        	array[i] = array[i]*n;
        	answer[i] = array[i];
        }
        return answer;
    }
}
