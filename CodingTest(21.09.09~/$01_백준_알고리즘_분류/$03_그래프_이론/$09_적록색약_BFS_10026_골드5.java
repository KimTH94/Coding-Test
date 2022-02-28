package $03_그래프_이론;

import java.util.*;

public class $09_적록색약_BFS_10026_골드5 {
	
	public static class Matrix {
		int x;
		int y;
		
		Matrix(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static final int[] dx = {-1, 1, 0, 0};
    public static final int[] dy = {0, 0, -1, 1};
    
	public static char[][] map;
	public static boolean[][] check;
	public static Queue<Matrix> q =  new LinkedList<Matrix>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		map = new char[N][N];
		check = new boolean[N][N];
		
		for(int i = 0 ; i < N ; i++) {
			map[i] = sc.next().toCharArray();
		}
		
		int count1 = 0;
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				if(!check[i][j]) {
					BFS(new Matrix(i, j));
					count1++;
				}
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				if(map[i][j] == 'R') {
					map[i][j] = 'G';
				}
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			Arrays.fill(check[i], false);
		}
		
		q.clear();

		int count2 = 0;
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				if(!check[i][j]) {
					BFS(new Matrix(i, j));
					count2++;
				}
			}
		}
		
		System.out.println(count1 + " " + count2);
		
		
		sc.close();
	}
	
	public static void BFS(Matrix m) {
		
		char c = map[m.x][m.y];
		check[m.x][m.y] = true;
		q.add(m);
		
		while(!q.isEmpty()) {
			Matrix t = q.remove();
			int x = t.x;
			int y = t.y;
			
			for(int i = 0 ; i < dx.length ; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(0 <= nx && nx < map.length && 0 <= ny && ny < map.length) {
					if(map[nx][ny] == c && !check[nx][ny]) {
						check[nx][ny] = true;
						q.add(new Matrix(nx, ny));
					}
				}
			}
		}
		
	}
	
	
	public static void printMap(char[][] map) {
		
		for(int i = 0 ; i <  map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				System.out.print(map[i][j] + "  ");
			}
			
			
		}
		
	}
	
}
