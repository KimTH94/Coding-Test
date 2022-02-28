package $04_구현;

import java.util.*;

public class $01_프린터_큐_1966_실버3 {
	
	public static class Print {
		int index;
		int importance;

		Print(int index, int importance) {
			this.index = index;
			this.importance = importance;
		}
	}
	
	public static boolean isSort(ArrayList<Print> list, int index) {
		boolean result = true;
		
		if(list.size() > 0) {
			Print p = list.get(index);
			for(int i = index ; i < list.size() ; i++) {
				if(p.importance < list.get(i).importance) {
					result = false;
					break;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();	// 테스트 케이스 개수
		for(int i = 0 ; i < T ; i++) {
			int N = sc.nextInt();	// 문서의 개수
			int M = sc.nextInt();	// Queue 저장 순서
			sc.nextLine();
			
			ArrayList<Print> list = new ArrayList<Print>();
			for(int j = 0 ; j < N ; j++) {
				Print p = new Print(j, sc.nextInt());
				list.add(p);
			}
			
			
			for(int j = 0 ; j < list.size() ; j++) {
				while(!isSort(list, j)) {
					Print temp = list.get(j);
					list.remove(j);
					list.add(temp);
				}
			}

			for(int j = 0 ; j < list.size() ; j++ ) {
				if(list.get(j).index == M) {
					System.out.println((j + 1));
				}
			}
		}
		
		sc.close();
	}
}
