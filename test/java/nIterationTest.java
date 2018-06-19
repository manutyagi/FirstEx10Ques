import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class nIterationTest {
	
	nIteration pp;
	@Before
	public void setup(){
	       System.out.println("JUnit Call: @Before setUp");
	       pp=new nIteration();
	}
	@Test
	public void iterationTest() {
		String expectedValue="122333444455555";
		String actualValue =pp.iteration("5");
		assertEquals(expectedValue,actualValue);
	}

}
