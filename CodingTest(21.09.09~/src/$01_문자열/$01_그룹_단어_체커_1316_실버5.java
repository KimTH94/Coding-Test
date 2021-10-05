package $01_문자열;

import java.util.Scanner;

public class $01_그룹_단어_체커_1316_실버5 {

	public static boolean solution(String s) {
		boolean status = true;
		
		boolean[] alphabet = new boolean[26];
		int prev = -1;
		
		for(int i = 0 ; i < s.length() ; i++) {
			int now = s.charAt(i) - 'a';
			
			if(prev != now) {
				if(alphabet[now]) {
					status = false;
					return status;
				}else {
					alphabet[now] = true;
				} 
			}
			prev = now;
		}
		
		
		return status;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		for(int i = 0 ; i < N ; i++) {
			String s = sc.next();
			if(solution(s)) {
				System.out.println(s);
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
