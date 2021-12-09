package $03_그래프_이론;

import java.util.*;

public class $05_토마토_7576_실버1 {

	public static class Matrix {
		int x;
		int y;
		
		Matrix(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static int[] dx = {0,  0, 1, -1};
	public static int[] dy = {1, -1, 0,  0};
	
	public static int[][] map;
	public static boolean[][] check;
	public static int[][] dist;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine();
		
		map = new int[N][M];
		check = new boolean[N][M];
		dist = new int[N][M];
		Queue<Matrix> q = new LinkedList<Matrix>();
		
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				map[i][j]  = sc.nextInt();

				if(map[i][j] == 1) {
					q.add(new Matrix(i, j));
					check[i][j] = true;
				}
			}
		}
		
		int max = 0;
		while(!q.isEmpty()) {
			Matrix m = q.poll();
			int x = m.x;
			int y = m.y;
			
			for(int i = 0 ; i < dx.length ; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(0 <= nx && nx < N && 0 <= ny && ny < M) {
					if(map[nx][ny] == 0 && !check[nx][ny]) {
						q.add(new Matrix(nx, ny));
						check[nx][ny] = true;
						dist[nx][ny] = dist[x][y] + 1;
						
						max = Math.max(dist[nx][ny], max);
					}
				}
			}
		}

		boolean flag = true;
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				if(map[i][j] == 0 && dist[i][j] == 0) {
					flag = false;
					break;
				}
			}
		}
		
		if(flag) {
			System.out.println(max);
		}else {
			System.out.println(-1);
		}
		
		sc.close();

	}
}
