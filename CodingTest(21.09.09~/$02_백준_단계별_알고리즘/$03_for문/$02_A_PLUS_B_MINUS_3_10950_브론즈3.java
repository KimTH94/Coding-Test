package $03_for문;

import java.util.Scanner;

public class $02_A_PLUS_B_MINUS_3_10950_브론즈3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);
			T--;
		}
		
		sc.close();
		
	}
	
}
