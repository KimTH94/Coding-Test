package $09_그래프_탐색;

import java.util.*;

public class $07_토마토_7576_골드5 {
	
	public static class Node {
		int x;
	    int y; 
	    
	    Node(int x, int y) {
	      this.x = x;
	      this.y = y;
	    }
	}
	  
	public static int N; // 세로
	public static int M; // 가로
	  
	public static int[][] map;
	public static int[][] dist;
	  
	public static final int[] dx = {0, 0, 1, -1};
	public static final int[] dy = {-1, 1, 0, 0};
	  
	public static int day = 0;
	  
	//	1  : 익은 토마토
	//	0  : 익지 않은 토마토
	//	-1 : 토마토 X
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
	    M = sc.nextInt();
	    N = sc.nextInt();
	    sc.nextLine();
	    
	    map = new int[N][M];
	    dist = new int[N][M];
	    
	    Queue<Node> q = new LinkedList<Node>();
	    
	    for(int i = 0 ; i < N ; i++) {
	      for(int j = 0 ; j < M ; j++) {
	        map[i][j] = sc.nextInt();
	        
	        if(map[i][j] == 1) {
	          q.add(new Node(i, j));
	        }
	        
	      }
	    }
	    
	    BFS(q);
	   
	    if(isFull()) {
	      System.out.println(day);
	    } else {
	      System.out.println("-1");
	    }
	    
	    sc.close();
	  }
	  
	  public static int BFS(Queue<Node> q) {
	    
	    while(!q.isEmpty()) {

	      Node n = q.poll();
	      
	      for(int i = 0 ; i < dx.length ; i++) {
	        int x = n.x + dx[i];
	        int y = n.y + dy[i];
	        
	        if(0 <= x && x < N && 0 <= y && y < M) {
	          if(map[x][y] == 0 && dist[x][y] == 0) {
	            map[x][y] = 1;
	            dist[x][y] = dist[n.x][n.y] + 1;
	            q.add(new Node(x, y));
	            day = Math.max(day, dist[x][y]);
	          }
	        }
	      }
	    }
	    
	    return day;
	  }
	  
	  public static boolean isFull() {
	    
	    for(int i = 0 ; i < N ; i++) {
	      for(int j = 0 ; j < M ; j++) {
	        if(map[i][j] == 0) {
	          return false;
	        }
	      }
	    }
	    
	    return true;
	  }

}
