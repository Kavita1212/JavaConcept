package redoPractice18072022;

public class P19_ReverseEachWord {

	public static void main(String[] args) {
		String s = "This is Kavita"; //sihT si ativaK
		
		String reversedSentence="";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			String word = str[i];
			String reversedWord = "";
			for (int j = word.length()-1; j >=0; j--) {
				reversedWord+=word.charAt(j);				
			}
			reversedSentence = reversedSentence +reversedWord +" ";
		}
		System.out.println(reversedSentence.trim());
	}
}