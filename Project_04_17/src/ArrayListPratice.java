import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPratice {
	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(1);
		list.add(7);
		list.add(1);
		Collections.sort(list);
		for(int i =0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		ArrayList strlist = new ArrayList();
		strlist.add("Apple");
		strlist.add("Banana");
		strlist.add("3");
		strlist.add("apple");
		strlist.add("orange");
		System.out.println(Arrays.deepToString(strlist.toArray()));
	}
}
