package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $04_RGB거리_1149_실버1 {

	public static final int R = 0;
	public static final int G = 1;
	public static final int B = 2;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] price = new int[N][3];
		
		
		for(int i = 0 ; i < price.length ; i++) {
			for(int j = 0 ; j < price[i].length ; j++) {
				price[i][j] = sc.nextInt();
			}
		}
		
		int[][] DP = new int[N][3];
		DP[0][R] = price[0][R];
		DP[0][G] = price[0][G];
		DP[0][B] = price[0][B];
		
		for(int i = 1 ; i < price.length ; i++) {
			DP[i][R] = price[i][R] + Math.min(DP[i - 1][G], DP[i - 1][B]);
			DP[i][G] = price[i][G] + Math.min(DP[i - 1][R], DP[i - 1][B]);
			DP[i][B] = price[i][B] + Math.min(DP[i - 1][R], DP[i - 1][G]);
		}
		
		System.out.println(Math.min(DP[N - 1][R], Math.min(DP[N - 1][G], DP[N - 1][B])));
		
		sc.close();
	}
}
