import org.junit.Test;

public class JugadorTest {

	@Test
	public void testSeEmpiezaConHacha() {

		Jugador jugador = new Jugador();
		Pico hacha = new Pico(new Madera());
		
		assert jugador.getInventario().getElementosGuardados(0).getElementoGuardado().getClass() == hacha.getClass();	//HAY QUE CHEQUEAR QUE ES UN HACHA CON EL COMPORTAMIENTO
	}

}
