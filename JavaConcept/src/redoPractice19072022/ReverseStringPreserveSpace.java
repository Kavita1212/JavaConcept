package redoPractice19072022;

public class ReverseStringPreserveSpace {

	public static void main(String[] args) {
		String s = "Today is Wed";// op-deWsi ya doT
		preserveSpace(s);
	}

	public static void preserveSpace(String str) {
		int len = str.length();
		// Initialize two pointers as two corners
		int start = 0;
		int end = len - 1;

		char[] a = str.toCharArray();
		// Move both pointers toward each other
		while (start < end) {
			// If character at start or end
			// is space, ignore it
			if (a[start] == ' ') {
				start++;
				continue;
			} else if (a[end] == ' ') {
				end--;
				continue;
			}
			// If both are not spaces, do swap
			else {
				char temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
		}
		System.out.println(String.valueOf(a));
	}
}