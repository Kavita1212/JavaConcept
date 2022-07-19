package redoPractice18072022;

public class P21_PrintMaxFloat {

	public static void main(String[] args) {
		float f=48.57f;
		String s = String.valueOf(f);
		String[] str = s.split("\\.");
		
		int max= Integer.parseInt(str[0]);
		for (int i = 0; i < str.length; i++) {
			if(Integer.parseInt(str[i])>max) {
				max= Integer.parseInt(str[i]);
			}
		}
		System.out.println(max);
	}
}