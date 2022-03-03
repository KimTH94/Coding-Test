package $02_if문;

import java.util.Scanner;

public class $01_두_수_비교하기_1330_브론즈4 {

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
