package $03_for문;

import java.util.Scanner;

public class $01_구구단_2739_브론즈3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}else if(A == B) {
			System.out.println("==");
		}else {
			System.out.println("<");
		}
		
		sc.close();
		
	}
	
}
