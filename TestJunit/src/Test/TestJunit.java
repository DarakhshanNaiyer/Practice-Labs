package Test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	String message="Hello World!";
	
	JunitTest junittest= new JunitTest ("Hello World!");
//	(OR)	JunitTest junittest= new JunitTest (message);

	
	@Test
	public void testPrintMessage() {
		assertEquals(message, junittest.printMessage());
	}
}
