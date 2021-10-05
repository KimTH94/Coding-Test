package $00_팁;

public class $03_재귀 {

	public static void recursice(int i) {

		if(i == 100) {
			return;
		}
		
		System.out.println(i + " 재귀함수에서 " + (i + 1) + " 번째 재귀함수 호출.");
		recursice(i + 1);
		System.out.println(i + " 재귀함수 종료.");
	}
	
	public static void main(String[] args) {
		recursice(1);
	}
}
