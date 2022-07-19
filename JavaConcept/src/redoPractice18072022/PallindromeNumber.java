package redoPractice18072022;

public class PallindromeNumber {

	public static void main(String[] args) {
		int n = 121;
		int op = n;
		int sum=0;
		
		while(n>0) {
			int rem= n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		System.out.println(sum);
		if(op==sum) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
	}

}
