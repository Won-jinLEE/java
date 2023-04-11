
public class Region {
	String name;
	int count = 0;
	
	Region(){ // 생성자, 생성시에 자동으로 실행되는 부분
		this.name = "한국";
	}
	
	Region(String name){ // 생성자, 생성시에 자동으로 실행되는 부분
		this.name = name;
	}
	
	public void calcCount(People[] people) {
		for (int i =0; i<people.length; i++) {
			if(people[i]==null) {
				continue;
			}
			if(people[i].adress.equals(this.name)) {
				this.count++;
			}
		}
		System.out.println(this.name+"인구 수:"+this.count);
	}
}
