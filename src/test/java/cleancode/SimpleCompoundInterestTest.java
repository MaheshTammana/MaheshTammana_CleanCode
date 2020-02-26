package cleancode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCompoundInterestTest {

	@Test
	public void test() {
		SimpleCompoundInterest s= new SimpleCompoundInterest();
		assertEquals(2.0,s.SCalculate(100,1,2.0),0);
		assertEquals(102.0,s.CCalculate(100,1,2.0),0);
	}

}
