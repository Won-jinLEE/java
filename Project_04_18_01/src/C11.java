
public class C11 {
	private String name = "de"; // private : 포함되어있는 객체내에서만 사용가능하게 변경, 외부에선 사용불가
	
	private void printName() {
		System.out.println(this.name);
	}
	
	// public        -> 어디서든 사용이 가능하게 만들어주는 접근제한자
	//  				   -> 같은 패키지내에서만 사용가능한 접근제한자
	// protected  -> 상속된(링크된)객체에서만 사용가능하게 해주는 접근제한자
	// private      -> 본인이 속해있는 클레스내에서만 사용 가능하게 만들어주는 접근제한자
}
