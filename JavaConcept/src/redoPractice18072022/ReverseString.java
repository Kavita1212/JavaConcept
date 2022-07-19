package redoPractice18072022;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Bangalore";
		String temp="";
		char[] ch = str.toCharArray();
		for (int i = ch.length-1; i >=0 ;i--) {
			temp = temp +str.charAt(i);
		}
		System.out.println(temp);
	}
}