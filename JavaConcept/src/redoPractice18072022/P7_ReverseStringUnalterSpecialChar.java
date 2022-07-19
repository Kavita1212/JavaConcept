package redoPractice18072022;

public class P7_ReverseStringUnalterSpecialChar {

	public static void main(String[] args) {
		String str = "ab@cde.f";
		char[] ch = str.toCharArray();
		
		int j =ch.length-1;
		int i =0;
		while(i<j) {
			if(!Character.isAlphabetic(ch[i])) {
				i++;
			}
			else if(!Character.isAlphabetic(ch[j])) {
				j--;
			}
			else {
				char ch1 = ch[i];
				ch[i]= ch[j];
				ch[j]=ch1;
				i++;
				j--;
			}
		}
		System.out.println(String.valueOf(ch));

	}

}
