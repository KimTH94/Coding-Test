package $00_팁;

public class $3_2_유클리드_호재법_최대공약수_재귀 {

	public static int GCD(int num1, int num2) {
		if(num1 % num2 == 0) {
			return num2;
		} else {
			return GCD(num2, num1 % num2);
		}
	}
	public static void main(String[] args) {
		// 유클리드 호재
		
		System.out.println(GCD(192, 162));
		
	}
	
}
