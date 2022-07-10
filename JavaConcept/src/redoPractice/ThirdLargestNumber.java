package redoPractice;

import java.util.Arrays;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,6,10,2};
		int len= a.length;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {  //sort in ascending order
					int temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("a=="+ a[len-3]);

	}

}
