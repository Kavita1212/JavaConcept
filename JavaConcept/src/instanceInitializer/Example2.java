package instanceInitializer;

class A11{
	A11(){
		System.out.println("Parent class constructor");
	}
	
}
public class Example2 extends A11{
	
	public Example2() {
		// TODO Auto-generated constructor stub
		//super();
		System.out.println("child class constructor");
	}
	
	{System.out.println("Instance Intializer block");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 ex = new Example2();

	}

}
