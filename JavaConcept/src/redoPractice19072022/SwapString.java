package redoPractice19072022;

public class SwapString {
	public static void main(String[] args) {
		String a="hi";
		String b ="bye";
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("a==" +a +" : "+ "b=="+ b);
	}
}