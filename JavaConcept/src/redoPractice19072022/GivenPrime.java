package redoPractice19072022;

public class GivenPrime {

	public static void main(String[] args) {
		System.out.println(isPrime(501));

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
