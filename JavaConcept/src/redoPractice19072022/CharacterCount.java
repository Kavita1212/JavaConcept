package redoPractice19072022;

public class CharacterCount {

	public static void main(String[] args) {
		String s = "aabbcccaaa"; // op: a2b2c3a3
		char[] a = s.toCharArray();

		int size = 1;
		for (int i = 0; i < a.length; i++) {
			
			if (i < a.length - 1) {
				if (a[i] == a[i + 1]) {
					size++;
				} else {
					System.out.print(a[i]);
					System.out.print(size);
					size = 1;
				}
			} else {
				System.out.print(a[i]);
				System.out.print(size);
			}
		}
	}
}