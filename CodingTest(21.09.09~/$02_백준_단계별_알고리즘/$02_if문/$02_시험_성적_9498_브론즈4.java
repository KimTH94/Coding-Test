package $02_if문;

import java.util.Scanner;

public class $02_시험_성적_9498_브론즈4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(90 <= N && N <= 100) {
			System.out.println("A");
		}else if(80 <= N && N <= 89) {
			System.out.println("B");
		}else if(70 <= N && N <= 79) {
			System.out.println("C");
		}else if(60 <= N && N <= 69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

		sc.close();
		
	}
	
}
