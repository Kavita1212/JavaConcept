package redoPractice19072022;

public class PrintPrime0To100 {

	public static void main(String[] args) {
	printPrime(100);

	}
	public static void printPrime(int num) {
		
		for (int i = 0; i <=num; i++) {
			if(isPrime(i)== true) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for (int i = 2; i <=n/2; i++) {
			if(n%2==0) {
				return false;
			}
			
		}
		return true;
		
	}

}
