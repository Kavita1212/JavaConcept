package redoPractice19072022;

public class Factorial {
	static int fact=1;
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	public static int fact(int num) {
		
		if(num<=1) {
			return 1;
		}
		else {
			fact=fact*num;
			fact(num-1);
		}
		return fact;
	}
	

}
