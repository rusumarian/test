package laborator4testare;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Inainte de testare");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Dupa testare");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		// eroare CalcApp app=new CalcApp(10);
	}

}
