package redoPractice19072022;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		 int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		 arrayRotate(a);
		 System.out.println(Arrays.toString(a));

	}
	public static int[] arrayRotate(int a[]) {
		int len =a.length-1;
		
		int p=1;
		while(p<=2) {
			int last = a[0];
			for (int i = 0; i < len; i++) {
				a[i]=a[i+1];
			}
			a[len]=last;
			p++;
		}
		return a;
		
	}

}