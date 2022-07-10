package redoPractice;

public class P13_PrintOnlyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1589rrttt677";
		char[] a = s.toCharArray();
		String temp = "";
		
		for (int i = 0; i < a.length; i++) {
			//if(a[i]>'a' && a[i]<'z' || a[i]>'A' && a[i]<'Z') {
			if(a[i]>'0' && a[i]<='9') {
				temp = temp+a[i];
			
			}
		}
		System.out.println(temp);

	}

}
