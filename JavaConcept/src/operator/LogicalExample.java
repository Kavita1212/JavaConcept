package operator;

public class LogicalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10,b=5 ,c =20;
		
		System.out.println(a<b && a<c); //And:if first condition false: second condition not checked:false
		//"||" doesn't check the second condition if the first condition is true
		System.out.println(a<b || a<c); //OR :if first condition false: second condition  checked:true
	}

}
