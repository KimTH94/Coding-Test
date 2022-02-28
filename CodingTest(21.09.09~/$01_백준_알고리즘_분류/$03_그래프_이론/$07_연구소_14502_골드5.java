package $03_그래프_이론;

import java.util.*;


public class $07_연구소_14502_골드5 {
	
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
	public static int MAX = 0;
	
	public static int countSafeZone(int[][] map) {
		
		int count = 0;
		
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				if(map[i][j] == 0) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	
	public static void setWall(int[][] map, int count) {
		
		if(count == 3) {
			MAX = Math.max(MAX, BFS(map));
			return;
		} else {
			for(int i = 0 ; i < map.length ; i++) {
				for(int j = 0 ; j < map[0].length ; j++) {
					if(map[i][j] == 0) {
						map[i][j] = 1;
						setWall(map, count + 1);
						map[i][j] = 0;
					}
				}
			}
		}
		
	}
	
	
	public static int BFS(int[][] map) {
		int count = 0;
		
		int[][] temp = new int[map.length][map[0].length];
		
		Queue<Matrix> q = new LinkedList<Matrix>();
		boolean[][] check = new boolean[map.length][map[0].length];
		
		
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				temp[i][j] = map[i][j];
				
				if(temp[i][j] == 2) {
					q.add(new Matrix(i, j));
					check[i][j] = true;
				}
			}
		}
		
		while(!q.isEmpty()) {
			Matrix m = q.remove();
			
			for(int i = 0 ; i < dx.length ; i++) {
				int x = m.x + dx[i];
				int y = m.y + dy[i];
				
				if(0 <= x && x < map.length && 0 <= y && y < map[0].length) {
					if(!check[x][y] && temp[x][y] == 0) {
						temp[x][y] = 2;
						q.add(new Matrix(x, y));
						check[x][y] = true;
					}
				}
			}
		}
		
		count = countSafeZone(temp);
		
		return count;
	}
	
	public static void printMap(int[][] map) {
		
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 세로
		int M = sc.nextInt();	// 가로 
		
		int[][] map = new int[N][M];
		
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		setWall(map, 0);
		
		System.out.println(MAX);
		
		sc.close();
	}
	
}
