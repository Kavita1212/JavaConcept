package redoPractice18072022;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 61;
		System.out.println(isPrime(num));

	}
	public static boolean isPrime(int n) {
		for (int i = 2; i <=n/2; i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}
}
