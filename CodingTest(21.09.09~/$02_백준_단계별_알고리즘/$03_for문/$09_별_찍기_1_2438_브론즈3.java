package $03_for문;

import java.util.Scanner;

public class $09_별_찍기_1_2438_브론즈3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1 ; i <= N ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
				
	}
	
}
