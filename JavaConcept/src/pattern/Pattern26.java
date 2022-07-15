package pattern;

public class Pattern26 {

	public static void main(String[] args) {
		int num=6;
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=num-i+1; j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}

	}

}
