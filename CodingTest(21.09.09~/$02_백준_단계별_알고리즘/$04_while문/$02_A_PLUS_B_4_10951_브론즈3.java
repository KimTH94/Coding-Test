package $04_while문;

import java.util.Scanner;

public class $02_A_PLUS_B_4_10951_브론즈3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
		
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A + B);
		}
		
		sc.close();
	}
	
}
