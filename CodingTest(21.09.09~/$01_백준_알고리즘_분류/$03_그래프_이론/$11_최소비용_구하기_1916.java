package $03_그래프_이론;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class $11_최소비용_구하기_1916 {
	public static int N;
	public static int M;
	public static ArrayList<ArrayList<Node>> list;
	public static int[] dist;
	public static boolean[] check;
	
	public static class Node implements Comparable<Node> {
		int end;
		int weight;
		
		Node(int end , int weight) {
			this.end = end;
			this.weight = weight;
		}
		
		@Override
		public int compareTo(Node n) {
			return weight - n.weight;
		}
	}
	
	public static int dijkstra(int start, int end) {
		
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.offer(new Node(start, 0));
		dist[start] = 0;
		
		while(!q.isEmpty()) {
			Node n = q.poll();
			int c = n.end;
			int w = n.weight;
			
			if(dist[c] < w) {
				continue;
			}
			
            for(Node node : list.get(c)) {
				if(dist[node.end] > w + node.weight) {
					dist[node.end] = w + node.weight;
					q.offer(new Node(node.end, dist[node.end]));
				}
			}
		}
		
		return dist[end];
	}
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();	// 도시의 개수
		M = sc.nextInt();	// 버스의 개수
		
		list = new ArrayList<ArrayList<Node>>();
		dist = new int[N + 1];
		check = new boolean[N + 1];
		
		Arrays.fill(dist, 1000000000);
		
		for(int i = 0 ; i < N + 1 ; i++) {
			list.add(new ArrayList<Node>());
		}
		
		for(int i = 0 ; i < M; i++) {
			
			int start = sc.nextInt();
			int end = sc.nextInt();
			int weight = sc.nextInt();
			
			list.get(start).add(new Node(end, weight));
		}

		int startPoint = sc.nextInt();
		int endPoint = sc.nextInt();
		
		System.out.println(dijkstra(startPoint, endPoint));
		
		sc.close();
		
	}
	
}
