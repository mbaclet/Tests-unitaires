package fr.m2i.logique;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(LoggingExtension.class)
public class HelloWorldTest {

	private HelloWorld hw;
	private Logger logger;

	public void setLogger(Logger logger){
		this.logger = logger;
	}

	@BeforeEach
	public void init(){
		this.hw = new HelloWorld();
	}

	@AfterEach
	public void clean(){
		this.hw = null;
	}

	@Test
	void sayHelloTest( ) {

		logger.info("Merci Olivier, ça marche enfin");


		//Organiser
		String resultatAttendu = "Hello world";
		hw = new HelloWorld();

		
		//Agir
		String resultatObtenu = hw.sayHello();
		
		//Vérifier
		assertEquals(resultatAttendu ,resultatObtenu);

		logger.info("Le test s'est bien passé");
		
		//fail("non fonctionnel");
	}
}