package redoPractice19072022;

public class AddTwoArrayMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2,8},{4,5,6}};
		int[][] arr1= {{2,3,2},{5,4,1}};
		int[][] temp =new int[2][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				temp[i][j]=arr[i][j]+arr1[i][j];
				System.out.println(temp[i][j]+ " ");
			}
			System.out.println();
		}
	}
}