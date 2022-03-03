package $03_for문;

import java.util.Scanner;

public class $10_별_찍기_2_2439_브론즈3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1 ; i <= N ; i++) {
			String temp = "";
			for(int j = N - 1 ; j >= i ; j--) {
				temp += " ";
			}
			
			for(int j = 1 ; j <= i ; j++) {
				temp += "*";
			}
			
			System.out.println(temp);
		}
		
		sc.close();
		
	}
	
}
