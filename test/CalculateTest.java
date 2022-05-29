import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		System.out.println(actual);
	}
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		int actual = cal.subtract(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		System.out.println(actual);
	}
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		int actual = cal.multiple(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		System.out.println(actual);
	}
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		int actual = cal.divide(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		System.out.println(actual);
	}

}
