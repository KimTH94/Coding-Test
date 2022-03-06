package $03_그래프_이론;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class $06_숨바꼭질_1697_실버1 {

	public static final int max = 100001;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
	
		Queue<Integer> q = new LinkedList<Integer>();
		int[] dist = new int[max];
		boolean[] check = new boolean[max];
		
		q.add(N);
		dist[N] = 0;
		check[N] = true;
		
		while(!q.isEmpty()) {
			int x = q.remove();
			
			if(x + 1 < max) {
				if(!check[x + 1]) {
					q.add(x + 1);
					check[x + 1] = true;
					dist[x + 1] =  dist[x] + 1;
				}
			}
			
			if(x - 1 >= 0) {
				if(!check[x - 1]) {
					q.add(x - 1);
					check[x - 1] = true;
					dist[x - 1] =  dist[x] + 1;
				}
			}
			
			if(x * 2 < max) {
				if(!check[x * 2]) {
					q.add(x * 2);
					check[x * 2] = true;
					dist[x * 2] =  dist[x] + 1;
				}
			}
		}
		
		System.out.println(dist[K]);

		
		sc.close();
	}
}
