package pattern;

public class Pattern81 {

	public static void main(String[] args) {
		int num=5;
		for (int i =1 ; i <=num; i++) {
			for (int space = 1; space <=num-i; space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i =1 ; i <=num; i++) {
			for (int space = 1; space <i; space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*(num-i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
