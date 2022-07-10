package excpetionExample;

public class FinallyNotExecuted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 8/0;
			System.out.println("Inside try");
			//System.exit(0); //finally will not be executed
			System.exit(-1); //finally will not be executed
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Inside finally");
		}

	}

}
