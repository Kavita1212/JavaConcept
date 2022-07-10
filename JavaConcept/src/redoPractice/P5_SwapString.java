package redoPractice;

public class P5_SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abc"; //3
		String b ="defg"; //4
		
		a=a+b; //abcdefg -7
		b=a.substring(0, a.length()-b.length()); //abc -3
		a=a.substring(b.length());
		System.out.println("a==" +a + " b==" +b);
		
	}

}
