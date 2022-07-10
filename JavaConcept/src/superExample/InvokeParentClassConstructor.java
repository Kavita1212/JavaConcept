package superExample;

class A{
	A(){
		System.out.println("Inside A");
	}
}
class B extends A{
	B(){
		//super();  --super() is added in each class constructor automatically by compiler if there is no super() or this().
		System.out.println("Inside B");
	}
}

public class InvokeParentClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
	}

}