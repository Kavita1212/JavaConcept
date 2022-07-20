package redoPractice19072022;

public class ReverseEveryWordInString {

	public static void main(String[] args) {
		String s = "Bala is sexy";

		String[] s1 = s.split(" ");
		String rev = "";
		for (int i = 0; i < s1.length; i++) {
			String word = s1[i];
		
			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}
			rev = rev + " ";
		}
		System.out.print(rev.trim());
	}
}