package $00_팁;

public class $01_에라토스테네스의_체_소수구하기 {

	public static final int max = 10000;
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();

		boolean[] prime = new boolean[max + 1];
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2 ; i * i <= max ; i++) {
			if(!prime[i]) {
				for(int j = i * i ; j <= max ; j += i) {
					prime[j] = true;
				}
			}
		}
		
		for(int i = 0 ; i <= max ; i++) {
			if(!prime[i]) {
				System.out.println(i);
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end - start) + " ms");
	}
}
