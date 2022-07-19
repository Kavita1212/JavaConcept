package redoPractice18072022;

public class P31_CountNumberAlphaSpecial {

	public static void main(String[] args) {
		String s = "Ja@va123";
		
		char[] ch = s.toCharArray();
		int alpha = 0;
		int number = 0;
		int special = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if(Character.isAlphabetic(ch[i])) {
				alpha++;
			}
			else if(Character.isDigit(ch[i])) {
				number++;
			}
			else {
				special++;
			}
		}
		System.out.println("alpha="+alpha +" :number="+number + ": special="+ special);

	}

}
