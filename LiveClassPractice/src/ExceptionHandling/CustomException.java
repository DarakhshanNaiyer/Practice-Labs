package ExceptionHandling;

class AgeException extends Exception{
	
	private static final long serialversionID=1L;
	
	public AgeException() {
		super("You are not valid to vote!");
	}
	
	
	public AgeException(String message) {
		super(message);
	}
	
}

public class CustomException {
	static void validate (int age) throws AgeException{
		if(age<18){
			throw new AgeException(); // print value would be coming from default constructor super keyword.
		}
	else {
		System.out.println("You are valid to vote");
	}
	}
 public static void main(String[] args) {
	 
	 try{
		 validate (14); 
	 }catch(AgeException e) {
		 System.out.println(e.getMessage());
	 }
}
}
