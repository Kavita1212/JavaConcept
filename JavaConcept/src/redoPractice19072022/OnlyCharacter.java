package redoPractice19072022;

public class OnlyCharacter {

	public static void main(String[] args) {
		String s = "all2habaa2d";
		
		char[] a =s.toCharArray();
		String op="";
		
		for (int i = 0; i < a.length; i++) {
			if(Character.isAlphabetic(a[i])) {
				op=op+a[i];
			}
		}
		System.out.println(op);
	}
}