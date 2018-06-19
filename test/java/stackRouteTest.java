import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class stackRouteTest {
	stackRoute pp ;
	@Before
	public void setup(){
	       System.out.println("JUnit Call: @Before setUp");
	       pp=new stackRoute();
	}
	@Test
	public void testInvalidInput() {
		String expectedValue = "Invalid number";
		String actualValue =pp.func("stackroute","#");
		assertEquals(expectedValue,actualValue);
	}
	@Test
	public void testNRepeatNtimes() {
		String expectedValue = "stackrouterouterouterouterouteroute";
		String actualValue =pp.func("stackroute","5");
		assertEquals(expectedValue,actualValue);
	}
	@Test
	public void testEmptyString() {
		String expectedValue = "Empty String";
		String actualValue =pp.func("","5");
		assertEquals(expectedValue,actualValue);
	}
	@Test
	public void testOutOfBounds() {
		String expectedValue = "Index out of bounds";
		String actualValue =pp.func("stackroute","15");
		assertEquals(expectedValue,actualValue);
	}
	
}
