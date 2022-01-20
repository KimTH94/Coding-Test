package $98_2022_KAKAO_BLIND_RECRUITMENT;

public class $03_k진수에서_소수_개수_구하기_LV2 {

	public String getBinary(int n, int base) {
        String answer = "";
        
        while(n > 0) {
            answer = (n % base) + answer;
            n /= base;
        }

        return answer;
    }
    
    public boolean isPrime(Long n) {
        boolean answer = true;
        
        if(n < 2) {
            return false;
        }
        
        if(n == 2) {
            return true;
        }
        
        for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
        
			if(n % i == 0) {
				return false;
			}
		}
        
        return answer;
    }
    
    public int solution(int n, int k) {
        int answer = 0;
        
        String[] temp = getBinary(n, k).split("0");

        for(int i = 0 ; i < temp.length ; i++) {
            if(!"".equals(temp[i].replaceAll(" ", ""))) {
                if(isPrime(Long.parseLong(temp[i].replaceAll(" ", "")))) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
