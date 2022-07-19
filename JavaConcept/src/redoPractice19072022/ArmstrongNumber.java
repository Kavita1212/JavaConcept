package redoPractice19072022;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int sum = 0;
		int output=num;
		while(num>0) {
			int rem = num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(output==sum) {
		System.out.println("true");
	}
		else {
			System.out.println("false");
		}
		
	}
}
