package $03_그래프_이론;

import java.util.*;

public class $03_단지번호붙이기_2667_실버1 {

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
		sc.nextLine();
		
		int[][] map = new int[N][N];
		for(int i = 0 ; i < map.length ; i++) {
			String s = sc.nextLine();
			for(int j = 0 ; j < N ; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		boolean[][] visited = new boolean[N][N];
		Queue<Matrix> q = new LinkedList<Matrix>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < N ; j++) {
				int count = 0;
				if(map[i][j] == 1 && !visited[i][j]) {
					q.add(new Matrix(i, j));
					visited[i][j] = true;
					count ++;
					while(!q.isEmpty()) {
						Matrix m = q.poll();
						int x = m.x;
						int y = m.y;
						
						for(int k = 0 ; k < dx.length ; k++) {
							int nx = x + dx[k];
							int ny = y + dy[k];
							
							if(0 <= nx && nx < N && 0 <= ny && ny < N) {
								if(!visited[nx][ny] && map[nx][ny] == 1) {
									q.add(new Matrix(nx, ny));
									visited[nx][ny] = true;
									count++;
								}
							}
						}
					}
				}
				
				if(count > 0) {
					list.add(count);
				}
 			}
		}
		
		int[] answer = new int[list.size()];
		for(int i = 0 ; i < list.size() ; i++ ) {
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
		
		System.out.println(answer.length);
		for(int i = 0 ; i < answer.length ; i++) {
			System.out.println(answer[i]);
		}
		
		sc.close();
	}
}
