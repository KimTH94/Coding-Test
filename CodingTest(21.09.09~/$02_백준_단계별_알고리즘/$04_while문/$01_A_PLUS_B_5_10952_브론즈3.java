package $04_while문;

import java.util.Scanner;

public class $01_A_PLUS_B_5_10952_브론즈3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				break;
			}else {
				System.out.println(A + B);
			}
		}
		
		sc.close();
		
	}
	
}
