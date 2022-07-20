package redoPractice19072022;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Selenium";
		int len = s.length();
		System.out.println(len);
		
		String op = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			op += s.charAt(i);
		}
		System.out.println(op);
	}
}