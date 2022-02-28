package $06_누적합_prefixSum;

import java.util.Scanner;

public class $02_구간_합_구하기_5_11660_실버1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] sumArr = new int[N * N + 1];
		int[][] map = new int[N][N];
		int count = 1;
		int sum = 0;
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				map[i][j] = sc.nextInt();
				sum += map[i][j];
				sumArr[count] = sum;
				count++;
			}
		}
		
		for(int i = 0 ; i < sumArr.length ; i++) {
			System.out.println(i + " ==> " + sumArr[i]);
		}
		System.out.println("=================");
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0 ; i < M ; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int start = ((x1 - 1) * N) + y1;
			int end = ((x2 - 1) * N)  + y2;
			
			System.out.println("x1 : " + x1 + " / y1 : " + y1);
			System.out.println("x2 : " + x2 + " / y2 : " + y2);
			System.out.println("start : " + start + " / end : " + end);
			System.out.println(sumArr[end] - sumArr[start - 1]);
			System.out.println("===================");
		}
		
		sc.close();
	}
}
