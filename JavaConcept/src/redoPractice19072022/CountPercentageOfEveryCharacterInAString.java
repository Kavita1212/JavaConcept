package redoPractice19072022;

public class CountPercentageOfEveryCharacterInAString {

	public static void main(String[] args) {
		String s ="Tiger Runs @ The Speed Of 100 km/hour.";
		int upperCaseCnt=0;
		int lowerCaseCnt=0;
		int digitCnt=0;
		int OtherCharacterCnt=0;
		
		char[] ch = s.toCharArray();
		int totalCharCount = ch.length;
		for (int i = 0; i < ch.length; i++) {
			if(Character.isLowerCase(ch[i])) {
				lowerCaseCnt++;
			}
			else if(Character.isUpperCase(ch[i])) {
				upperCaseCnt++;
			}
			else if(Character.isDigit(ch[i])) {
				digitCnt++;
			}
			else {
				OtherCharacterCnt++;
			}
		}
		
		
		
		System.out.println("Upper case %:" + (double)(upperCaseCnt*100)/totalCharCount);
		System.out.println("lower case %:" + (double)(lowerCaseCnt*100)/totalCharCount);
		System.out.println("digit %:" + (double)(digitCnt*100)/totalCharCount);
		System.out.println("Other %:" + (double)(OtherCharacterCnt*100)/totalCharCount);

	}

}
