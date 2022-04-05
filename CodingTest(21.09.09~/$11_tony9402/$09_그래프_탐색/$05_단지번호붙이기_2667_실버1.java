package $09_그래프_탐색;

import java.util.*;

public class $05_단지번호붙이기_2667_실버1 {
	
	public static class Node {
		int x;
	    int y;
	    
	    Node(int x, int y) {
	      this.x = x;
	      this.y = y;
	    }
	  }
	  
	  public static int N;
	  
	  public static int[][] map;
	  public static boolean[][] check;
	  
	  public static final int[] dx = {0, 0, -1, 1};
	  public static final int[] dy = {-1, 1, 0, 0};
	  
	  public static int index = 1;
	  public static ArrayList<Node> houseList = new ArrayList<Node>();
	  
	  public static int DFS(Node node) {
	    
	    int count = 1;
	    map[node.x][node.y] = index;
	    check[node.x][node.y] = true;
	    
	    for(int i = 0 ; i < dx.length ; i++) {
	      int x = node.x + dx[i];
	      int y = node.y + dy[i];
	      
	      if(0 <= x && x < N && 0 <= y && y < N) {
	        if(map[x][y] == 1 && !check[x][y]) {
	          map[x][y] = index;
	          check[x][y] = true;
	          count += DFS(new Node(x, y));
	        }
	      }
	    }
	    
	    return count;
	  }

	  public static void main(String[] args){

	    Scanner sc = new Scanner(System.in);
	    
	    N = sc.nextInt();
	    sc.nextLine();
	    
	    map = new int[N][N];
	    
	    for(int i = 0 ; i < map.length ; i++) {
	      String s = sc.nextLine();
	      for(int j = 0 ; j < N ; j++) {
	        map[i][j] = s.charAt(j) - '0';
	      }
	    }
	    
	    check = new boolean[N][N];
	    
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i = 0 ; i < N ; i++) {
	      for(int j = 0 ; j < N ; j++) {
	        if(map[i][j] == 1 && !check[i][j]) {
	          //list.add(BFS(new Node(i, j)));
	          list.add(DFS(new Node(i, j)));
	        }
	      }
	    }
	        
	    Collections.sort(list);
	    
	    System.out.println(list.size());
	    for(int i = 0 ; i < list.size() ; i++) {
	      System.out.println(list.get(i));
	    }
	    
	  }
	  
	  public static int BFS(Node node) {
	    
	    index++;

	    Queue<Node> q = new LinkedList<Node>();
	    q.add(node);
	    map[node.x][node.y] = index;
	    check[node.x][node.y] = true;
	    
	    int count = 1;
	    while(!q.isEmpty()) {
	      Node n = q.poll();
	      
	      for(int i = 0 ; i < dx.length ; i++) {
	        int x = n.x + dx[i];
	        int y = n.y + dy[i];
	        
	        if(0 <= x && x < N && 0 <= y && y < N) {
	          if(map[x][y] == 1 && !check[x][y]) {
	            map[x][y] = index;
	            check[x][y] = true;
	            q.add(new Node(x, y));
	            count++;
	          }
	        }
	      }
	    }
	    
	    return count;
	  }
	  
	  public static void printMap(int[][] map) {
	    
	    for(int i = 0 ; i < map.length ; i++) {
	      for(int j = 0 ; j < map[i].length ; j++) {
	        System.out.print(map[i][j] + "  ");
	      }
	      System.out.println();
	    }
	    System.out.println("====== printMap ======");
	    
	  }
}

