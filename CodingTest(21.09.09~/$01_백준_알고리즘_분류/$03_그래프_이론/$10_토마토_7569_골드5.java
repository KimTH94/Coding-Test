package $03_그래프_이론;

import java.util.*;

public class $10_토마토_7569_골드5 {
	
	public static class Matrix {
		int x;
		int y;
		int z;
		
		Matrix(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	
	public static final int dx[] = {1, -1, 0, 0, 0, 0};
	public static final int dy[] = {0, 0, 1, -1, 0, 0};
	public static final int dz[] = {0, 0, 0, 0, 1, -1};
	
	public static int N;
	public static int M;
	public static int H;
	
	public static int[][][] map;
	public static Queue<Matrix> q = new LinkedList<Matrix>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt(); // 가로
		N = sc.nextInt(); // 세로
		H = sc.nextInt(); // 높이
		
		map = new int[H][N][M];
		
		for(int k = 0 ; k < H ; k++) {
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j < M ; j++) {
					map[k][i][j] = sc.nextInt();
					
					if(map[k][i][j] == 1) {
						q.add(new Matrix(i, j, k));
					}
				}
			}
		}
		
		BFS();
		
		int min = -1;
		
		fisrtFor : for(int k = 0 ; k < H ; k++) {
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j < M ; j++) {
					if(map[k][i][j] == 0) {
						min = -1;
						break fisrtFor;
					} else {
						min = Math.max(min, map[k][i][j]);
					}
				}
			}
		}

        if(min != -1) {
            min--;
        }
        
        System.out.println(min);    
		
		sc.close();
	}
	
	public static void printMap() {
		
		for(int k = 0 ; k < H ; k++) {
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j < M ; j++) {
					System.out.print(map[k][i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("========");
		}
		
	}
	
	public static void BFS() {
		while(!q.isEmpty()) {
			Matrix m = q.remove();
			
			int x = m.x;
			int y = m.y;
			int z = m.z;
			
			for(int i = 0 ; i < dx.length ; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				int nz = z + dz[i];
				
				if(0 <= nx && nx < N && 0 <= ny && ny < M && 0 <= nz && nz < H) {
					if(map[nz][nx][ny] == 0) {
						q.add(new Matrix(nx, ny, nz));

						map[nz][nx][ny] = map[z][x][y] + 1;
					}
				}
			}
		}
	}
}
