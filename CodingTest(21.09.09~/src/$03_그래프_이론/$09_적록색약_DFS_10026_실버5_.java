package $03_그래프_이론;

import java.util.*;

public class $09_적록색약_DFS_10026_실버5_ {
	
	public static class Matrix {
		int x;
		int y;
		
		Matrix(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static final int[] dx = {0, 0, 1, -1};
	public static final int[] dy = {1, -1, 0, 0};
	
	public static char[][] map;
	public static boolean[][] check;
	public static Queue<Matrix> q = new LinkedList<Matrix>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		map = new char[N][N];
		check = new boolean[N][N];
		
		for(int i = 0 ; i < map.length ; i++) {
			map[i] = sc.next().toCharArray();
		}
		
		int RGB = 0;
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				if(!check[i][j]) {
					DFS(new Matrix(i, j));
					RGB++;
				}
			}
		}
		
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				if(map[i][j] == 'G') {
					map[i][j] = 'R';
				}
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			Arrays.fill(check[i], false);
		}
		
		int nonRGB = 0;
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				if(!check[i][j]) {
					DFS(new Matrix(i, j));
					nonRGB++;
				}
			}
		}
		
		System.out.println(RGB + " " + nonRGB);
		
		sc.close();
	}
	
	public static void DFS(Matrix m) {
		
		char c = map[m.x][m.y];
		check[m.x][m.y] = true;
		
		for(int i = 0 ; i < dx.length ; i++) {
			int x = m.x + dx[i];
			int y = m.y + dy[i];
			
			if(0 <= x && x < map.length && 0 <= y && y < map[0].length) {
				if(map[x][y] == c && !check[x][y]) {
					DFS(new Matrix(x, y));
				}
			}
		}
		
	}
	
}
