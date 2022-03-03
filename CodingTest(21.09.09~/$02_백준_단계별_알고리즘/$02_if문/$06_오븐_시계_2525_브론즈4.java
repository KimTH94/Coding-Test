package $02_if문;

import java.util.Scanner;

public class $06_오븐_시계_2525_브론즈4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();	// 시간
		int B = sc.nextInt();	// 분
		int C = sc.nextInt();	// 요리하는데 필요한 시간
		
		int minute = B + C;
		
		A += minute / 60;
		B = minute % 60;
		
		A = A % 24;
		
		System.out.println(A + " " + B);
		
		sc.close();
		
	}
}
