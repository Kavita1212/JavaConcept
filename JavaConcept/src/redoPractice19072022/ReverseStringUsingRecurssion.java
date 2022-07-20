package redoPractice19072022;

public class ReverseStringUsingRecurssion {

	public static void main(String[] args) {
		String s="this is how";
		ReverseStringUsingRecurssion.reverseString(s);
	}

	public static void reverseString(String s) {
		if(s==null || s.length()<=1) {
			System.out.println(s);
		}
		else {
			System.out.print(s.charAt(s.length()-1));
			reverseString(s.substring(0,s.length()-1));
		}
	}
}