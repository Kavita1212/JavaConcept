package redoPractice19072022;

public class CovertEachWordOfStringIntoUpperCase2 {

	public static void main(String[] args) {
		String str = "this is kavita";
		
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ')
			ch[i]= (char)(ch[i]-32);
			
		}
		System.out.println(ch);
	}
}