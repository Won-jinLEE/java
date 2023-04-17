import java.util.HashMap;

public class MapPratice {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("주소", "서울특별시 강서구");
		map.put("전화번호", "02-2186-1234");
		map.get("주소");
		System.out.println(map);
	}
}
