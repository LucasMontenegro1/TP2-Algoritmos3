import org.junit.Test;

public class JugadorTest {

	@Test
	public void testSeEmpiezaConHacha() {

		Jugador jugador = new Jugador();
		Madera madera = new Madera();
		Paquete paquete = new Paquete();
		
		assert jugador.getInventario().getElementosGuardados()[0].getElementoGuardado().getClass() == paquete.getClass();	
	}

}
