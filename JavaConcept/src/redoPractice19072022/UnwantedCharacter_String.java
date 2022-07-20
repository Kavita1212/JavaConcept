package redoPractice19072022;

public class UnwantedCharacter_String {

	public static void main(String[] args) {
		String s ="!@#$%^&*123456abscfAdd)(*";
		/*
		 * s=s.replaceAll("[^a-zA-Z0-9]", ""); System.out.println(s);
		 */
		char[] ch = s.toCharArray();
		StringBuffer sb= new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a'&& ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' ||ch[i]>='0' && ch[i]<='9') {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);
	}
}