package overriding;

class D{
	public void run() {
		System.out.println("D");
	}
	
}
public class Example11 extends D {

	public void run() {
		System.out.println("Exapmle11");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//D d = new Example11();
		Example11 d = (Example11) new D();
		d.run();

	}

}
