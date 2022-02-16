package $02_다이나믹_프로그래밍;

import java.util.*;

public class $11_파도반_수열_9461_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		ArrayList<Long> list = new ArrayList<Long>();
		list.add((long) 1);
		list.add((long) 1);
		list.add((long) 1);
		
		for(int i = 1 ; i <= 97 ; i += 2) {
			long temp1 = list.get(i - 1) + list.get(i);
			long temp2 = list.get(i) + list.get(i + 1);
			list.add(temp1);
			list.add(temp2);
		}
		
		for(int i = 0 ; i < num ; i++) {
			int N = sc.nextInt() - 1;
			
			System.out.println(list.get(N));
		}

		sc.close();
	}

}
