package redoPractice18072022;

public class P13_PrintRepeatedCharacter {

	public static void main(String[] args) {
		String str = "Great Responsibilty";
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int count =1;
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			if(count>1 && ch[i]!='\0') {
				System.out.println(ch[i] + " : "+count);
			}
		}
	}
}