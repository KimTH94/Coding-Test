package $99_자바;

public class $01_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Default String");
		System.out.println("sb : " + sb);											// sb : Default String
		System.out.println("sb.toString() : " + sb.toString());						// sb.toString() : Default String
		System.out.println("sb.length() : " + sb.length());							// sb.length() : 14
		System.out.println("sb.capacity() : " + sb.capacity());						// sb.capacity() : 30
		System.out.println("sb.append(\"!\") : " + sb.append("! "));				// sb.append("!") : Default String!
		System.out.println("sb.append(\" \") : " + sb.append(" "));					// sb.append(" ") : Default String!
		System.out.println("sb.append(\"true\") : " + sb.append(true));				// sb.append("true") : Default String!  true
		System.out.println("sb.reverse() : " + sb.reverse());						// sb.reverse() : eurt  !gnirtS tluafeD
		
		sb = new StringBuilder("123456");
		System.out.println("sb : " + sb);											// sb : 123456
		System.out.println("sb.replace(0, 1, \"A\") : " + sb.replace(0, 1, "A"));	// sb.replace(0, 1, "A") : A23456
		sb.setCharAt(0, '*');
		System.out.println("sb.setCharAt(0, \"*\") : " + sb);						// sb.setCharAt(0, "*") : *23456
		System.out.println("sb.substring(0, 2) : " + sb.substring(0, 2));			// sb.substring(0, 2) : *2
	}
}
