package operator;

public class AssignmentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 4,b=20;
		a+=4;
		b-=4;
		System.out.println(a);
		System.out.println(b);
		
		short a1= 10;
		short b1 =20;
		a1+=b1; //work fine
		System.out.println(a1);
		
		//a1= a1+b1; //Compile time error because 10+10=20 now int  
		//System.out.println(a1);
				

	}

}
