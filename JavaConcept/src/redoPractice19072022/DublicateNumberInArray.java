package redoPractice19072022;

public class DublicateNumberInArray {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,2,3,5};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j] + " "+"is duplicate" );
				}
				
			}
			
		}

	}

}
