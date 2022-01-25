package $99_자바;

import java.util.*;

public class $07_ArrayList {

	public static void print(ArrayList<Integer> list) {
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("==========================");
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		
		print(list);
		
		list.remove(11);
		
		print(list);
	}
}
