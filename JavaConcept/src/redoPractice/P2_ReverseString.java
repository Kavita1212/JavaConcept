package redoPractice;

public class P2_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Bangalore";
		String revStr="";
		for (int i = str.length()-1; i >=0; i--) {
			revStr +=str.charAt(i);
		}
		System.out.println("Reverse String==" +revStr);
	}

}
