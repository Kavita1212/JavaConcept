package redoPractice19072022;

public class CountFive {

	public static int convertFive(int n)
    {
        String num= Integer.toString(n);
        char[] arr= num.toCharArray();
        char temp='5';
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='0')
            {
              arr[i] =temp;
            }
            sb.append(arr[i]);
        }
        return Integer.parseInt(sb.toString());
    }
	
	public static void main(String[] args)
	{
		System.out.println(convertFive(1004));
		System.out.println(convertFive(1210));
		
        
	}
}
