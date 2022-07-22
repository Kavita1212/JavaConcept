package redoPractice19072022;

import java.util.Arrays;

public class MedianOfaNumber {

	public static void main(String[] args) {
		int[] a = {56,67,30,79,1};
		System.out.println(medianofNumber(a));

	}

	public static int medianofNumber(int[] a) {
		//Arrange the data points from smallest to largest
		int start=0;
		int end=a.length-1;
		int result=(start+end)/2;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
		//If the number of data points is even, the median is the average of the two middle data points in the list
		if(a.length%2==0) {
			return (a[result]+a[result+1])/2;
		}
		//If the number of data points is odd, the median is the middle data point in the list
		return a[result];
	}
}