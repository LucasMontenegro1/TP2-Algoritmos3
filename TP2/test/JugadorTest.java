import org.junit.Test;

import Herramientas.Hacha;
import Jugador.Jugador;
import Materiales.Madera;


public class JugadorTest {

	@Test
	public void testSeEmpiezaConHacha() {

		Jugador jugador = new Jugador();
		Hacha hacha = new Hacha(new Madera());
		
		assert jugador.getInventario().getElementosGuardados()[0].getElementoGuardado().getClass() == hacha.getClass();	//HAY QUE CHEQUEAR QUE ES UN HACHA CON EL COMPORTAMIENTO
	}

}
