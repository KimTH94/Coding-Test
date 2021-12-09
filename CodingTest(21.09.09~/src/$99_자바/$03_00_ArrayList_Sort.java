package $99_자바;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
	
public class $03_00_ArrayList_Sort {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("b");
		list.add("a");
		list.add("C");
		list.add("e");
		
		list = new ArrayList<String>(Arrays.asList("A", "b", "a", "C", "e"));	// ArrayList 초기화
		System.out.println(list);	// [A, b, a, C, e]
		
		list = new ArrayList<String>(Arrays.asList("A", "b", "a", "C", "e"));	// ArrayList 초기화
		Collections.sort(list);		// 오름차순 정렬
		System.out.println(list);	// [A, C, a, b, e]
		
		list = new ArrayList<String>(Arrays.asList("A", "b", "a", "C", "e"));	// ArrayList 초기화
		Collections.sort(list, Collections.reverseOrder());	// 내림차순 정렬
		System.out.println(list);	// [e, b, a, C, A] 
		
		list = new ArrayList<String>(Arrays.asList("A", "b", "a", "C", "e"));	// ArrayList 초기화
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);	// 대소문자 구분없이 오름차순 정렬
		System.out.println(list); 								// [a, A, a, C, e]

		list = new ArrayList<String>(Arrays.asList("A", "b", "a", "C", "e"));	// ArrayList 초기화
		Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));	// 대소문자 구분없이 내림차순
		System.out.println(list); 															// [e, C, a, A, a]

		

	}
}
