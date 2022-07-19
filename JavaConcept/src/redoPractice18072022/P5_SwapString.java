package redoPractice18072022;

public class P5_SwapString {

	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
		
		a=a+b; //abcdef
		b=a.substring(0, a.length()-b.length()); // 0,6-3 : 0:3 : abc
		a=a.substring(b.length()); //abcdef :3 :def
		System.out.println("a=="+a +" : "+"b==" +b);
				

	}

}
