package redoPractice19072022;

public class ConvertUpperCaseStringToLowerCase {

	public static void main(String[] args) {
		String a = "KAVITA";
		char[] ch = a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch[i]=(char)(ch[i]+32);
		}
		System.out.println(String.valueOf(ch));

	}

}
