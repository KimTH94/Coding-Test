package $Dev_Matching_Back_End_2021_상반기;

public class $02_행렬_테두리_회전하기_Lv2 {
	
	public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        
        int[][] map = new int[rows + 1][columns + 1];
        
        int index = 1;
        for(int i = 1 ; i < map.length ; i++) {
        	for(int j = 1 ; j < map[i].length ; j++) {
        		map[i][j] = index;
        		index++;
        	}
        }
        
        for(int i = 0 ; i < queries.length ; i++) {
        	answer[i] = rotation(map, queries[i]);
        	printMap(map);
        }
        
        return answer;
    }
	
	public static int rotation(int[][] map, int[] query) {
	
		int x1 = query[0];
		int y1 = query[1];
		
		int x2 = query[2];
		int y2 = query[3];
		
		int current = map[x1][y1];
		int next = 0;
		int min  = current;
		
		for(int i = y1 ; i < y2 ; i++) {
			next = map[x1][i + 1];
			min = Math.min(min, Math.min(current, next));
			map[x1][i + 1] = current;
			current = next;
		}
			
		for(int i = x1 ; i < x2 ; i++) {
			next = map[i + 1][y2];
			min = Math.min(min, Math.min(current, next));
			map[i + 1][y2] = current;
			current = next;
		}
			
		for(int i = y2 ; i > y1 ; i--) {
			next = map[x2][i - 1];
			min = Math.min(min, Math.min(current, next));
			map[x2][i - 1] = current;
			current = next;
		}
			
		for(int i = x2 ; i > x1 ; i--) {
			next = map[i - 1][y1];
			min = Math.min(min, Math.min(current, next));
			map[i - 1][y1] = current;
			current = next;
		}
		
		return min;
	}
	
	public static void printMap(int[][] map) {
		
		for(int i = 1 ; i < map.length ; i++) {
			for(int j = 1 ; j < map[i].length ; j++) {
				System.out.print(map[i][j] + "    ");
			}
		}
		
		System.out.println("==================");
	}
	
	public static void main(String[] args) {
		
		int rows1    = 6;
		int columns1 = 6;
		int[][] queries1 = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		
		solution(rows1, columns1, queries1);
		
		
	}
}
