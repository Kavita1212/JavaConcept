package overriding;

class A {
	A get() {
		return this;

	}
}

public class Covariant extends A {
	@Override
	Covariant get() {
		return this;
	}

	void message() {
		System.out.println("covraint");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Covariant().get().message();
	}

}
