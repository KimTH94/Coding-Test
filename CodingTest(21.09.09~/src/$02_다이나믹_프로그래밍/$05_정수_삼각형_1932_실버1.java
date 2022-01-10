package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $05_정수_삼각형_1932_실버1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] triangle = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < i + 1 ; j++) {
				triangle[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < triangle.length ; i++) {
			for(int j = 0 ; j < triangle[i].length ; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
