package redoPractice19072022;

public class PallindromeString {

	public static void main(String[] args) {
		String s = "madam";
		String temp="";
		for (int i = s.length()-1; i >=0; i--) {
			temp=temp+s.charAt(i);
		}
		if(temp.equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not pallindrome");
		}
	}

}
