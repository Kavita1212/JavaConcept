package excpetionExample;

class BookNotFoundException extends Exception{
	
}
public class CustomException2 {
	public static void main(String args[]) throws BookNotFoundException {
		throw new BookNotFoundException();
	}

}
