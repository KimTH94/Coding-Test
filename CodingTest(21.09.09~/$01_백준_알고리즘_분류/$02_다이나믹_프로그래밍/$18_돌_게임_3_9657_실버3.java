package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $18_돌_게임_3_9657_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N % 7 == 0 || N % 7 == 2) {
			System.out.println("CY");
		} else {
			System.out.println("SK");
		}
		
		sc.close();
		
	}
}
