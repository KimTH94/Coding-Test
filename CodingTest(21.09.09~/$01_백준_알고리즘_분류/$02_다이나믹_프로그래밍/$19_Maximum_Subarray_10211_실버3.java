package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $19_Maximum_Subarray_10211_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 0 ; t < T ; t++) {
			int N = sc.nextInt();
			
			int[] arr = new int[N + 1];
			int[] DP  = new int[N + 1]; 
			for(int i = 1 ; i <= N ; i++) {
				arr[i] = sc.nextInt();
				DP[i] = arr[i];
			}
			
			int max = DP[1];
			for(int i = 2 ; i <= N ; i++) {
				DP[i] = Math.max(arr[i], DP[i - 1] + arr[i]);
				max = Math.max(max, DP[i]);
			}
			
			System.out.println(max);
		}
		
		sc.close();
		
	}
}
