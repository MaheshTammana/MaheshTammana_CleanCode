package cleancode;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseRentTest {

	@Test
	public void testCalculate() {
		HouseRent h = new HouseRent();
		assertEquals(90000.0,h.Calculate("high standard materials",50),0);
	}

}

