package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IngredientTest {

	@Test
	void test() {
		boolean exceptionIsThorwn = false;
		try {
			int alfa = Integer.parseInt("Alfa");
		}catch(NumberFormatException ex) {
			exceptionIsThorwn = true;
			ex.printStackTrace();
		}
		assertTrue(exceptionIsThorwn);
		
		//Forma pro max ultimate
		assertThrows(NumberFormatException.class, ()->{
			int alfa = Integer.parseInt("Alfa");
		});
		
	}
	
	@Test
	void notNegativeNumbersTest() {
		
	}

}
