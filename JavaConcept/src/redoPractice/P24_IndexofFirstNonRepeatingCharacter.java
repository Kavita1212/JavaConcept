package redoPractice;

public class P24_IndexofFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		for (char i : s.toCharArray()) {
			if (s.indexOf(i) == s.lastIndexOf(i)) {
				System.out.println(i);
				System.out.println(s.indexOf(i));
				break;

			}
		}

	}

}
