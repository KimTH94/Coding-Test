package $01_문자열;

import java.util.Scanner;

public class $02_크로아티아_알파벳_2941_실버5 {

	public static final String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		for(int i = 0 ; i < croatia.length ; i++) {
			s = s.replaceAll(croatia[i], " ");
		}
		
		System.out.println(s.length());
		sc.close();
	}
	
}
