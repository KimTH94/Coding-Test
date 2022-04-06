package $09_그래프_탐색;

import java.util.*;

public class $06_봄버맨 {
	
	public static class Node {
		int x;
	    int y;
	    
	    Node(int x, int y) {
	      this.x = x;
	      this.y = y;
	    }
	  }
	  
	  public static int R;  // 열
	  public static int C;  // 행
	  public static int N;  // 시간 
	  
	  public static char[][] map;
	  public static boolean[][] check;
	  
	  public static final int[] dx = {0, 0, -1, 1};
	  public static final int[] dy = {-1, 1, 0, 0};
	  
	  public static ArrayList<Node> bombList = new ArrayList<Node>();
	  
	  public static void main(String[] args){

	    Scanner sc = new Scanner(System.in);
	    
	    R = sc.nextInt();
	    C = sc.nextInt();
	    N = sc.nextInt();
	    sc.nextLine();
	    
	    map = new char[R][C];
	    
	    for(int i = 0 ; i < R ; i++) {
	      String s = sc.nextLine();
	      for(int j = 0 ; j < C ; j++) {
	        map[i][j] = s.charAt(j);
	        
	        if(map[i][j] == 'O') {
	          bombList.add(new Node(i, j));
	        }
	      }
	    }

	    int time = 0;
	    while(time != N) {
	      
	      time++;
	      
	      if(time == 1) {
	        second();
	      } else {
	        if(time % 2 == 0) { // 폭탄 설치되어 있지 않은 모든 칸에 폭탄 설치
	          setBomb();
	        } else {
	          second();
	        }
	      }      
	    }
	    
	    for(int i = 0 ; i < map.length ; i++) {
	      for(int j = 0 ; j < map[i].length ; j++) {
	        if(map[i][j] != '.') {
	          map[i][j] = 'O';
	        }
	        System.out.print(map[i][j]);
	      }
	      System.out.println();
	    }

	  }
	  
	  public static void setBomb() {
	    
	    for(int i = 0 ; i < R ; i++) {
	      for(int j = 0 ; j < C ; j++) {
	        if(map[i][j] == 'O') {  // 폭탄일 때 시간 증가
	          map[i][j] = '1';
	        } else if(map[i][j] == '1') {
	          map[i][j] = '2';
	        } else if(map[i][j] == '2') {
	          BFS(new Node(i, j));
	        } else {
	          map[i][j] = 'O';
	        }
	      }
	    }
	    
	  }
	  
	  public static void second() {
	    for(int i = 0 ; i < R ; i++) {
	      for(int j = 0 ; j < C ; j++) {
	        if(map[i][j] == 'O') {  // 폭탄일 때 시간 증가
	          map[i][j] = '1';
	        } else if(map[i][j] == '1') {
	          map[i][j] = '2';
	        } else if(map[i][j] == '2') {
	          BFS(new Node(i, j));
	        }
	      }
	    }
	  }
	  
	  public static void BFS(Node node) {
	    
	    Queue<Node> q = new LinkedList<Node>();
	    q.add(node);
	    map[node.x][node.y] = '.';
	    
	    while(!q.isEmpty()) {
	      Node n = q.poll();
	      
	      for(int i = 0 ; i < dx.length ; i++) {
	        int x = n.x + dx[i];
	        int y = n.y + dy[i];
	        
	        if(0 <= x && x < R && 0 <= y && y < C) {
	          
	          if(map[x][y] == '2') {
	            q.add(new Node(x, y));
	          }
	          map[x][y] = '.';
	        }
	      }
	      
	    }
	    
	  }
	    
}