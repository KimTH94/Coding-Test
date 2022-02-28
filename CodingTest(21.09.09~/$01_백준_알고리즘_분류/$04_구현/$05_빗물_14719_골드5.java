package $04_구현;

import java.util.Scanner;

public class $05_빗물_14719_골드5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		int H = sc.nextInt();
		sc.nextLine();
		String[] s = sc.nextLine().split(" ");
		
		int[][] map = new int[S][H];
		for(int i = 0 ; i < s.length ; i++) {
			for(int j = 0 ; j < Integer.parseInt(s[i]) ; j++) {
				map[S - j - 1][i] = 1;
			}
		}
		
		int startIndex = -1;
		int endIndex   = -1;
		int count = 0;
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				if(map[i][j] == 1) {
					startIndex = j; 
					break;
				}
			}
			
			for(int j = 0 ; j < map[0].length ; j++) {
				if(map[i][map[0].length - j - 1] == 1) {
					 endIndex = map[0].length - j - 1;
					 break;
				}
			}
			
			if(startIndex == -1 || endIndex == -1) {
				continue;
			} else {
				for(int j = startIndex ; j <= endIndex ; j++) {
					if(map[i][j] == 0) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
