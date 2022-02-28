package $04_구현;

import java.util.*;

public class $02_수_이어_쓰기_1_1748_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int answer = 0;		// 자릿수 합 
		int count  = 1;		// 자릿수
		int unit   = 10;	// 단위(10배수)
		
		for(int i = 1 ; i <= N ; i++) {
			if(i == unit) {
				unit *= 10;
				count++;
			}
			answer += count;
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
