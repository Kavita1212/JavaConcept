package redoPractice19072022;

public class ConvertFirstLetterOfEachWordOfStringIntoUpperCase {

	public static void main(String[] args) {
		String str = "java is programming language";
		
		char[] ch =str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ' && Character.isLowerCase((ch[i+1]))) {
				ch[i+1]=Character.toUpperCase(ch[i+1]);
			}
			else if(Character.isLowerCase(ch[0])) {
				ch[i]= Character.toUpperCase(ch[i]);
			}
		}
		/*
		 * String str1 = new String(ch); System.out.println(str1);
		 */
		System.out.println(String.valueOf(ch));
	}
}