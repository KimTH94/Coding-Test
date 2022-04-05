package $08_트리;

import java.util.*;

public class $01_트리의_부모_찾기_성공_11725_실버2 {
	
	public static ArrayList<Integer>[] tree;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		tree = (ArrayList<Integer>[]) new ArrayList[N + 1];
		
		for(int i = 1 ; i <= N ; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0 ; i < N - 1 ; i++) {

			int left = sc.nextInt();
			int right = sc.nextInt();
			
			tree[left].add(right);
			tree[right].add(left);
		}
		
		int[] parent = new int[N + 1];
		boolean[] check = new boolean[N + 1];
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		check[1] = true;
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			for(int i = 0 ; i < tree[now].size() ; i++) {
				if(!check[tree[now].get(i)]) {
					parent[tree[now].get(i)] = now;
					check[tree[now].get(i)] = true;
					q.add(tree[now].get(i));
				}
			}
			
		}
		
		for(int i = 2; i < parent.length ; i++) {
			System.out.println(parent[i]);
		}
		
		sc.close();
	}
	
}