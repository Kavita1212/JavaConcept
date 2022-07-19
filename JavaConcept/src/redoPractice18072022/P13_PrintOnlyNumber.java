package redoPractice18072022;

public class P13_PrintOnlyNumber {

	public static void main(String[] args) {
		String s = "1589rrttt677";
		char[] ch = s.toCharArray();
		String temp="";
		for (int i = 0; i < ch.length; i++) {
			if(!Character.isAlphabetic(ch[i])) {
				temp=temp+ch[i];
			}
		}
		System.out.println(temp);
	}
}