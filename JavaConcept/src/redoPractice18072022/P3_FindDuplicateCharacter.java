package redoPractice18072022;

public class P3_FindDuplicateCharacter {

	public static void main(String[] args) {
		String str ="aaabccd";
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
				else {
					break;
				}
				i=j;
			}
			if(count>1)
			System.out.println(ch[i] + "==" + count);
		}
	}
}