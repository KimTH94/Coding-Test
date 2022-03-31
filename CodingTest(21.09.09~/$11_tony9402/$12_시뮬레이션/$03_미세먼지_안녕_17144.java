package $12_시뮬레이션;

import java.util.*;

public class $03_미세먼지_안녕_17144 {
	  
	public static class Point {
		int x;
		int y;
		    
		Point(int x, int y) {
			this.x = x;
			this.y = y;
			}
		}
		  
	public static int R;
	public static int C;
	public static int T;
		  
	public static int[][] map;
	public static int airCleaner = 0;
	public static final int[] dx = {0, 0, 1, -1};
	public static final int[] dy = {-1, 1, 0, 0};
		  
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		R = sc.nextInt();
		C = sc.nextInt();
		T = sc.nextInt();
		    
		map = new int[R][C];
		    
		for(int i = 0 ; i < R ; i++) {
			for(int j = 0 ; j < C ; j++) {
				
				map[i][j] = sc.nextInt();
				
				if(map[i][j] == -1) {
					airCleaner = i;
				}
			}
		}
		    
		for(int t = 0 ; t < T ; t++) {
			
			Diffusion();
		    
			startAirCleaner();
			
			printMap();
		}

		sc.close();
		    
	}
		  
	public static void Diffusion() { // 미세먼지 확산 함수

		int[][] tempMap = new int[R][C];
		    
		Queue<Point> q = new LinkedList<Point>();
		

		for(int i = 0 ; i < R ; i++) {
			for(int j = 0 ; j < C ; j++) {
				
				if(map[i][j] == -1) {
					tempMap[i][j] = map[i][j];
				}
		        
				if(map[i][j] != 0 && map[i][j] != -1) {
		          q.add(new Point(i, j));
		        }
				
			}
		}
		    
		while(!q.isEmpty()) {
			Point p = q.poll();
		      
		    int x = p.x;
		    int y = p.y;
		      
		    int count = 0;
		    for(int k = 0 ; k < dx.length ; k++) {
		    	int nx = x + dx[k];
		        int ny = y + dy[k];
		        
		        if(0 <= nx && nx < R && 0 <= ny && ny < C) { // 범위 안에 있을 떄
		            if(map[nx][ny] != -1) { // 공기청정기가 아닐 때
		            	tempMap[nx][ny] += (int) map[x][y] / 5;
		            	count++;
		            	System.out.println("x : " + x + " / y : " + y + " ==> nx : " + nx + " / ny : " + ny + " / temp : " + tempMap[nx][ny] + " / map : " + map[x][y]);
		            }
		       }
		    }

		    if(count > 0 ) {
		    	tempMap[x][y] += map[x][y] - ((map[x][y] / 5) * count);
		    }
		}
		    
		for(int i = 0 ; i < R ; i++) {
			for(int j = 0 ; j < C ; j++) {
				map[i][j] = tempMap[i][j];
			}
		 }
		
	}
	
	public static void startAirCleaner() {		
		System.out.println(airCleaner); 
		
		for(int i = 0 ; i < C ; i++) {
			System.out.println(map[i]);
		}
	}
		  
		  public static void printMap() {
		    
/*
3 3 1
5 0 0
0 0 0
0 0 0
   
3 3 1
0 30 7
-1 10 0
-1 0 20
*/
		    System.out.println("==== printMap ====");
		    for(int i = 0 ; i < R ; i++) {
		      for(int j = 0 ; j < C ; j++) {
		        System.out.print(map[i][j] + "    ");
		      }
		      System.out.println();
		    }
		    System.out.println("==== printMap ====");
		    
		  }

		}