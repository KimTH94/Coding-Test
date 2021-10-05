package $03_그래프_이론;

import java.util.*;

public class $00_DFS_BFS {

	/*
	 * DFS, 깊이 우선 탐색, Depth First Search
	 * 스택 자료구조, 재귀 이용
	 * 탐색 작 노드를 스택에 삽입하고 방문 처리
	 * 스택의 최상단 노드에 방문하지 않은 인접한 노드가 하나라도 있으면 그 노드를 스택에 넣고 방문 처리 / 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼냅니다.
	 * 더 이상 2번의 과정을 수행할 수 없을 때 까지 반
	 * 1 -> 2 -> 7 -> 6 -> 8 -> 3 -> 4 ->5
	 *
	 * BFS, 너비 우선 탐색, Breadth First Search
	 * 큐 자료구조 이
	 * 가까운 노드부터 우선적으로 탐색하는 알고리즘
	 * 탐색 시작 노드를 큐에 삽입하고 방문처리
	 * 큐에서 노드를 꺼낸 두에 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두********DFS(다시 큐에 넣으면서 방문처리) 큐에 삽입하고 방문처리
	 * 더 이상 2번의 과정을 수행할 수 없을 때 까지 반복
	 * 1 -> 2-> 3 -> 8 -> 7 -> 4 -> 5 -> 6
	 */
	
	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void DFS(int start) {
		visited[start] = true;
		
		for(int i = 0 ; i < graph.get(start).size() ; i++) {
			int k = graph.get(start).get(i);
			if(!visited[k]) {
				DFS(k);
			}
		}
	}
	
	public static void BFS(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		
		visited[start] = true;
		
		while(!q.isEmpty()) {
			
			int index = q.poll();
			
			for(int i = 0 ; i < graph.get(index).size() ; i++) {
				int k = graph.get(index).get(i);
				if(!visited[k]) {
					q.add(k);
					visited[k] = true;
				}
			}
		}
	}	
}
