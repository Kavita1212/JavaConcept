package redoPractice18072022;

public class P15_SumOfNumberWithin {

	public static void main(String[] args) {
		int[] a = {32,4,21,45,1};
		
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			int num =a[i];
			while(num>0) {
				int remainder = num%10;
				sum=sum+remainder;
				num=num/10;
			}
			System.out.println(sum);
		}
	}
}