package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $10_이천수_2193_실버3 {

	public static final int max = 90;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long [][] DP = new long[max + 1][2];
		
		DP[0][0] = 0;
		DP[0][1] = 0;
		
		DP[1][0] = 0;
		DP[1][1] = 1;
		
		for(int i = 2 ; i <= max ; i++) {
			for(int j = 0 ; j < 2; j++) {
				if(j == 0) {
					DP[i][j] = DP[i -1][0] + DP[i - 1][1];
				}else {
					DP[i][j] = DP[i - 1][0];
				}
			}
		}
		
		System.out.println(DP[N][0] + DP[N][1]);
	}
}
