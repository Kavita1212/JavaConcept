package redoPractice;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brow fox jumps over the lazy dog";
		
		str= str.toLowerCase();
		
		boolean allLetterPresent = true;
		
		for (char c = 'a';  c<= 'z'; c++) {
			//System.out.println(String.valueOf(c));
			if(!str.contains(String.valueOf(c))) {
				allLetterPresent = false;
			}
			
		}
		if(allLetterPresent) {
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}

	}

}
