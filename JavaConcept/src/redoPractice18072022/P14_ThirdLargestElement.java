package redoPractice18072022;

public class P14_ThirdLargestElement {

	public static void main(String[] args) {
		int[] a = {3,6,10,2};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]= temp;
				}
				
			}
			//System.out.println(a[i]);
		}
		System.out.println(a[a.length-3]);

	}

}
