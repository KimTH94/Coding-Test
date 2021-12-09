package $Dev_Matching_Back_End_2021_상반기;

import java.util.*;

public class $01_로또의_최고_순위와_최저_순위_Lv1 {

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};
		answer = new int[2];
		
		int zeroCount    = 0;
		int correctCount = 0;
		
		for(int i = 0 ; i < lottos.length ; i++) {
			if(lottos[i] == 0) {
				zeroCount++;
			} else {
				for(int j = 0 ; j < win_nums.length ; j++) {
					if(lottos[i] == win_nums[j]) {
                        correctCount++;
                    }
				}
			}
		}
		
		if(zeroCount + correctCount == 6) {
            answer[0] = 1;
        }else if(zeroCount + correctCount == 5) {
            answer[0] = 2;
        }else if(zeroCount + correctCount == 4) {
            answer[0] = 3;
        }else if(zeroCount + correctCount == 3) {
            answer[0] = 4;
        }else if(zeroCount + correctCount == 2) {
            answer[0] = 5;
        }else {
            answer[0] = 6;
        }
        
        if(correctCount == 6) {
            answer[1] = 1;
        }else if(correctCount == 5) {
            answer[1] = 2;
        }else if(correctCount == 4) {
            answer[1] = 3;
        }else if(correctCount == 3) {
            answer[1] = 4;
        }else if(correctCount == 2) {
            answer[1] = 5;
        }else {
            answer[1] = 6;
        }
        
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] lottos1 = {44, 1, 0, 0, 31, 25};
		int[] win_nums1 = {31, 10, 45, 1, 6, 19};
		
		
		int[] lottos2 = {0, 0, 0, 0, 0, 0};
		int[] win_nums2 = {38, 19, 20, 40, 15, 25};
		
		int[] lottos3 = {45, 4, 35, 20, 3, 9};
		int[] win_nums3 = {20, 9, 3, 45, 4, 35};
		
		System.out.println(solution(lottos1, win_nums1));
		System.out.println(solution(lottos2, win_nums2));
		System.out.println(solution(lottos3, win_nums3));
		
	}
}
