package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $16_Generations_of_Tribbles_9507_실버3 {

	public static final int MAX = 67;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		long[] DP = new long[MAX + 1];
		
		DP[0] = 1;
		DP[1] = 1;
		DP[2] = 2;
		DP[3] = 4;
		
		for(int i = 4 ; i <= MAX ; i++) {
			DP[i] = DP[i - 1] + DP[i - 2] + DP[i - 3] + DP[i - 4];
		}
		
		for(int i = 0 ; i < t ; i++) {
			int n = sc.nextInt();
			System.out.println(DP[n]);
		}
		
		sc.close();
	}
}
