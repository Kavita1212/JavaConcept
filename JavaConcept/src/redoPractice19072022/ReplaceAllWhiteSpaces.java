package redoPractice19072022;

public class ReplaceAllWhiteSpaces {

	public static void main(String[] args) {
		String s = "how to do in java provides java tutorials";
		s=s.replaceAll(" ", "");
		System.out.println(s);

		/*
		 * char[] ch = s.toCharArray(); StringBuffer sb = new StringBuffer(); for (int i
		 * = 0; i < ch.length; i++) { if (ch[i]!=' ') { sb.append(ch[i]);
		 * 
		 * }
		 * 
		 * } System.out.println(sb);
		 */
	}

}
