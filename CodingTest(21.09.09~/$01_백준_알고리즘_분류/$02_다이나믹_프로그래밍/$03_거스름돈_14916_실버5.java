package $02_다이나믹_프로그래밍;

import java.util.Arrays;
import java.util.Scanner;

public class $03_거스름돈_14916_실버5 {

	public static final int max = 100001;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] DP = new int[max];
		Arrays.fill(DP, Integer.MAX_VALUE);
		
		DP[2] =  1;
		DP[4] =  2;
		DP[5] =  1;
		
		for(int i  = 6 ; i < DP.length ; i++) {
			DP[6] = Math.min(DP[i - 2], DP[i - 5]) + 1;
		}
		
		if(DP[n] == Integer.MAX_VALUE) {
			System.out.println(-1);
		}else {
			System.out.println(DP[n]);
		}
		
		sc.close();
	}
}
