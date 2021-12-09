package $99_자바;


class Test implements Comparable<Test> {
	String name;
	int    score;
	
	Test(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public int compareTo(Test t) {
		if(t.score < score) {
			return 1;
		} else if(t.score > score) {
			
		}
		return 0;
	}
}
public class $03_01_ArrayList_Sort_Comparable {

	public static void main(String[] args) {
		
	}
}
