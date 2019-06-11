
import org.junit.Test;

import Herramientas.HachaDeMadera;
import Herramientas.Herramienta;


public class MesaDeCrafteoTest {

	@Test
	public void testSeCreaUnHachaDeMadera() {
		Herramienta hacha = new HachaDeMadera();


		assert hacha.getDurabilidad() == 100;
		assert hacha.getFuerza() == 2;		
	}
	
	
}
