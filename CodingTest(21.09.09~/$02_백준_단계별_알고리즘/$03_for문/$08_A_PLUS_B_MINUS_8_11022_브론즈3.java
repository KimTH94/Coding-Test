package $03_for문;

import java.util.Scanner;

public class $08_A_PLUS_B_MINUS_8_11022_브론즈3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1 ; i <= T ; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
		}
		
		sc.close();
		
	}
	
}
