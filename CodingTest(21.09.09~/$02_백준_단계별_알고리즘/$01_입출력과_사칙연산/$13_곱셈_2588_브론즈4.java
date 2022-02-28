package $01_입출력과_사칙연산;

import java.util.Scanner;

public class $13_곱셈_2588_브론즈4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String stringB = String.valueOf(b);
		
		for(int i = 0 ; i < stringB.length() ; i++) {
			int temp = stringB.charAt(stringB.length() - i - 1) - '0';
			System.out.println(temp * a);
		}
		
		System.out.println(a * b);
		
		sc.close();
		
	}

}
