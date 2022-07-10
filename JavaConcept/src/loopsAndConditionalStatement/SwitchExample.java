package loopsAndConditionalStatement;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =20;
		
		switch (a) {
		case 1:
			System.out.println(1);
			break;
        case 11:
        	System.out.println(11);
			break;
        case 20:
        	System.out.println(20);
			//break; //optional -- if break statement is not found it will execute the next case
        case 21:
        	System.out.println(21);
			break;
			

		
		  default: //optional
			  break;
		 
		}

	}

}
