package redoPractice18072022;

public class P20_MultiplyElementExceptSameIndex {

	public static void main(String[] args) {
		int[] a = {2,3,4};
		
		for (int i = 0; i < a.length; i++) {
			int prod=1;
			for (int j = 0; j < a.length; j++) {
				if(i==j)
					continue;
				else {
					prod=prod*a[j];
				}
			}
			System.out.println(prod);
		}
	}
}