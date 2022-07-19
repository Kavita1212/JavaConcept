package redoPractice19072022;

public class Panagram {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		
		System.out.println(isPanagram(str));
	}
	public static boolean isPanagram(String str) {
		str= str.toLowerCase();
		for (char ch ='a';ch<='z';ch++) {
			if(!str.contains(String.valueOf(ch))) {
				return false;
			}
		}
		return true;
	}
}
