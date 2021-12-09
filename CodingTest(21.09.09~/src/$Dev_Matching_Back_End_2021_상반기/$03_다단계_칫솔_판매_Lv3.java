package $Dev_Matching_Back_End_2021_상반기;

import java.util.*;


public class $03_다단계_칫솔_판매_Lv3 {
	
	public static class Person {
		String name;
		Person parent;
		int profit;
		
		public Person(String name, Person parent, int profit) {
			this.name = name;
			this.parent = parent;
			this.profit = profit;
		}
		
		public void CalcProfit(int profit) {
			int parentProfit = profit / 10;
			this.profit += profit - parentProfit;
			if(this.parent != null && parentProfit >= 1) {
				this.parent.CalcProfit(parentProfit);
			}	
		}
	}
	
	public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = {};
        answer = new int[enroll.length];
        
        HashMap<String, Person> people = new HashMap<String, Person>();
        
        for(int i = 0 ; i < enroll.length ; i++) {
        	people.put(enroll[i], new Person(enroll[i], null, 0));
        }
        
        for(int i = 0 ; i < referral.length ; i++) {
        	if(!"-".equals(referral[i])) {
        		people.get(enroll[i]).parent = people.get(referral[i]);
        	}
        }
        
        for(int i = 0 ; i < seller.length ; i++) {
        	people.get(seller[i]).CalcProfit(amount[i] * 100);
        }
        
        for(int i = 0 ; i < enroll.length ; i++) {
        	answer[i] = people.get(enroll[i]).profit;
        }
        
        return answer;
	}

	public static void main(String[] args) {
		String[] enroll   = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
		String[] seller   = {"young", "john", "tod", "emily", "mary"};
		int[] amount      = {12, 4, 2, 5, 10};
		int[] result      = {360, 958, 108, 0, 450, 18, 180, 1080};
		
		int[] solution = solution(enroll, referral, seller, amount);
						
	}
}

