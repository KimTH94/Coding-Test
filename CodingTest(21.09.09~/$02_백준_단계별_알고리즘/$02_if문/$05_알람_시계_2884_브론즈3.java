package $02_if문;

import java.util.Scanner;

public class $05_알람_시계_2884_브론즈3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(minute < 45) {
			if(hour == 0) {
				hour = 24;
			}
			hour--;
			minute = minute + 60 - 45;
		}else {
			minute -= 45;
		}
		
		System.out.println(hour + " " + minute);

		sc.close();
		
	}
	
}
