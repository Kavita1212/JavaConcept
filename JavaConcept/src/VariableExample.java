
public class VariableExample {
	int a = 5; //Instance variable
	static int b = 10; //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int c= 2; //local variable
		VariableExample var = new VariableExample();
		
		System.out.println("Instance Variable="+ var.a);
		System.out.println("Static Variable="+ VariableExample.b);
		System.out.println("Local Variable="+c);

	}

}
