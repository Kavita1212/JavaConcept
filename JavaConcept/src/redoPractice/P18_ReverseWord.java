package redoPractice;

public class P18_ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Bangalore is Capital of Karnataka";

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ' && Character.isLowerCase(ch[i + 1])) {
				ch[i + 1] = Character.toUpperCase(ch[i + 1]);

			}
		}

		String str1 = new String(ch);
		System.out.println(str1);

		String[] a = str1.split(" ");
		for (int i = 0; i < a.length; i++) {
			String rev = a[i].charAt(0) + "";

			for (int j = a[i].length() - 1; j >= 1; j--) {
				rev = rev + a[i].charAt(j);
			}
			rev = rev + " ";
			System.out.print(rev);

		}

	}
}
