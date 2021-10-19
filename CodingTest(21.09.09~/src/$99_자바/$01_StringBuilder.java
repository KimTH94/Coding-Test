package $99_자바;

public class $01_StringBuilder {
	
		/*
		int length() 문자열의 길이를 리턴한다.
		int capacity()	스트링 버퍼에 저장될 수 있는 문자의 개수인 용량을 얻는다.
		StringBuffer append(String str) 문자열에 str을 더한다.
		StringBuffer insert(int offset, String str) 주어진 위치에 문자열을 삽입한다.
		StringBuffer reverse()	문자열을 거꾸로 만든다.
		StringBuffer replace(int start, int end, String str) 주어진 위치에 문자열을 주어진 문자열로 대체한다.
		void setCharAt(int index, char ch)	주어진 인덱스에 있는 문자를 주어진 문자로 바꾼다.
		String substring(int beginIndex, int endIndex)	원래 문자열에서 beginIndex에서 endIndex까지의 내용으로된 문자열을 리턴
		String toString()	StringBuffer를 String으로 변환한다.
	 	*/
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Default String");
		System.out.println("sb : " + sb);
		System.out.println("sb.toString() : " + sb.toString());
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("sb.append(\"!\") : " + sb.append("! "));
		System.out.println("sb.append(\" \") : " + sb.append(" "));
		System.out.println("sb.append(\"true\") : " + sb.append(true));
		System.out.println("sb.reverse() : " + sb.reverse());
		
		sb = new StringBuilder("123456");
		System.out.println("sb : " + sb);
		System.out.println("sb.replace(0, 1, \"A\") : " + sb.replace(0, 1, "A"));
		sb.setCharAt(0, '*');
		System.out.println("sb.setCharAt(0, \"*\") : " + sb);
		System.out.println("sb.setCharAt(0, \"*\") : " + sb.substring(0, 2));
	}
}
