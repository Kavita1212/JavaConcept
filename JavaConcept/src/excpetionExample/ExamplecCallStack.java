package excpetionExample;

public class ExamplecCallStack {

	public void m1() throws Exception{
		m2();
		
	}
	public void m2() throws Exception{
		throw m3();
		
	}
	public Exception m3() throws Exception{
		return new Exception();
		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExamplecCallStack ex = new ExamplecCallStack();
		ex.m1();

	}

}
