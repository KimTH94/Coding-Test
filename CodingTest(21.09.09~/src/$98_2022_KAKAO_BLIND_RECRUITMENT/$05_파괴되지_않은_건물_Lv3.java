package $98_2022_KAKAO_BLIND_RECRUITMENT;

public class $05_파괴되지_않은_건물_Lv3 {

	public static int getDistoryCount(int[][] board) {
		
		int count = 0;
		for(int i = 0 ; i < board.length ; i++) {
			for(int j = 0 ; j < board[i].length ; j++) {
				if(board[i][j] > 0) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void startSkill(int[][] temp, int[] skill) {
		
		int type = skill[0];
    	int startX = skill[1];
    	int startY = skill[2];
    	int endX = skill[3];
    	int endY = skill[4];
    	int degree = skill[5];
    	
    	if(type == 1) {
    		degree = -degree;
    	} else {
    		degree = +degree;
    	}
    	
    	temp[startX][startY] += degree;
    	temp[endX + 1][endY + 1] += degree;
    	
    	temp[startX][endY + 1] += -degree;
    	temp[endX + 1][startY] += -degree;
	}
    
    public static int solution(int[][] board, int[][] skill) {
        int answer = 0;
        
        int N = board.length;
        int M = board[0].length;
        
        int[][] temp = new int[N + 1][M + 1];
        for(int i = 0 ; i < skill.length ; i++) {
        	startSkill(temp, skill[i]);
        }
        
        // 아래로 더하기
        for(int i = 1 ; i < temp.length; i++) {
			for(int j = 0 ; j < temp[i].length; j++) {
				temp[i][j] += temp[i - 1][j];
			}
		}

        // 옆으로 더하기
        for(int i = 0 ; i < temp.length; i++) {
			for(int j = 1 ; j < temp[i].length; j++) {
				temp[i][j] += temp[i][j - 1];
			}
		}
        
        for(int i = 0 ; i < board.length; i++) {
			for(int j = 0 ; j < board[i].length; j++) {
				board[i][j] += temp[i][j];
			}
		}
        
        answer = getDistoryCount(board);
        return answer;
    }
    
}
