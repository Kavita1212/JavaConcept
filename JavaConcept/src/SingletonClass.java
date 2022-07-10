
public class SingletonClass {

	
	private static SingletonClass sing;
	
	private SingletonClass() {
		System.out.println("s1");
		
	}
	public static SingletonClass getSignInstance() {
		if(sing==null) {
			sing = new SingletonClass();
		}
		return sing;
	}
	
	public static void main(String[] args) {
		
		SingletonClass s1 = SingletonClass.getSignInstance();
		SingletonClass s2 = SingletonClass.getSignInstance();
	}
}