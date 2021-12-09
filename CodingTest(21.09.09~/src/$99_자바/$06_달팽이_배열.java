package $99_자바;

public class $06_달팽이_배열 {

	public static int[][] map;
	
	public static void printMap() {
		
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				System.out.print(map[i][j] + "    ");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
	}

	public static boolean isFinish() {
		
		boolean flag = true;
		Loop : for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				if(map[i][j] == 0) {
					flag = false;
					break Loop;
				}
			}
		}
		
		return flag; 
	}
	
	public static void main(String[] args) {
		
		map = new int[5][8];

		System.out.println(map.length + " / " + map[0].length);
		int index = 1;
		int line = 0;
		
		int hight = map.length;
		int width = map[0].length;

		while(!isFinish()) {	
			for(int i = 0 ; i < width ; i++) {
				map[line][i] = index;
				index++;
			}
			
			for(int i = 1 ; i < map.length ; i++) {
				map[line + i][map[0].length - 1 - line] = index;
				index++;
			}
			
			for(int i = 1 ; i < map[0].length ; i++) {
				map[map.length - 1 - line][map[0].length - 1 - i] = index;
				index++;
			}
			
			for(int i = 1 ; i < map.length - 1 ; i++) {
				map[map.length - 1 - i][line] = index;
				index++;
			}
			
			System.out.println(line);
			line++;
		}
		
		printMap();
	}
	
}
