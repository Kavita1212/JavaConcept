package redoPractice18072022;

public class P30_CountSmallCapitalLetter {

	public static void main(String[] args) {
		String s = "Java";
		
		char[] ch = s.toCharArray();
		int upperCase = 0;
		int lowerCase = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				lowerCase++;;
			}
			else if(ch[i]>='A' && ch[i]<='Z')
				upperCase++;
		
		else {
			System.out.println("Not an alphabet");
		}
		}
		System.out.println("lower="+lowerCase +" :upper="+upperCase);

	}

}
