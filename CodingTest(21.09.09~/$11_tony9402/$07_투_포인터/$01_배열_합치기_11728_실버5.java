package $07_투_포인터;

import java.util.*;

public class $01_배열_합치기_11728_실버5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// A 배열 크기
		int M = sc.nextInt();	// B 배열 크기
		
		int[] arrA = new int[N]; int[] arrB = new int[M]; 
		for(int i = 0 ; i < arrA.length ; i++) {
			arrA[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < arrB.length ; i++) { 
			arrB[i] = sc.nextInt();
		}
		
		int[] arr = new int[N + M];
		int aIndex = 0;
		int bIndex = 0;
		int index = 0;
		
		while(aIndex < arrA.length && bIndex < arrB.length) {
			if(arrA[aIndex] > arrB[bIndex]) {
				arr[index] = arrB[bIndex];
				bIndex++;
				index++;
			} else {
				arr[index] = arrA[aIndex];
				aIndex++;
				index++;
			}
		}
		
		while(aIndex < arrA.length) {
			arr[index] = arrA[aIndex];
			aIndex++;
			index++;
		}
		
		while(bIndex < arrB.length) {
			arr[index] = arrB[bIndex];
			bIndex++;
			index++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < arr.length ; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb.toString());
		
		sc.close();
	}
	
}
