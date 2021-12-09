	package $03_그래프_이론;

import java.util.*;

public class $04_바이러스_2606_실버3 {

	public static int[][] map;
	public static boolean[] visited;
	
	public static int BFS() {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		visited[0] = true;
		
		int count = 0;
		while(!q.isEmpty()) {
			int x = q.poll();
			
			for(int i = 0 ; i < map.length ; i++) {
				if(map[x][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 컴퓨터 개수(노드 개수)
		int edge = sc.nextInt();	// 연결된 컴퓨터의 개수(간선 개수)
		sc.nextLine();
		
		map = new int[N][N];
		visited = new boolean[N];
		
		for(int i = 0 ;  i < edge ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			map[x - 1][y - 1] = 1;
			map[y - 1][x - 1] = 1;
		}
	
		System.out.println(BFS());
		
		sc.close();
	}
}
