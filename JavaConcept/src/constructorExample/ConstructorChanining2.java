package constructorExample;

public class ConstructorChanining2 {
	public ConstructorChanining2() {
		// TODO Auto-generated constructor stub
		System.out.println("heelo");
	}
	public ConstructorChanining2(int a) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("a==" +a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChanining2 ch = new ConstructorChanining2(10);

	}

}
