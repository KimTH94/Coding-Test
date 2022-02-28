package $05_정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class $02_회의실_배정_1931_실버2 {

	public static class Room {
		int start;
		int end;
		
		Room(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Room[] arr = new Room[N];
		
		for(int i = 0 ; i < N ; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			arr[i] = new Room(start, end);
		}
		
		Arrays.sort(arr, new Comparator<Room>() {
			@Override
			public int compare(Room o1, Room o2) {
				if(o1.end == o2.end) {
					return o1.start - o2.start;
				}
				return o1.end - o2.end;
			}
		});
		
		int end = arr[0].end;
		int count = 1;
		for(int i = 1 ; i < N ; i++) {
			if(arr[i].start >= end) {
				end = arr[i].end;
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
