package redoPractice;

public class P23_SwapWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Kavita@Java"; //Java@Kavita
	
		char output_delimiter=P23_SwapWord.findDelimiter(str);
		//System.out.println(output_delimiter);
		
		String op =String.valueOf(output_delimiter);
		System.out.println(op);
		String finalOutput="";
		
		String[] str1 = str.split(op);
		for (int i = 0; i < str1.length-1; i++) {
			System.out.println(str1[i]);
			String a =str1[i];
			String b = str1[i+1];
			System.out.println("before a=="+a);
			System.out.println("before b=="+b);
			a=a+b;
			b=a.substring(0,a.length()-b.length());
			a=a.substring(b.length());
			System.out.println("after a=="+a);
			System.out.println("after b=="+b);
			
			finalOutput =a+op+b;
			System.out.println("=====");
			System.out.println(finalOutput);
			
		}
		
		
		
	}
	public static char findDelimiter(String delimitCharacter) {
		
		char ch = 0;
		for (int i = 0; i < delimitCharacter.length(); i++) {
			if(!Character.isAlphabetic(delimitCharacter.charAt(i))) {
				ch=delimitCharacter.charAt(i);
				
			}
	}
		return ch;
	}
}
