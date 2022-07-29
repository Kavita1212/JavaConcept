package leetcode;

//leetcode.com/problems/defanging-an-ip-address/
public class IpAddress {

	public static void main(String[] args) {
		/*
		 * Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1"
		 */
		String ans = "";
		String s = "1.1.1.1";
		ans = defangIPaddr(s);
		System.out.println(ans);

	}

	public static String defangIPaddr(String address) {
		String temp = "";
		for (int i = 0; i < address.length(); i++) {
			char c = address.charAt(i);
			if (c == '.') {
				temp = temp + "[.]";
			}
			else {
				temp = temp + c;
			}
		}
		return temp;
	}
}