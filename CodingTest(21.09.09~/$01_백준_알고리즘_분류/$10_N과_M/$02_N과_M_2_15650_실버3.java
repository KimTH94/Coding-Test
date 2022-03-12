package $10_N과_M;

import java.util.*;

public class $02_N과_M_2_15650_실버3 {

	public static int N;
	public static int M;
	
	public static int[] arr;
	public static boolean[] check;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();	// 1부터 N 까지
		M = sc.nextInt();	// M개 선택
		arr = new int[M];
		check = new boolean[N + 1];
		
		solution(0);
		
		System.out.println(sb);
		
		sc.close();
	}
	
	public static void solution(int index) {
		
		if(index == M) {
			for(int i = 0 ; i < M ; i ++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 1 ; i <= N ; i++) {
			if(!check[i]) {
				arr[index] = i;
				check[i] = true;
				solution(index + 1);
				check[i] = false;
			}
		}		
	}
	
}

