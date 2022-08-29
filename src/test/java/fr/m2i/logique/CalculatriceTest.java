package fr.m2i.logique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatriceTest {

	@Test
	void addition()	{
		
		Integer x = 2;
		Integer y = 2;
		
		Integer resultatAttendu = 4;
		
		Integer resultatObtenu = Calculatrice.addition(x,y);
		
//		assertEquals(resultatAttendu ,resultatObtenu);
		assertThat(resultatObtenu).isEqualTo(resultatAttendu);
		
		//fail("addition non valide");
	}
	
	@Test
	void soustraction()	{

		Integer x = 2;
		Integer y = 2;

		Integer resultatAttendu = 0;

		Integer resultatObtenu = Calculatrice.soustraction(x,y);

		assertEquals(resultatAttendu ,resultatObtenu);

		//fail("soustraction non valide");
	}
	
	@Test
	void multiplication()	{
		
		Integer x = 8;
		Integer y = 2;
		
		Integer resultatAttendu = 16;
		
		Integer resultatObtenu = Calculatrice.multiplication(x,y);
		
		assertEquals(resultatAttendu ,resultatObtenu);
		
		//fail("multiplication non valide");
	}
	
	@Test
	void division()	{
		
		Integer x = 8;
		Integer y = 2;
		
		Integer resultatAttendu = 4;
		
		Integer resultatObtenu = Calculatrice.division(x,y);
		
		assertEquals(resultatAttendu ,resultatObtenu);
		
		//fail("division non valide");
	}

}
