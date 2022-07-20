package redoPractice19072022;

public class ReverseStringButSpecialCharacterLocationNotChanged {

	public static void main(String[] args) {
		String s = "kumar.ajeet@siemens-healthineers.com";
		char[] ch = s.toCharArray();
		int i =0;
		int j = ch.length-1;
		while(i<j) {
			if(!Character.isAlphabetic(ch[i])) {
				i++;
			}
			else if(!Character.isAlphabetic(ch[j])){
				j--;
			}
			else {
				char c = ch[i];
				ch[i]= ch[j];
				ch[j]= c;
				i++;
				j--;
			}
		}
		System.out.println(String.valueOf(ch));
	}
}