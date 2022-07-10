package operator;

public class RelationalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10,b=2;
		Integer i = 9;
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(i instanceof Integer);
		RelationalExample r = new RelationalExample();
		System.out.println(r instanceof Object);
		

	}

}
