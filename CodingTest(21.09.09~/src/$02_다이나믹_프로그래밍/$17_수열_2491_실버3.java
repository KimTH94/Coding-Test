package $02_다이나믹_프로그래밍;

import java.util.Scanner;

public class $17_수열_2491_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 1;
		
		int asc = 1;
		for(int i = 0 ; i < N - 1 ; i++) {
			if(arr[i] <= arr[i + 1]) {
				asc++;
			}else {
				asc = 1;
			}
			max = Math.max(asc, max);
		}
		
		
		int desc = 1;
		for(int i = 0 ; i < N - 1 ; i++) {
			if(arr[i] >= arr[i + 1]) {
				desc++;
			}else {
				desc = 1;
			}
			max = Math.max(desc, max);
		}
		
		System.out.println(max);
		
		
		sc.close();
	}
}
