package excpetionExample;

import java.io.IOException;

class M1{  
	 void method()throws IOException{  
	  //System.out.println("device operation performed");
		 throw new IOException("device error");  
	 }  
	}  
	class Testthrows3{  
	   public static void main(String args[])throws IOException{//declare exception  
	     M1 m=new M1();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
}