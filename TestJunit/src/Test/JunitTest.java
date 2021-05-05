package Test;

public class JunitTest {
  private String message; //its a variable
  //Constructor
  //@param message to be printed
  public JunitTest (String message) {
	  this.message=message;
  }
  //prints the message
  
  public String printMessage() {
	  System.out.println(message);
	  return message;
  }
}
