import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeProgramTest {
	PalindroneProgram pp;
	@Before
	public void setup(){
	       System.out.println("JUnit Call: @Before setUp");
	       pp=new PalindroneProgram();
	}
	
	@Test
	public void isPalindrome() {
		//Arrange
		PalindroneProgram pp=new PalindroneProgram();
		String expectedInput = "The number is a palindrome";
		//Act
		String actualInput =pp.makeReverse(242);
		//Assert
		assertEquals(expectedInput,actualInput);
		
	}
	@Test
	public void isNotPalindrome() {
		//Arrange
		PalindroneProgram pp=new PalindroneProgram();
		String expectedInput = "Not a palindrome";
		//Act
		String actualInput =pp.makeReverse(2423
				);
		//Assert
		assertEquals(expectedInput,actualInput);
		
	}
	
	@Test
	public void sumGreater25() {
		//Arrange
		PalindroneProgram pp=new PalindroneProgram();
		String expectedInput = "Palindrome and sum >25";
		//Act
		String actualInput =pp.calculateSum(2468642);
		//Assert
		assertEquals(expectedInput,actualInput);
		
	}
	
	@Test
	public void sumLess25() {
		//Arrange
		PalindroneProgram pp=new PalindroneProgram();
		String expectedInput = "Palindrome and sum <25";
		//Act
		String actualInput =pp.calculateSum(242);
		//Assert
		assertEquals(expectedInput,actualInput);
		
	}
//	@Test
//	public  void checkSumOfEvenTest() {
//		//Arrange
//		PalindroneProgram pp=new PalindroneProgram();
//		int expectedSum=8;
//		//Act
//		int actualSum=pp.checkSumOfEven(242);
//		//Assert
//		assertEquals(expectedSum,actualSum);
//		
//	}

   /* 
	@Test
	public  void scannerInputTest(){
		//Arrange
		PalindroneProgram pp=new PalindroneProgram();
		int expectedInput=242;
		//Act
		int actualInput=pp.scannerInput();
		//Assert
		assertEquals(expectedInput,actualInput);
		
	}*/
//	@Test
//	public void palindromeSumGreater25() {
//		//Arrange
//		PalindroneProgram pp=new PalindroneProgram();
//		String expectedValue = "The number is a palindrome and sum of even digits is greater than 25 i.e.";
//		//Act
//		String actualValue =pp.whetherPalindrome(2468642);
//		//Assert
//		assertEquals(expectedValue,actualValue);
//		
//	}
//	@Test
//	public void palindromeSumLess25() {
//		//Arrange
//		PalindroneProgram pp=new PalindroneProgram();
//		String expectedInput = "The number is a palondrome and sum of even digits is less than 25 i.e. : ";
//		//Act
//		String actualInput =pp.whetherPalindrome(242);
//		//Assert
//		assertEquals(expectedInput,actualInput);
//		
//	}
		 
}
