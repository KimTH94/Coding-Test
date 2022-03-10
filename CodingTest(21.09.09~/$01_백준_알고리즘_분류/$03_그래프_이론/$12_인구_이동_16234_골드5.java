package $03_그래프_이론;

import java.util.*;

public class $12_인구_이동_16234_골드5 {

	public static class Node {
		int x;
		int y;
		
		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static int[][] map;
	public static boolean[][] check;
	public static ArrayList<Node> list;
	
	public static int N;
	public static int L;
	public static int R;
	
	public static final int[] dx = {0, 0, 1, -1};
	public static final int[] dy = {1, -1, 0, 0};
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();	// 땅 크기(1 <= N <= 50)
		L = sc.nextInt();	// 인구 차이 (1 <= L <= R <= 100)
		R = sc.nextInt();
		
		map = new int[N][N];
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		
		while(true) {
			
			boolean flag = false;
			check = new boolean[N][N];
			
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j < N ; j++) {
					if(!check[i][j]) {
						int sum = BFS(i, j);
						
						if(list.size() > 1) {
							move(sum);
							flag = true;
						}
					}
				}
			}
			
			if(!flag) {
				break;
			}else {
				count++;
			}
		}

		System.out.println(count);
		
		sc.close();
		
	}
	
	public static void move(int sum) {
		int avg = sum / list.size();
		
		for(int i = 0 ; i < list.size() ; i++) {
			int nx = list.get(i).x;
			int ny = list.get(i).y;
			
			map[nx][ny] = avg;
		}
	}
	
	public static int BFS(int x, int y) {
		int sum = 0;
		
		Queue<Node> q = new LinkedList<Node>();
		list = new ArrayList<Node>();
		
		q.offer(new Node(x, y));
		list.add(new Node(x, y));
		check[x][y] = true;

		sum += map[x][y];
		
		while(!q.isEmpty()) {
			Node currentNode = q.poll();
			for(int i = 0 ; i < dx.length ; i++) {
				int nx = currentNode.x + dx[i];
				int ny = currentNode.y + dy[i];
				
				if(0 <= nx && nx < N && 0 <= ny && ny < N) {
					if(!check[nx][ny]) {
						int diff = Math.abs(map[currentNode.x][currentNode.y] - map[nx][ny]);
						if(L <= diff && diff <= R) {
							q.offer(new Node(nx, ny));
							list.add(new Node(nx, ny));
							check[nx][ny] = true;
							sum += map[nx][ny];
						}
					}
				}
				
			}
		}
				
		return sum;
	}
	
}
