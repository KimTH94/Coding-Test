package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $09_계단_오르기_2579_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] stair = new int[n + 1];
		
		for(int i = 1 ; i <= n ; i++) {
			stair[i] = sc.nextInt();
		}
		
		
		int[] DP = new int[n + 1];
		
		DP[1] = stair[1];

		if (n >= 2) {
			DP[2] = stair[1] + stair[2];
		}
		
		for(int i = 3 ; i <= n ; i++) {
			DP[i] = Math.max(DP[i -2], DP[i - 3] + stair[i - 1]) + stair[i];
		}
		
		System.out.println(DP[n]);
		
		sc.close();
	}
}
