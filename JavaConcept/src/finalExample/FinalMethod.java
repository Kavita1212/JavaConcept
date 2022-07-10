package finalExample;

class B1{
	//final void run() {
	 void run() {
	 }
}
	
		
	
public class FinalMethod extends B1{
	
	void run() {
		System.out.println("FinalMethod");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FinalMethod f = new FinalMethod();
		f.run();

	}

}
