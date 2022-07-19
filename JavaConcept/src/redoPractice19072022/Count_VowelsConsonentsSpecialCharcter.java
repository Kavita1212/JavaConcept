package redoPractice19072022;

public class Count_VowelsConsonentsSpecialCharcter {

	public static void main(String[] args) {
		String s = "ARADHYA'SBRILLIANCE CENTER";
		char[] ch = s.toCharArray();
		int vowel=0;
		int conseonent=0;
		int special=0;
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				if(ch[i]=='A' || ch[i]=='I' ||ch[i]=='E' ||ch[i]=='O' ||ch[i]=='U') {
					vowel++;
				}
				else {
					conseonent++;
				}
			}
			else {
				special++;
			}
		}
		System.out.println("Vowel=" + vowel +"conseonet= "+ conseonent +"special="+special);

	}
}