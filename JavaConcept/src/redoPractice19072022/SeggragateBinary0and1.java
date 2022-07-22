package redoPractice19072022;

import java.util.Arrays;

public class SeggragateBinary0and1 {

	public static void main(String[] args) {
		int[] a  = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};//{0, 0, 0, 0, 0, 1, 1, 1, 1, 1}
	
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]!=0 && a[i+1]==0) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
	}

}
