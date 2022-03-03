package $03_for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class $04_빠른_A_PLUS_B_15552_브론즈2 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
 
        for(int i = 0 ; i < TC ; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A+B;
 
            sb.append(sum + "\n");
        }
 
        System.out.print(sb);
        
        br.close();
        
	}
	
}
