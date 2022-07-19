package redoPractice19072022;

public class ConvertFirstLetterOfEachWordOfStringIntoUpperCase2 {

	public static void main(String[] args) {
		String str = "java is programming language";
		
		char[] ch =str.toCharArray();
		ch[0]= (char)(ch[0]-32);
		for (int i = 1; i < ch.length; i++) {
			if(ch[i]==' ') {
				ch[i+1]= (char)(ch[i+1]-32);
			}
		}
		System.out.println(String.valueOf(ch));
	}
}