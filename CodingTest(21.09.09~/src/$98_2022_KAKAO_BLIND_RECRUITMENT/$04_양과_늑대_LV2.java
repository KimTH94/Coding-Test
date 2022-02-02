package $98_2022_KAKAO_BLIND_RECRUITMENT;

import java.util.*;

public class $04_양과_늑대_LV2 {
	
	public static int MAX = 0;
	public static HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
	
	public static void DFS(int index, int wolf, int sheep, ArrayList<Integer> list, int[] info) {
		if(info[index] == 0) {
			sheep++;
		} else {
			wolf++;
		}
		
		if(wolf >= sheep) {
			return;
		}
		
		MAX = Math.max(MAX, sheep);
		
		ArrayList<Integer> next = new ArrayList<Integer>();
		next.addAll(list);

		
		if(map.containsKey(index)) {
			next.addAll(map.get(index));
		}
		
		next.remove((Integer) index);
		
		for(int n : next) {
			DFS(n, wolf, sheep, next, info);
		}
		
		return;
	}
	
	public static int solution(int[] info, int[][] edges) {
        int answer = 0;

        for(int i = 0 ; i < edges.length ; i++) {
        	if(!map.containsKey(edges[i][0])) {
        		map.put(edges[i][0], new ArrayList<Integer>());
        	} 
        	map.get(edges[i][0]).add(edges[i][1]);
        }
        
        int sheep = 0;
        int wolf = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        DFS(0, wolf, sheep, list, info);
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] info1 = {0,0,1,1,1,0,1,0,1,0,1,1};
		int[][] edges1 = {{0,1},{1,2},{1,4},{0,8},{8,7},{9,10},{9,11},{4,3},{6,5},{4,6},{8,9}};
		int result1 = 5;
		
		int[] info2 = {0,1,0,1,1,0,1,0,0,1,0};
		int[][] edges2 = {{0,1},{0,2},{1,3},{1,4},{2,5},{2,6},{3,7},{4,8},{6,9},{9,10}};
		int result2 = 5;
				
		solution(info1, edges1);
		
		solution(info2, edges2);
	}
}
