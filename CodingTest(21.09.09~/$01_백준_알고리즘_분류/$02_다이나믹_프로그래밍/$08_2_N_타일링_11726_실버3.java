package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $08_2_N_타일링_11726_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		int[] DP = new int[n + 1];
		DP[0] = 1;
		DP[1] = 1;

		for(int i = 2 ; i <= n ; i++) {
			
			DP[i] = (DP[i - 1] + DP[i - 2]) % 10007;
		}
		
		System.out.println(DP[n]);
		
		sc.close();
	}

}
