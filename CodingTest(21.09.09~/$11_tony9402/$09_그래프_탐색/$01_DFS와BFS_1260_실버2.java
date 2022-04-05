package $09_그래프_탐색;

import java.util.*;

public class $01_DFS와BFS_1260_실버2 {
	public static int[][] map;
	public static boolean[] check;
	public static StringBuilder sbDFS = new StringBuilder();
	public static StringBuilder sbBFS = new StringBuilder();
	  
	  public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
	    
		  int N = sc.nextInt(); // 장점의 개수
		  int M = sc.nextInt(); // 간선의 개수
		  int V = sc.nextInt(); // 탐색 시작 번호
	    
		  map = new int[N + 1][N + 1];
		  for(int i = 0 ; i < M ; i++) {
			  int n1 = sc.nextInt();
			  int n2 = sc.nextInt();
	      
			  map[n1][n2] = 1;
			  map[n2][n1] = 1;
		  }
	    
		  check = new boolean[N + 1];
		  DFS(V);
		  check = new boolean[N + 1];
		  BFS(V);
	    
		  System.out.println(sbDFS.toString());
		  System.out.println(sbBFS.toString());
	    
		  sc.close();
	  }
	  
	  
	  public static void DFS(int index) {
		  
		  check[index] = true;
		  sbDFS.append(index + " ");
	    
		  for(int i = 0 ; i < map[index].length ; i++) {
			  if(map[index][i] == 1 && !check[i]) {
				  check[i] = true;
				  DFS(i);
			  }
		  }
	  }
	  
	  public static void BFS(int index) {
		  
		  Queue<Integer> q = new LinkedList<Integer>();
		  q.add(index);
		  check[index] = true;
		  sbBFS.append(index + " ");
	    
		  while(!q.isEmpty()) {
			  int n = q.poll();
	      
			  for(int i = 1 ; i < map[n].length ; i++) {
				  if(map[n][i] == 1 && !check[i]) {
					  q.add(i);
					  check[i] = true;
					  sbBFS.append(i + " ");
				  }
			  }
		  }
	  }

	}
