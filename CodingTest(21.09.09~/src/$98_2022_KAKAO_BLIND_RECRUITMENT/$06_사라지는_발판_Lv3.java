package $98_2022_KAKAO_BLIND_RECRUITMENT;

public class $06_사라지는_발판_Lv3 {

	public static final int[] dx = {0, 0, 1, -1};
	public static final int[] dy = {1, -1, 0, 0};
	public static int N;
	public static int M;
	public static int MIN;
	
	public static int solution(int[][] board, int[] aloc, int[] bloc) {
		int answer = 0;
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[][] board1 = {{1, 1, 1}, {1, 1, 1}};
		int[] aloc1 = {1, 0};
		int[] bloc1 = {1, 2};
		int result1 = 5;
		
		int[][] board2 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
		int[] aloc2 = {1, 0};
		int[] bloc2 = {1, 2};
		int result2 = 4;
		
		int[][] board3 = {{1, 1, 1, 1, 1}};
		int[] aloc3 = {0, 0};
		int[] bloc3 = {0, 4};
		int result3 = 4;
		
		int[][] board4 = {{1}};
		int[] aloc4 = {0, 0};
		int[] bloc4 = {0, 0};
		int result4 = 0;
		
		solution(board1, aloc1, bloc1);
		//solution(board2, aloc2, bloc2);
		//solution(board3, aloc3, bloc3);
		//solution(board4, aloc4, bloc4);
		
	}
}
