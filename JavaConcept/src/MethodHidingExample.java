class Demo{
	public static void a() {
		System.out.println("a");
		
	}
}
public class MethodHidingExample extends Demo {
public static void a() {
	System.out.println("Inside subclass a");
		
	}
public static void main(String[] args) {
	Demo m = new  MethodHidingExample();
	m.a();
	
}

}
