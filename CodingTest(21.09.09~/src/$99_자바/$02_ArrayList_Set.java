package $99_자바;

import java.util.ArrayList;

public class $02_ArrayList_Set {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		System.out.println("list ==> " + list);
		
		list.add(0, "0");
		
		System.out.println("insert first index \"0\" ==> " + list);
		
		list.set(0, "A");
		list.set(list.size() - 1, "Z");
		
		System.out.println("replace first index \"A\", last index list \"Z\" ==> " + list);
	}
}
