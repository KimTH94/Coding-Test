package $10_N과_M;

import java.util.*;

public class $03_N과_M_3_15651_실버3 {

	public static int N;
	public static int M;
	
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();	// 1부터 N 까지
		M = sc.nextInt();	// M개 선택
		arr = new int[M];
		
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
			arr[index] = i;
			solution(index + 1);
		}		
	}
	
}
