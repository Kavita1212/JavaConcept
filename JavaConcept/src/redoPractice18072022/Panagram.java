package redoPractice18072022;

public class Panagram {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		boolean op = isPanagram(s);
		System.out.println(op);
	}

	public static boolean isPanagram(String s1) {
		s1=s1.toLowerCase();
		
		for (char ch = 'a'; ch<='z'; ch++) {
			 //System.out.println(String.valueOf(ch));
			if(!s1.contains(String.valueOf(ch))) {
				return false;
			}
		}
		return true;
	}
}
