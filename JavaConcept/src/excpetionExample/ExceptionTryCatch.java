package excpetionExample;

public class ExceptionTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int a = 9 / 0;
		}catch(Exception e) {
			e.printStackTrace();
		}
		/*catch (ArithmeticException e) {
			e.printStackTrace();
		}*/

	}

}
