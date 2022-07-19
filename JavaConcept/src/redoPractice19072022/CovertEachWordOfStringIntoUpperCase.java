package redoPractice19072022;

public class CovertEachWordOfStringIntoUpperCase {

	public static void main(String[] args) {
		String str = "this is kavita";
		
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(Character.isLowerCase(ch[i])) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
		
	}
		System.out.println(ch);
}
}