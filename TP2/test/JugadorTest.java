import org.junit.Test;

public class JugadorTest {

	@Test
	public void testSeEmpiezaConHacha() {

		Jugador jugador = new Jugador();
		Madera madera = new Madera();
		Paquete paquete = new Paquete();
		
		assert jugador.inventario.elementosGuardados[0].getClass() == paquete.getClass();	
	}

}
