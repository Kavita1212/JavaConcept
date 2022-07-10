package redoPractice;

public class P9_NonDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,2,3,1,2}; 
		int len = a.length;
		P9_NonDuplicateNumber.nonDuplicate(a,len);
		
		

	}
	public static void nonDuplicate(int arr[],int n) {
		
		int count;
		for (int i = 0; i < n; i++) {
			count =1;
			for (int j = i+1; j < n; j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=0;
				}
				
			}
			if(count==1 && arr[i]!=0) {
				System.out.println(arr[i]);
			}
			
		}
		
		
		
	}

}
