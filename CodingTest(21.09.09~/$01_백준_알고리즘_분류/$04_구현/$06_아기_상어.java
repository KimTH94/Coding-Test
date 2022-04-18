package $04_구현;

import java.util.*;

public class $06_아기_상어 {
	
	static class Fish {
		int x;
		int y;
		int size;
		
		Fish(int x, int y, int size) {
			this.x = x;
			this.y = y;
			this.size = size;
		}
	}

	static int N;
	static Fish babyShark;	// 아기 상어 위치
	static ArrayList<Fish> fishList = new ArrayList<Fish>();
	
	static int[][] map;
	static int[][] dist;
	
	static final int[] dx = {0, 0, -1, 1};
	static final int[] dy = {-1, 1, 0, 0};
	
	static int tempBabySharkSize = 0;
	static int count = 0;
	
	
	static int BFS(Fish start, Fish end) {
		dist = new int[N][N];
		Queue<Fish> q = new LinkedList<Fish>();
		q.add(start);
		
		while(!q.isEmpty()) {
			Fish f = q.poll();
			
			int x = f.x;
			int y = f.y ;
			
			for(int i = 0 ; i < dx.length; i++) {
				int nx = dx[i] + x;
				int ny = dy[i] + y;
				
				if(0 <= nx && nx < N && 0 <= ny && ny < N) {
					if(babyShark.size >= map[nx][ny]) {
						dist[nx][ny] = dist[x][y] + 1;
						q.add(new Fish(nx, ny, map[nx][ny]));
						
						if(end.x == nx && end.y == ny) {
							return dist[nx][ny];
						}
					}
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		sc.nextLine();
		
		map = new int[N][N];
		
		
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				int value = sc.nextInt();
				map[i][j] = value;
				
				if(9 == value) {	// 아기 상어 위치 저장
					babyShark = new Fish(i, j, 2);
				} else if(0 != value) {
					fishList.add(new Fish(i, j, value));
				}
			}
		}
		

		
		while(isContinue()) {
			
			
			
			int min = Integer.MAX_VALUE;
			Fish shortFishPosition = new Fish(0, 0, -2);
			int index = -1;
			for(int i = 0 ; i < fishList.size() ; i++) {
				Fish fish = fishList.get(i);

				// 거리가 가까운 물고기가 많다면, 가장 위에 있는 물고기, 그러한 물고기가 여러마리라면, 가장 왼쪽에 있는 물고기를 먹는다.
				if(babyShark.size > fish.size) {
					
					int dist = getDistance(babyShark, fish);
					//System.out.println(fish.x + " / " + fish.y + " ==> " + dist);
					if(min > dist) {
						min = dist;
						shortFishPosition = fish;
						index = i;
					} else if(min == dist) {
						if(shortFishPosition.x > fish.x) {
							shortFishPosition = fish;
							index = i;
						} else if(shortFishPosition.x == fish.x) {
							if(shortFishPosition.y > fish.y) {
								shortFishPosition = fish;
								index = i;
							}
						}
					}
				}

			}
			
			if(index != -1) {
				fishList.remove(index);
				
				count += BFS(babyShark, shortFishPosition);
				
				System.out.println(shortFishPosition.x + " / " + shortFishPosition.y + " ==> " +count + " / babySharkSize : " + babyShark.size);
				
				babyShark.x = shortFishPosition.x;
				babyShark.y = shortFishPosition.y;
				
				tempBabySharkSize++;
				
				if(babyShark.size == tempBabySharkSize) {
					babyShark.size++;
					tempBabySharkSize = 0;
				}
				
			}
			
			
		}
		

		System.out.println(count);
		
	}
	
	static void printList() {
		
		for(int i = 0 ; i < fishList.size() ; i++) {
			Fish fish = fishList.get(i);
			int x = fish.x;
			int y = fish.y;
			int size = fish.size;
			
			System.out.println(i + "====> " + x + " / " + y + " ==> size : " + size);
		}
		System.out.println("===== printFishList =====");
		
	}
	
	static boolean isContinue() {
		for(int i = 0 ; i < fishList.size() ; i++) {
			Fish fish = fishList.get(i);
			if(fish.size < babyShark.size) {	// 아기 상어가 더 클 경우 이동 가능
				return true;
			}
		}
		return false;
	}
	
	static int getDistance(Fish f1, Fish f2) {	// 두 점 사이 거리 구하기
		return BFS(f1, f2);
	}
	
	static void printMap(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===== printMap =====");
	}

	/*
4
4 3 2 1
0 0 0 0
0 0 9 0
1 2 3 4

4
6 6 6 6
0 0 0 0
0 0 9 0
6 6 6 6
	 */
}
