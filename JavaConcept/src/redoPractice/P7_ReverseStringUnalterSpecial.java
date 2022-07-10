package redoPractice;

public class P7_ReverseStringUnalterSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ab@cde.f";
		char a[] =str.toCharArray();
		
		int i =0;
		int j =str.length()-1;
		
		while(i<j) {
			if(!Character.isAlphabetic(a[i])) {
				i++;
			}
			else if (!Character.isAlphabetic(a[j])){
				j--;
			}
			else {
				char temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
	System.out.println(String.valueOf(a));
	}

}
