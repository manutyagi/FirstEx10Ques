

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Program6Test {
	Program6 pp ;
	@Before
	public void setup(){
	       System.out.println("JUnit Call: @Before setUp");
	       pp=new Program6();
	}
	@Test
	public void nonDecreasingOrderTest() {
		//Arrange
		String expectedValue = "6541";
		//Act
		String actualValue =pp.nonDecreasingOrder("4561");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}
	@Test
	public void revSumEvenTest() {
		//Arrange
		int expectedValue = 12;
		//Act
		int actualValue =pp.sumCalculator("14587");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}
	
	@Test
	public void sumgreater15() {
		//Arrange
		boolean expectedValue = true;
		//Act
		boolean actualValue =pp.greaterThan15("18587");
		//Assert
		assertEquals(expectedValue,actualValue);
		
	}

}
