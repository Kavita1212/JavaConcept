package redoPractice19072022;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		String s ="ajeetgt";
		
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j] +" :is duplicate");
				}
				
			} 
			
			
		}

	}

}
