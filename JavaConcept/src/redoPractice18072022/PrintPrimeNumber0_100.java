package redoPractice18072022;

public class PrintPrimeNumber0_100 {

	public static void main(String[] args) {
		printPrimeNumber(100);
	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for (int i = 2; i <=num/2; i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}
	public static void printPrimeNumber(int num) {
		for (int i = 0; i <= num; i++) {
			if(isPrime(i)==true) {
				System.out.println(i);
			}
		}
	}
}