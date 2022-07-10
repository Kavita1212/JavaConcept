package abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI ic = new ICICI();
		SBI sb = new SBI();
		System.out.println(ic.getRateOfInterest());
		System.out.println(sb.getRateOfInterest());

	}
}