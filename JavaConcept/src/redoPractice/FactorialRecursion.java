package redoPractice;

public class FactorialRecursion {

	public static int fact(int n ) {
		if(n==0 || n==1) {
			return n ;
		}
		
		return n*fact(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FactorialRecursion.fact(5));

	}

}
