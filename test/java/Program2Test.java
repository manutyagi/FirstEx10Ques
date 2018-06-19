import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Program2Test {
	Program2 pp;
	@Before
	public void setup(){
	       System.out.println("JUnit Call: @Before setUp");
	       pp=new Program2();
	}
	
	@Test
	public void isEvenTesttrue() {
		//Arrange
		Program2 pp=new Program2();
//		boolean expectedValue = true;
//		//Act
//		boolean actualValue =pp.isEven(24);
//		//Assert
//		assertEquals(expectedValue,actualValue);
		
		assertTrue(pp.isEven("24"));
	}
	
	@Test
	public void isEvenTestfalse() {
		//Arrange
		Program2 pp=new Program2();
//		boolean expectedValue = false;
//		//Act
//		boolean actualValue =pp.isEven(23);
//		//Assert
//		assertEquals(expectedValue,actualValue);
		assertFalse(pp.isEven("23"));
		
	}
	
	@Test
	public void isRangeChecktrue() {
		//Arrange
		Program2 pp=new Program2();
//		boolean expectedValue = true;
//		//Act
//		boolean actualValue =pp.rangeCheck(24);
//		//Assert
//		assertEquals(expectedValue,actualValue);
		assertTrue(pp.rangeCheck("24"));
		
	}
	
	@Test
	public void isRangeCheckfalse() {
		//Arrange
		Program2 pp=new Program2();
//		boolean expectedValue = false;
//		//Act
//		boolean actualValue =pp.rangeCheck(31);
//		//Assert
//		assertEquals(expectedValue,actualValue);
		assertFalse(pp.rangeCheck("19"));
	}
	
	@Test
	public void willPrintTom() {
		//Arrange
		Program2 pp=new Program2();
		String expectedValue = "Tom";
		//Act
		String actualValue =pp.printStatements("23");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}
	
	@Test
	public void willPrintJerry() {
		//Arrange
		Program2 pp=new Program2();
		String expectedValue = "Jerry";
		//Act
		String actualValue =pp.printStatements("24");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}
	
	@Test
	public void willPrintNothing() {
		//Arrange
		Program2 pp=new Program2();
		String expectedValue = "";
		//Act
		String actualValue =pp.printStatements("19");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}

	
	
}
