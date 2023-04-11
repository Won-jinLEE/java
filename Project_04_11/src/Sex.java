
public class Sex {
	String sex;
	int count = 0;
	
	public void calcCount(People[] people) {
		for (int i =0; i<people.length; i++) {
			if(people[i]==null) {
				continue;
			}
			if(people[i].sex.equals(this.sex)) {
				this.count++;
			}
		}
		System.out.println(this.sex+"인구 수:"+this.count);
	}
}
