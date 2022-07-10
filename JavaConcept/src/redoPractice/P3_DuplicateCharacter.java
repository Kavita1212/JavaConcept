package redoPractice;

public class P3_DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabccd";
		char a[] = str.toCharArray();
		
		int len =str.length();
		int count;
		for (int i = 0; i < len; i++) {
			count = 1;
			for (int j = i+1; j < len; j++) {
				if(a[i]==a[j]) {
					count++;
				}
				else {
					break;
				}
				i=j;
			}
			if(count>1)
			System.out.println(a[i] + ":" +count);
		}
	}
}