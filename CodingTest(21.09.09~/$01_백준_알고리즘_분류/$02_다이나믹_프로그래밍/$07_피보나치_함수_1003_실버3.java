package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $07_피보나치_함수_1003_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[][] DP = new int[41][2];
		DP[0][0] = 1;
		DP[0][1] = 0;
		
		DP[1][0] = 0;
		DP[1][1] = 1;
		
		for(int i = 2 ; i <= 40 ; i++) {
			DP[i][0] = DP[i - 1][0] + DP[i - 2][0];
			DP[i][1] = DP[i - 1][1] + DP[i - 2][1];
		}
		
		for(int t = 0 ; t < T ; t++) {
			int N = sc.nextInt();
			System.out.println(DP[N][0] + " " + DP[N][1]);
		}
		
		sc.close();
	}
}
