package overloading;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Example1.sum(2, 3));
		System.out.println(Example1.sum(5, 3,2));

	}
	public static int sum(int a ,int b ) {
		return a+b;
	}
	public static int sum(int a ,int b, int c ) {
		return a+b+c;
	}
}