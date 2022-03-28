package $12_시뮬레이션;

import java.util.*;

public class $04_지구온난화_5212_실버2 {
	public static int R;
	public static int C;
	  
	public static char [][] map;
	public static char [][] tempMap;

	public static final int[] dx = {0, 0, 1, -1};
	public static final int[] dy = {1, -1, 0, 0};
	  
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
	    int R = sc.nextInt();
	    int C = sc.nextInt();
	    
	    
	    map = new char[R][C];
	    tempMap = new char[R][C];
	    sc.nextLine();
	    
	    for(int i = 0 ; i < map.length ; i++) {
	      String s = sc.nextLine();
	      map[i] = s.toCharArray();
	      tempMap[i] = s.toCharArray();
	    }

	    for(int i = 0 ; i < map.length ; i++) {
	      for(int j = 0 ; j < map[i].length ; j++) {
	        if(map[i][j] == 'X') {
	          
	          int count = 0;
	          
	          for(int k = 0 ; k < dx.length ; k++) {
	            int nx = i + dx[k];
	            int ny = j + dy[k];
	            
	            if(0 <= nx && nx < R && 0 <= ny && ny < C) {
	              if(map[nx][ny] == '.') {
	                count++;
	              }
	            }else {
	              count++;
	            }
	          }
	          
	          if(count >= 3) {
	            tempMap[i][j] = '.';
	          }
	        }
	      }
	    }
	    
	    printMap(tempMap);
	    
	    int minIndex = C;
	    int maxIndex = 0;
	    for(int i = 0 ; i < map.length ; i++) {
	      for(int j = 0 ; j < map[i].length ; j++) {
	        
	        if(tempMap[i][j] == 'X') {
	          minIndex = Math.min(minIndex, j);
	          maxIndex = Math.max(maxIndex, j);
	        }
	      }
	    }
	        
	    for(int i = 0 ; i < map.length ; i++) {
	      String temp = "";
	      boolean flag = false;
	      
	      for(int j = minIndex ; j <= maxIndex ; j++) {
	        
	        temp += tempMap[i][j];
	        if(tempMap[i][j] == 'X') {
	          flag = true;
	        }
	        
	      }
	      
	      if(flag) {
	        System.out.println(temp);        
	      }
	    }
	    
	    sc.close();
	  }

	  public static void printMap(char[][] map) {
	    
	    for(int i = 0 ; i < map.length ; i++) {
	      for(int j = 0 ; j < map[i].length ; j++) {
	        System.out.print(map[i][j] + "  ");
	      }
	      System.out.println();
	    }
	  }
	}