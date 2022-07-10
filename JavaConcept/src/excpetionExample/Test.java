package excpetionExample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a= 7/0;
			System.out.println("check try");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		

	}

}
