package $06_누적합_prefixSum;

import java.util.Scanner;

public class $01_구간_합_구하기_4_11659_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr= new int[N];
		int sum = 0;
		int[] sumArr = new int[N + 1];
		sumArr[0] = sum;
		for(int i = 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			sumArr[i + 1] = sum;
		}
		
		for(int t = 0 ; t < M ; t++) {
			int start = sc.nextInt();
			int end   = sc.nextInt();
			
			System.out.println(sumArr[end] - sumArr[start - 1]);
		}
		sc.close();
	}
}
