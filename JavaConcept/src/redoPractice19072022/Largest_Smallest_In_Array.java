package redoPractice19072022;

public class Largest_Smallest_In_Array {

	public static void main(String[] args) {
		int[] arr = {1,2,3,48,6,8};
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else if(arr[i]<smallest)
				smallest=arr[i];
		}
		System.out.println("Largest No=" + largest +" : " + "Smallest No="+ smallest);
	}

}
