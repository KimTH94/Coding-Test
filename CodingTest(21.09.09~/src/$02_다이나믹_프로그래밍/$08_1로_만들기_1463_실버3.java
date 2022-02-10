package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $08_1로_만들기_1463_실버3 {

	public static int[] DP;
	   
	   public static void main(String[] args) {
	      
	      Scanner sc = new Scanner(System.in);
	      
	      int N = sc.nextInt();
	      
	      DP = new int[N + 1];
	      DP[0] = 0;
	      DP[1] = 0;
	      
	      for(int i = 2 ; i <= N ; i++) {
	         DP[i] = DP[i - 1] + 1;
	         
	         if(i % 2 == 0) {
	            DP[i] = Math.min(DP[i], DP[i / 2] + 1);
	         }
	         
	         if(i % 3 == 0) {
	            DP[i] = Math.min(DP[i], DP[i / 3] + 1);
	         }
	      }
	      
	      System.out.println(DP[N]);
	      
	      sc.close();
	   }

}
