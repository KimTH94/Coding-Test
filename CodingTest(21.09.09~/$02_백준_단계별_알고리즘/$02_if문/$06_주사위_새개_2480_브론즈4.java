package $02_if문;

import java.util.Scanner;

public class $06_주사위_새개_2480_브론즈4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int money = 0;
		
		if(num1 == num2 && num2 == num3) {
			money = 10000 + (num1 * 1000);
		} else if(num1 == num2 && num2 != num3) {
			money = 1000 + (num1 * 100);
		} else if(num1 == num3 && num1 != num2) {
			money = 1000 + (num1 * 100);
		} else if(num2 == num3 && num2 != num1) {
			money = 1000 + (num2 * 100);
		} else if(num1 != num2 && num2 != num3) {
			int max = Math.max(Math.max(num1, num2), num3);
			money = max * 100;
		}
		
		System.out.println(money);	
		
		sc.close();
		
	}
}
