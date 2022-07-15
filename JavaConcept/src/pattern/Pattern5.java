package pattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
