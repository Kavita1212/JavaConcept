package pattern;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int m= 5;
	        for(int i=1;i<=m;i++)
	        {
	            for(int j=1;j<i;j++)
	            {
	                System.out.print(" ");
	            }

	            for(int k=1;k<=m-i+1;k++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();

	        }
	        for(int i=1;i<=m;i++)
	        {
	            for(int j=1;j<=m-i;j++)
	            {
	                System.out.print(" ");
	            }

	            for(int k=1;k<=i;k++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();

	        }

	}

}
