package $99_자바;

import java.util.ArrayList;

public class $02_ArrayList_Set {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		System.out.println("list ==> " + list); // [1, 2, 3, 4]
		
		list.add(0, "0"); // "0"을 0번째(처음) 추가 
		
		System.out.println("insert first index \"0\" ==> " + list);	// [0, 1, 2, 3, 4]
		
		list.set(0, "A");				// 0번째(처음) 인덱스 "A"로 변환
		list.set(list.size() - 1, "Z");	// 마지막 인덱스를 "Z"로 변환
		
		System.out.println("Replace first index \"A\", last index list \"Z\" ==> " + list);	// [A, 1, 2, 3, Z]
	}
}
