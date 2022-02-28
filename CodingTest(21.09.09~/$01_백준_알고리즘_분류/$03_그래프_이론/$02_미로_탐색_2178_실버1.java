package $03_그래프_이론;

import java.util.*;

public class $02_미로_탐색_2178_실버1 {

	public static class Matrix {
		int x;
		int y;
		
		Matrix(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static final int[] dx = {0,  0, 1, -1};
	public static final int[] dy = {1, -1, 0,  0};

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		
		int[][] map = new int[N][M];
		boolean[][] visited = new boolean[N][M];
		int[][] dist = new int[N][M];
		
		for(int i = 0 ; i < N ; i++) {
			String s = sc.nextLine();
			for(int j = 0 ; j < M ; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		Queue<Matrix> q = new LinkedList<Matrix>();
		q.add(new Matrix(0, 0));
		visited[0][0] = true;
		dist[0][0] = 1;
		
		while(!q.isEmpty()) {
			Matrix m = q.poll();
			int x = m.x;
			int y = m.y;
			
			for(int i = 0 ; i < dx.length ; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(0 <= nx && nx < N && 0 <= ny && ny < M) {
					if(!visited[nx][ny] && map[nx][ny] == 1) {
						q.add(new Matrix(nx, ny));
						visited[nx][ny] = true;
						dist[nx][ny] = dist[x][y] + 1;
					}
				}
				
			}
		}
		
		System.out.println(dist[N - 1][M - 1]);
	}
}
