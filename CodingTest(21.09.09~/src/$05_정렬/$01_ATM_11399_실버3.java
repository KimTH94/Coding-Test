package $05_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class $01_ATM_11399_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				sum += arr[j];
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
