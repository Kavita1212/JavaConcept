package constructorExample;

//Calling parameterized constructor from default constructor
public class ConstructorChanining {
	public ConstructorChanining() {
		// TODO Auto-generated constructor stub
		this(10);
		System.out.println("heelo");
	}
	public ConstructorChanining(int a) {
		// TODO Auto-generated constructor stub
		
		System.out.println("a==" +a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChanining ch = new ConstructorChanining();

	}

}
