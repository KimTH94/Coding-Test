package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $01_다리놓기_1010_실버5 {

	public static int[][] DP = new int[31][31];
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		DP[1][0] = 1;
		DP[1][1] = 1;
		
		for(int i = 2 ; i < DP.length ; i++) {
			DP[i][0] = 	1;
			DP[i][i] = 1;
			for(int j = 1 ; j < DP[i].length ; j++) {
				DP[i][j] = DP[i - 1][j - 1] + DP[i - 1][j];
			}
		}
		
		for(int i = 0 ; i < T ; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			System.out.println(DP[M][N]);
		}
		
		sc.close();
	}
}
