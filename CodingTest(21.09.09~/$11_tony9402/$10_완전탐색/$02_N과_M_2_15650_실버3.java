package $10_완전탐색;

import java.util.Scanner;

public class $02_N과_M_2_15650_실버3 {
	
	public static StringBuilder sb = new StringBuilder();
	public static int[] arr;
	public static boolean[] check;
	
	// 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
	// 고른 수열은 오름차순이어야 한다.
	public static void solution(int N, int M, int index, int start) {
		if(index == M) {
			for(int i = 0 ; i < M ; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = start ; i <= N ; i++) {
			if(!check[i]) {
				check[i] = true;
				arr[index] = i;
				solution(N, M, index + 1, i + 1);
				check[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 숫자 개수
		int M = sc.nextInt();	// 선택 숫자 개수
		
		arr = new int[M];
		check = new boolean[N + 1];
		
		solution(N, M, 0, 1);
		
		System.out.println(sb.toString());
		
		sc.close();
	}
}
