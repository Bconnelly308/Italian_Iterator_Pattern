import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTests {

	@Test
	void test() {

		DessertMenu dessertMenu = new DessertMenu();
		EntreeMenu entreeMenu = new EntreeMenu();
		AppetizerMenu appetizerMenu = new AppetizerMenu();
		
		WaitStaff waitStaff = new WaitStaff(appetizerMenu, entreeMenu, dessertMenu);
		
		assertTrue(waitStaff.appetizerMenu.equals(appetizerMenu));
		assertFalse(waitStaff.entreeMenu.equals(appetizerMenu));
		assertNotSame(appetizerMenu, entreeMenu);
		assertNotNull(appetizerMenu);
				
	}

}
