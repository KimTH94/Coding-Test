package $05_정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class $03_신입_사원_1946_실버2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T > 0 ) {
			
			int N = sc.nextInt();
			int[][] arr = new int[N][2];
			for(int i = 0 ; i < N ; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
			}
			
			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[0], o2[0]);
				}
			});
			
			int count = N;
			int preSocre = arr[0][1];
			for(int i = 1 ; i < N ; i++) {
				if(preSocre < arr[i][1]) {
					count--;
				}
				
				preSocre = arr[i][1];
			}
			
			System.out.println(count);
			
			T--;
		}
		sc.close();
	}
}