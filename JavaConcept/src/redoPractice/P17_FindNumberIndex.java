package redoPractice;

public class P17_FindNumberIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,8,8,9,10};// target - 9,op-4
		
		int n =11;
		int op =P17_FindNumberIndex.findIndex(a,n);
		System.out.println(op);

	}
	@SuppressWarnings("unused")
	public static int findIndex(int a[],int num) {
		int i=0;
		int len =a.length;
		
		if(a==null) {
			return -1;
		}
		
		while(i<len) {
			if(a[i]==num){
				 //break;
				return i;
			 
			}
			else {
			i++;
			}
		}
		return -1;
		
	}

}
