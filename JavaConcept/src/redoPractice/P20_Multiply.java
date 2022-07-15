package redoPractice;

public class P20_Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,3,4};
		for (int i = 0; i < a.length; i++) {
			int mul=1;
			for (int j = 0; j < a.length; j++) {
				if(i==j) {
					continue;
				}
				else {
					mul=mul*a[j];
				}
				
			}
			System.out.println(mul);
			
		}
	}

}
