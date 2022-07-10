package constructorExample;

class A{
	public  A() {
		System.out.println("Inside A");
	}
}

public class SampleConstructor2 extends A{

	int i;

	/*
	 * public SampleConstructor() { // TODO Auto-generated constructor stub
	 * System.out.println("i==" +i); }
	 */
	
	public SampleConstructor2() {
		// TODO Auto-generated constructor stub
		System.out.println("i==" +i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleConstructor2 s = new SampleConstructor2();
	}

}

