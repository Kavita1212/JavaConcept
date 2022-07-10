package instanceInitializer;


public class A {
	int speed;
	A(){
		System.out.println("speed=="+ speed);
	}
	{speed =100;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
	}

}
