package $03_for문;

import java.util.Scanner;

public class $11_X보다_작은_수_10871_브론즈3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N ; i++) {
			int num = sc.nextInt();
			if(num < X) {
				sb.append(num + " ");
			}
		}
		
		System.out.println(sb.toString());
		
		sc.close();
		
	}
	
}
