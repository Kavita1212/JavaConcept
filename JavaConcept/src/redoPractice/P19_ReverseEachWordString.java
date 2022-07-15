package redoPractice;

public class P19_ReverseEachWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "This is Kavita";//sihT si ativaK
		
		String[] str = s.split(" ");
		//String reverseWord = "";
		String reverseSentence = "";
		
		for (int i = 0; i < str.length; i++) {
			String word = str[i];
			String reverseWord = "";
			for (int j = word.length()-1; j >=0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseSentence = reverseSentence +reverseWord+" ";
			
			
		}
		System.out.println(reverseSentence);
	}

}
