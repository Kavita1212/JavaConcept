package overriding;

public class Main {
	public static void main(String[] args) {
		Bank b = new Bank();
		SBI s = new SBI();
		ICICI i = new ICICI();
		System.out.println(b.getRateOfInterest());
		System.out.println(s.getRateOfInterest());
		System.out.println(i.getRateOfInterest());
	}
}
