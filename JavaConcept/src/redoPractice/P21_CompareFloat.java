package redoPractice;

public class P21_CompareFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f=48.57f;
		
		String s = String.valueOf(f);
		
		String[] str = s.split("\\.");
		int max=Integer.parseInt(str[0]);
		
		for (int i = 0; i < str.length; i++) {
			if(Integer.parseInt(str[i])>max) {
				max=Integer.parseInt(str[i]);
			}
			
		}
		System.out.println("max==" +max);
	}

}
