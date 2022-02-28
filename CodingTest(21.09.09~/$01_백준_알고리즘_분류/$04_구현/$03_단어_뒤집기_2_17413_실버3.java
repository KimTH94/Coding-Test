package $04_구현;

import java.util.*;

public class $03_단어_뒤집기_2_17413_실버3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		String answer = "";
		
		StringBuilder sb = new StringBuilder();
		boolean bracket = false;
		for(int i = 0 ; i < S.length() ; i++) {
			char c = S.charAt(i);
			
			if(c == '<') {
				if(sb.length() > 0) {
					answer += sb.reverse();
					sb = new StringBuilder();
				}
				bracket = true;
			}
			
			if(bracket) {
				answer += c;
			} else {
				if(c == ' ') {
					answer += sb.reverse();
					sb = new StringBuilder();
					answer += c;
				} else {
					sb.append(c);
				}
			}

			if(c == '>') {
				bracket = false;
			}
		}
		
		if(sb.length() > 0) {
			answer += sb.reverse();
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
