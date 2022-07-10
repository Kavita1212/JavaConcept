package operator;

public class ShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10<<2); //Left shift multiply by 2
		System.out.println(10>>2); //right shift divide by2
		System.out.println(20>>2);
		System.out.println(20>>>2); //for +ve no,>> and >>> works same
		System.out.println(-20>>2);
		System.out.println(-20>>>2); //For negative number, >>> changes parity bit (MSB) to 0 
	}

}
