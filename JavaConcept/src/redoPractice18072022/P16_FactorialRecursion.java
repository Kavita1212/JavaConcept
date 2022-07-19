package redoPractice18072022;

public class P16_FactorialRecursion {

	public static void main(String[] args) {
		System.out.println(fact(5));

	}
	public static int fact(int num) {
		if(num==0 || num==1) {
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}
}
