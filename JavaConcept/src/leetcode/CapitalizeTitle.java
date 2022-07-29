package leetcode;
//https://leetcode.com/problems/capitalize-the-title/
public class CapitalizeTitle {

	public static void main(String[] args) {
		/*
		 * Input: title = "capiTalIze tHe titLe" Output: "Capitalize The Title"
		 */
		String Title="capiTalIze tHe titLe";
	
		String ans="";
		String[] s=Title.split(" ");
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()<=2) {
				ans=ans+s[i].toLowerCase()+" ";
			}else {
				ans=ans+s[i].toUpperCase().charAt(0)+s[i].toLowerCase().substring(1)+" ";
			}
		}
		System.out.println(ans.trim());
	}
}