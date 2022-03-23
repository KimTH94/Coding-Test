package $02_정렬;

import java.util.*;

public class $01_국영수_10825_실버4 {

	public static class Student implements Comparable<Student> {
		String name;
		int korean;
		int english;
		int math;
		
		Student(String name, int korean, int english, int math) {
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
		}

		@Override
		public int compareTo(Student o) {
			
			if(this.korean > o.korean) {
				return -1;
			} else if(this.korean == o.korean) {
				if(this.english > o.english) {
					return 1;
				} else if(this.english == o.english) {
					if(this.math > o.math) {
						return -1;
					} else if(this.math == o.math) {
						return this.name.compareTo(o.name);
					} else {
						return 1;
					}
				} else {
					return -1;
				}
			}else {
				return 1;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		Student[] studentArr = new Student[N];
		
		for(int i = 0 ; i < N ; i++ ) {
			String[] s = sc.nextLine().split(" ");
			studentArr[i] = new Student(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
		}
		
		Arrays.sort(studentArr);
		
		for(int i = 0 ; i < N ; i++ ) {
			System.out.println(studentArr[i].name);
		}
		
		sc.close();
	}
}
