package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $02_돌_게임_9655_실버5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N % 2 == 1) {
			System.out.println("SK");
		} else {
			System.out.println("CY");
		}
		
		sc.close();
	}
}
