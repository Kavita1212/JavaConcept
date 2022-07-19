package redoPractice18072022;

public class P24_IndexofFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		for (char i : s.toCharArray()) {
			if(s.indexOf(i)==s.lastIndexOf(i)) {
				System.out.println(s.indexOf(i));
				System.out.println(i);
				break;
			}
			
		}

	}

}	