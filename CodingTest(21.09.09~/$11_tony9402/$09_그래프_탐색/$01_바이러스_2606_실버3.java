package $09_그래프_탐색;

import java.util.*;

public class $01_바이러스_2606_실버3 {
	public static int[][] map;
	public static boolean[] check;
	  
	public static int count = 0;
	  
	public static int BFS() {
		
		Queue<Integer> q = new LinkedList<Integer>();
	    q.add(1);
	    check[1] = true;
	    
	    while(!q.isEmpty()) {
	      int n = q.poll();
	      
	      for(int i = 1 ; i < map[n].length ; i++) {
	        if(map[n][i] == 1 && !check[i]) {
	          q.add(i);
	          check[i] = true;
	          count++;
	        }
	      }
	    }
	    
	    return count;
	  }
	  
	  public static int DFS(int index) {
	    
	    check[index] = true;
	    
	    for(int i = 1 ; i < map[index].length ; i++) {
	      if(map[index][i] == 1 && !check[i]) {
	        count++;
	        DFS(i);
	      }
	    }
	    
	    return count;
	  }
	  
	  public static void main(String[] args){
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt(); // 컴퓨터 수
	    int edges = sc.nextInt(); // 간선 수

	    map = new int[N + 1][N + 1];
	    check = new boolean[N + 1];
	    
	    
	    for(int i = 0 ; i < edges ; i++) {
	      int com1 = sc.nextInt();
	      int com2 = sc.nextInt();
	      
	      map[com1][com2] = 1;
	      map[com2][com1] = 1;
	    }
	    
	    System.out.println(BFS());
	    System.out.println(DFS(1));
	    
	    sc.close();
	    
	  }
	  
	}