package pattern;

public class Pattern9 {

	public static void main(String[] args) {
		int num = 5;

		for (int i = num; i >= 1; i--) {
			for (int space = 1; space <= num - i; space++) {
				System.out.print(" ");
			}
			for (int j = 2 * i - 1; j >= i; j--) {
				System.out.print("*");
			}

			for (int j = 0; j < i - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
