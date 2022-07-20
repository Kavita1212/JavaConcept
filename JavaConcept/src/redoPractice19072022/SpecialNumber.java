package redoPractice19072022;

public class SpecialNumber {

	public static void main(String[] args) {
		int num=79;
		int sum=0;
		int sum1=1;
		while(num>0) {
			int r = num%10;
			sum=sum+r;
			sum1=sum1*r;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum+sum1);
	}
}