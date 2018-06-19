

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Program4Test {
	Program4 pp ;
	@Before
	public void setup(){
	       System.out.println("JUnit Call: @Before setUp");
	       pp=new Program4();
	}
	@Test
	public void isValidInput() {
		//Arrange
		Program4 pp=new Program4();
		String expectedValue = "29";
		//Act
		String actualValue =pp.stringInput("22 3 4");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}
	@Test
	public void isInvalidInput() {
		//Arrange
		Program4 pp=new Program4();
		String expectedValue = "Invalid input";
		//Act
		String actualValue =pp.stringInput("22 a 4");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}
	

}
