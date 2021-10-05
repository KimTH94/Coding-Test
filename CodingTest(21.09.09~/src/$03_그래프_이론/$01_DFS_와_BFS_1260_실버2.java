package $03_그래프_이론;

import java.util.*;

public class $01_DFS_와_BFS_1260_실버2 {

	public static void DFS(int[][] map, boolean[] visited, int start) {
		visited[start] = true;
		System.out.print((start + 1) + " ");
		
		for(int i = 0 ; i < map[start].length ; i++) {
			if(map[start][i] == 1 && !visited[i]) {
				DFS(map, visited, i);
			}
		}
	}
	
	public static void BFS(int[][] map, boolean[] visited, int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start - 1);
		visited[start - 1] = true;
		
		while(!q.isEmpty()) {
			int k = q.poll();
			System.out.print((k + 1) + " ");
			
			for(int i = 0 ; i < map[k].length ; i++) {
				if(map[k][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 정점 개수 
		int M = sc.nextInt();	// 간선 개수
		int V = sc.nextInt();	// 정점 시작 번호 

		int[][] map = new int[N][N];
		boolean[] visited = new boolean[N];
				
		for(int i = 0 ; i < M ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			map[x - 1][y - 1] = 1;
			map[y - 1][x - 1] = 1;
		}

		DFS(map, visited, (V - 1));
		Arrays.fill(visited, false); // 방문 배열 초기화
		System.out.println();
		BFS(map, visited, V);
		
		sc.close();
	}
}
