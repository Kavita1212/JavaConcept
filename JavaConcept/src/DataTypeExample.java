
public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive
		byte b = 10;
		int a =4;
		short c = 5;
		long d= 10;
		
		float f = 10.0f;
		double d1 = 20;
		
		char ch = 'k';
		
		//Non-primitive
		String str = "kavita";
		int arr[]= {1,2,3};
		int arr1[] = new int[3];
		arr1[0]=11;
		arr1[1]=33;
		arr1[2]= 44;
		
		
		
		System.out.println("byte==" +b);
		System.out.println("int==" +a);
		System.out.println("short==" +c);
		System.out.println("long==" +d);
		System.out.println("float==" +f);
		System.out.println("double==" +d1);
		System.out.println("str==" +String.valueOf(str));
		for (int i : arr) {
			System.out.println("arr==" +i);
			
		}
		
		
		
		
				

	}

}
