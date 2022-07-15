package pattern;

public class Pattern7 {

	public static void main(String[] args) {
		int num=5;
		for (int i = 1; i <=num; i++) {
			for (int space = num; space >num-i+1; space--) {
				System.out.print(" ");
			}
			for (int j = num; j >=i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}