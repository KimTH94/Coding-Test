package $00_팁;

public class $3_1_Factorial_재귀 {

	public static int forFactorial(int num) {
		int result = 1;
		
		for(int i = 2 ; i <= num ; i++) {
			result *= i;
		}
		
		return result;
	}
	
	public static int recursionFactorial(int num) {
		
		if(num <= 1) {
			return num; 
		} else {
			return recursionFactorial(num -1) * num;
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
		long start = System.currentTimeMillis();
		System.out.println(forFactorial(14));
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end - start) + " ms");
		
		start = System.currentTimeMillis(); 
		System.out.println(recursionFactorial(14));
		end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end - start) + " ms");
	}
}
