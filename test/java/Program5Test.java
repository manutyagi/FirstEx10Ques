import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Program5Test {
	Program5 pp;
	@Before
	public void setup(){
	       System.out.println("JUnit Call: @Before setUp");
	       pp=new Program5();
	}
	
	@Test
	public void isCapital() {
		//Arrange
		String expectedValue = "A is a capital letter";
		//Act
		String actualValue =pp.upperLowerDigitChar("A");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}
		
	@Test
	public void isSmall() {
		//Arrange
		String expectedValue = "a is a small letter";
		//Act
		String actualValue =pp.upperLowerDigitChar("a");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}
	
	@Test
	public void isSpecial() {
		//Arrange
		String expectedValue = "! is a special symbol";
		//Act
		String actualValue =pp.upperLowerDigitChar("!");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void isDigit() {
		//Arrange
		String expectedValue = "2 is a digit";
		//Act
		String actualValue =pp.upperLowerDigitChar("2");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}
	
}
