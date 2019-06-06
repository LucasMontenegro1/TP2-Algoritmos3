import org.junit.Test;

public class JugadorTest {

	@Test
	public void testSeEmpiezaConHacha() {

		Jugador jugador = new Jugador();
		Madera madera = new Madera();
		Herramienta hacha = new Hacha(madera);
		
		assert jugador.inventario.elementosGuardados[0].getClass() == hacha.getClass();
		
	}

}
