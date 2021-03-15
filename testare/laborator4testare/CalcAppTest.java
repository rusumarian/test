package laborator4testare;

import static org.junit.Assert.*;
import laborator4.CalcApp;

import org.junit.Test;

public class CalcAppTest {


	@Test
	public void testToSquare() {
		//fail("Not yet implemented");
		CalcApp app = new CalcApp();
		assertEquals(app.toSquare(10), 100);
		assertNotEquals(10, app.toSquare(3));
	
	}

	@Test
	public void testToSum() {
		//fail("Not yet implemented");
	
		CalcApp app = new CalcApp();
	
		assertNotNull(app);
		
		assertEquals(app.toSum(10,-9), 1);
		assertNotEquals(0, app.toSum(3,-4));
		
	}

}
