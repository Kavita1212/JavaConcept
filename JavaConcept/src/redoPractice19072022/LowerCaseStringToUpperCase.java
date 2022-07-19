package redoPractice19072022;

public class LowerCaseStringToUpperCase {

	public static void main(String[] args) {
		String s="ajeet";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)(ch[i]-32);
		}
		System.out.println(ch);
	}

}
