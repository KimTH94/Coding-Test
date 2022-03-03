package $03_for문;

import java.util.Scanner;

public class $03_합_8393_브론즈5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i = 1 ; i <= n ; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		sc.close();
		
	}
	
}
