package $04_구현;

import java.util.*;

public class $04_숫자_정사각형_1051_실버3 {

	public static int[][] rectangle;
	
	public static boolean check(int i, int j, int length) {
		boolean flag = false;
		if(rectangle[i][j] == rectangle[i + length][j] && rectangle[i][j] == rectangle[i][j + length] && rectangle[i][j] == rectangle[i + length][j + length]) {
			flag = true;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		rectangle = new int[N][M];
		
		for(int i = 0 ; i < N ; i++) {
			String str = sc.next();
			for(int j = 0 ; j < M ; j++) {
				rectangle[i][j] = str.charAt(j) - '0';
			}
		}
		
		int max = 1;
		int length = 1;
		
		while(length < N && length < M) {
			Loop1 : for(int i = 0 ; i < rectangle.length ; i++) {
				for(int j = 0 ; j < rectangle[0].length ; j++) {
					if(i + length < N && j + length < M) {
						if(check(i, j, length)) {
							max = Math.max(length + 1, max);
							break Loop1;
						}
					}
				}
			}
			length++;
		}
		
		System.out.println(max * max);
		
		sc.close();
	}
}
