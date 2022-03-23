package $07_Backtracking;

public class 게임_데브_2번_n목 {
	
	public static void printMap(int[][] map) {
		System.out.println("==========");
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[i].length ; j++) {
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static int countRight(int[][] map, int x, int y, int n) {
		int count = 0;
			
		boolean flag = true;
		for(int i = 0 ; i < n ; i++) {
			if(y + i < map[0].length) {
				if(map[x][y + i] == 0) {
					flag = false;
				}
			} else {
				flag = false;
			}
		}
		
		if(y + n < map[0].length) {
			if(map[x][y + n] == 1) {
				flag = false;
			}
		}
		
		if(flag) {
			count = 1;
		} else {
			count = 0;
		}
		
		return count;
	}
	
	public static int countDown(int[][] map, int x, int y, int n) {
		int count = 0;
		
		boolean flag = true;
		for(int i = 0 ; i < n ; i++) {
			if(!(x + i >= map.length)) {
				if(map[x + i][y] == 0) {
					flag = false;
				}
			} else {
				flag = false;
			}
		}
		
		if(x + n < map.length) {
			if(map[x + n][y] == 1) {
				flag = false;
			}
		}
		
		if(flag) {
			count = 1;
		} else {
			count = 0;
		}
		
		return count;
	}
	
	
	
	public static int countRighUp(int[][] map, int x, int y, int n) {
		int count = 0;
		
		boolean flag = true;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("n : " + n);
		for(int i = 0 ; i < n ; i++) {
			if(x - i >= 0 && y - i >= 0) {
				System.out.println("i : " + i + " --> ");
				if(map[x - i][y - i] == 0) {
					flag = false;
				}
			} else {
				flag = false;
			}
		}
		
		if(x - n >= 0 && y - n >= 0) {
			if(map[x - n][y - n] == 1) {
				flag = false;
			}
		}
		
		if(flag) {
			count = 1;
		} else {
			count = 0;
		}
		
		System.out.println("=====");
		return count;
	}
	
	public static int solution(int h, int w, int n, String[] board) {
        int answer = -1;
        
        int[][] map = new int[h][w];
        
        for(int i = 0 ; i < board.length ; i++) {
        	for(int j = 0 ; j < board[i].length() ; j++) {
        		if(board[i].charAt(j) == 49) {
        			map[i][j] = 1;
        		}
        	}
        }
        
        answer = 0;
        for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[i].length ; j++) {
				answer += countRight(map, i, j, n);
				//answer += countDown(map, j, i, n);
				//answer += countRightDown(map, j, i, n);
				//answer += countRighUp(map, j, i, n);
				
				if(countRight(map, i, j, n) == 1) {
					System.out.println("i : " + i + " / j : " + j + " / answer : " + answer);
				}
			}
		}
        
        System.out.println("answer : " + answer);
        printMap(map);
        
        return answer;
    }

	public static int countRightDown(int[][] map, int x, int y, int n) {
		int count = 0;
		
		boolean flag = true;
		for(int i = 0 ; i < n ; i++) {
			if(!(x + i >= map.length) && !(y + i >= map[0].length)) {
				if(map[x + i][y + i] == 0) {
					flag = false;
				}
			} else {
				flag = false;
			}
		}
		
		if(x + n < map.length && y + n < map[0].length) {
			if(map[x + n][y + n] == 1) {
				flag = false;
			}
		}
		
		if(flag) {
			count = 1;
		} else {
			count = 0;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int h1 = 7;
		int w1 = 9;
		int n1 = 4;
		String[] board1 = {"111100000","000010011","111100011","111110011","111100011","111100010","111100000"};
		int result1 = 10;
		
		int h2 = 5;
		int w2 = 5;
		int n2 = 5;
		String[] board2 = {"11111","11111","11111","11111","11111"};
		int result2 = 12;

		System.out.println(solution(h1, w1, n1, board1));
		
		
		// 처음 격자 상태 
		// 1 1 2 2
		// 1 1 2 2
 		// 2 2 1 1
		// 2 2 1 1 
		
		//{{1,1,1,1},{2,1,2,2},{2,2,2,1},{1,1,2,2}}	5
		//[[1,1,1,2],[1,1,1,2],[2,2,2,1],[1,2,2,2]]	3
		
		
		 //DFS 몇번까지 가능할까? 재귀 Depth 계산
		
	}
}
