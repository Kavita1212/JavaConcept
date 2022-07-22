package redoPractice19072022;

public class PrintArrayDiagonal {

	public static void main(String[] args) {
		int n =3;
		int[][] a= {{1,2,3},{5,6,7},{1,2,3}};
		printPrimaryDiagonal(a,n);
		System.out.println("========");
		printSecondaryDiagonal(a,n);

	}

	public static void printPrimaryDiagonal(int[][] a, int n) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i==j) {
					System.out.println(a[i][j]+" ");
				}
			}
		}
	}

	public static void printSecondaryDiagonal(int[][] a, int n) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if((i+j)==(n-1)) {
					System.out.println(a[i][j]+" ");
				}
				
			}
			
		}
		
	}

}
