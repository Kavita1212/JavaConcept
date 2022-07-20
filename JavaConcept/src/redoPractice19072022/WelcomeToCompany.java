package redoPractice19072022;

public class WelcomeToCompany {

	public static String expword(String s)
	{
		char[] ch =s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z' ||ch[i]>='A' && ch[i]<='Z'||ch[i]==' ')
			{
				if(ch[i]==' ') {
					ch[i+1]=(char)(ch[i+1]-32);
				}
				sb.append(ch[i]);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) 
	{
		String s ="Welcome to {Company}";
		System.out.println(expword(s));
	}
}