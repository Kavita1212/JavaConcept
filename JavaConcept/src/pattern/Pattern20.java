package pattern;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int n=4;
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1 || j==1 || i==num || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
