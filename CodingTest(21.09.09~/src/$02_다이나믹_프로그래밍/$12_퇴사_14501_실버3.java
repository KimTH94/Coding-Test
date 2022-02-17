package $02_다이나믹_프로그래밍;

import java.util.*;

public class $12_퇴사_14501_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] T = new int[N];
		int[] P = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		
		int[] DP = new int[N + 1];
		for(int i = 0 ; i < N ; i++) {
			if(i + T[i] <= N) {
				DP[i + T[i]] = Math.max(DP[i + T[i]], DP[i] + P[i]);
			}
            DP[i + 1] = Math.max(DP[i + 1], DP[i]);
		}

		System.out.println(DP[N]);	//
		
		sc.close();
	}
}
