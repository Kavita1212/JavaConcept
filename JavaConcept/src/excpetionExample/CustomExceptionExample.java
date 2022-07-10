package excpetionExample;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		super(s);
	}
}

public class CustomExceptionExample {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		throw new InvalidAgeException("Age less than 18");

	}
}