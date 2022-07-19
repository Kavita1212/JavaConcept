package redoPractice19072022;

public class CountAndPrintContinuousCharactersInAString {

	public static void main(String[] args) {
		String s="AAAAAIP$$$-3";
		for (int i = 0; i < s.length(); i++) {
			int count=1;
			for (int j = i+1; j <  s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
				else {
					break;
				}
				i=j;
			}
			System.out.println(s.charAt(i) +": "+ count);	
		} 

	}

}
