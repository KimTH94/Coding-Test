package $12_시뮬레이션;

import java.util.Scanner;

public class $02_마법사_상어와_비바라기_21610_골드5 {
	
	public static int[][] map;

	public static final int[] dx = {  0, -1, -1, -1, 0, 1, 1,  1};
	public static final int[] dy = { -1, -1,  0,  1, 1, 1, 0, -1};
	//←, ↖, ↑, ↗, →, ↘, ↓, ↙ 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		map = new int[N + 1][N + 1];
		
		printMap();
		
		sc.close();
	}
	
	public static void printMap() {
		
		
		System.out.println("==== printPoint ===");
		for(int i = 1 ; i < map.length ; i++) {
			for(int j = 1 ; j < map[i].length ; j++) {
				System.out.print("(" + i + " , " + j  + ")");
			}
			System.out.println();
		}
		System.out.println("==== printPoint ===");
		
	
		System.out.println("==== printMap ===");
		for(int i = 1 ; i < map.length ; i++) {
			for(int j = 1 ; j < map[i].length ; j++) {
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("==== printMap ===");
	}
}
