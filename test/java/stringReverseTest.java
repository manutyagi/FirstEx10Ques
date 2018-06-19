import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class stringReverseTest {
	stringReverse pp;
	@Before
	public void setup(){
	       System.out.println("JUnit Call: @Before setUp");
	       pp=new stringReverse();
	}
	@Test
	public void stringReverseTest() {
		String expectedValue = "cba";
		//Act
		String actualValue =pp.reverseString("abc");
		//Assert
		assertEquals(expectedValue,actualValue);
	}

}
