package redoPractice18072022;

public class P22_ReverseNumber {

	public static void main(String[] args) {
		int num = 2345;
		int sum=0;
		while(num>0) {
			int remainder = num%10;
			sum=sum*10+remainder;
			num=num/10;
		}
		System.out.println(sum);

	}

}
