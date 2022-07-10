package excpetionExample;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalizeExample obj = new FinalizeExample();
		// printing the hashcode
		System.out.println("Hashcode is: " + obj.hashCode());
		obj = null;
		// calling the garbage collector using gc()
		System.gc();
		System.out.println("End of the garbage collection");
	}

	protected // defining the finalize method
	 void finalize() {
		System.out.println("Called the finalize() method");
	}

}
