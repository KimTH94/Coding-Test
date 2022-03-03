package $04_while문;

import java.util.Scanner;

public class $03_더하기_사이클_1110_브론즈1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String temp = s;
		
		int count = 0;
		while(true) {
			int num = 0;
			if(s.length() == 1) {
				num = (Integer.parseInt(s) * 10) + Integer.parseInt(s);
			}else {
				num = (Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(1, 2)));
				if(num < 10) {
					num = (Integer.parseInt(s.substring(1, 2)) * 10) + num;
				}else {
					num = (Integer.parseInt(s.substring(1, 2)) * 10) + Integer.parseInt(String.valueOf(num).substring(1, 2));
				}
				
			}
			
			s = String.valueOf(num);
			count++;
			
			if(s.equals(temp)) {
				System.out.println(count);
				break;
			}
		}
		
		sc.close();
		
	}
	
}
