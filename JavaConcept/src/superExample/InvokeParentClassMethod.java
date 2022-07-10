package superExample;

class Animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		//super.eat();
		bark();
		super.eat();
	}
}

class InvokeParentClassMethod {
	public static void main(String args[]) {
		Dog1 d = new Dog1();
		d.work();
	}
}
