package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $13_01타일_1904_실버 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N == 0) {
			System.out.println(0);
		}else if(N == 1) {
			System.out.println(1);
		}else if(N == 2) {
			System.out.println(2);
		}else {
			int[] DP = new int[N + 1];
			DP[1] = 1;
			DP[2] = 2;
			DP[3] = 3;
			
			for(int i = 4 ; i <= N ; i++) {
				DP[i] = (DP[i - 1] + DP[i - 2]) % 15746;
			}
			
			System.out.println(DP[N]);
		}

		sc.close();
		
	}
}
