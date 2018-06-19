import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Program3Test {
	Program3 pp;
	@Before
	public void setup(){
	       System.out.println("JUnit Call: @Before setUp");
	       pp=new Program3();
	}
	

	@Test
	public void isVowelTest() {
		Program3 pp = new Program3();
		ArrayList<String> myListExpected=new ArrayList<String>();
		myListExpected.add("a is a vowel");
		myListExpected.add("b is a consonant");
		myListExpected.add("c is a consonant");
		ArrayList<String> actualValue = pp.isVowel("abc");
		assertEquals(myListExpected,actualValue);
	}

}
