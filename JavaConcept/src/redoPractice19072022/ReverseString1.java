package redoPractice19072022;

public class ReverseString1 {

	public static void main(String[] args) {
		String s ="Today is Wed";//op-deWsi ya doT
		char[] a =s.toCharArray();
		int i =0;
		int j =s.length()-1;
		while(i<j) {
			if(!Character.isAlphabetic(a[i])){
				i++;
			}
			else if(!Character.isAlphabetic(a[i])) {
				j--;
			}
			else {
				char temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println(a);

	}

}
