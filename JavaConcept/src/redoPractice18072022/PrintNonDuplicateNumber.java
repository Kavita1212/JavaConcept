package redoPractice18072022;

import java.util.Arrays;

public class PrintNonDuplicateNumber {

	public static void main(String[] args) {
		int[] a = {1,1,2,1,3,1,2,4,2,6,7};
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
				else {
					break;
				}
				i=j;
			}
			if(count==1) {
				System.out.print(a[i]);
			}
		}
	}
}