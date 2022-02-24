package $02_다이나믹_프로그래밍;

import java.math.BigInteger;
import java.util.Scanner;

public class $15_조합_2407_실버3 {

	public static final int MAX = 100;
	public static final int MIN = 5;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		BigInteger[][] DP = new BigInteger [MAX + 1][MAX + 1];
		DP[1][1] = new BigInteger("1");
		
		DP[2][1] = new BigInteger("2");
		DP[2][2] = new BigInteger("1");
		
		DP[3][1] = new BigInteger("3");
		DP[3][2] = new BigInteger("3");
		DP[3][3] = new BigInteger("1");
		
		DP[4][1] = new BigInteger("4");
		DP[4][2] = new BigInteger("6");
		DP[4][3] = new BigInteger("4");
		DP[4][4] = new BigInteger("1");
		
		for(int i = MIN ; i <= MAX ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				if(j == 1) {
					DP[i][j] = new BigInteger(String.valueOf(i));
				} else if(j == i) {
					DP[i][j] = new BigInteger("1");
				} else {
					DP[i][j] = DP[i - 1][j - 1].add(DP[i - 1][j]);
				}
			}
		}
		
		System.out.println(DP[n][m]);
		
		sc.close();
	}
	
}
