package $99_자바;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
	
public class $03_ArrayList_Sort {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("b");
		list.add("a");
		list.add("C");
		list.add("e");
		
		System.out.println(list);	// [2, 1, 5, 4, 3]
		
		Collections.sort(list);
		System.out.println(list);	// [1, 2, 3, 4, 5]
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);	// [5, 4, 3, 2, 1] 
		
		list = new ArrayList<String>(Arrays.asList("a", "A", "a", "C", "e"));
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println("대소문자 구분없이 오름차순 : " + list); // [a, A, B, C]
		// 대소문자 구분없이 내림차순
		Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		System.out.println("대소문자 구분없이 내림차순 : " + list); // [C, B, a, A]

		

	}
}
