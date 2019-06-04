import org.junit.jupiter.api.Test;


public class MaterialesTests {
	
	@Test
	void testHachaDeMaderaSeUsaContraMadera() {
		Madera madera = new Madera();
		Hacha hacha = new Hacha(madera);
		int durabilidad = madera.getDurabilidad();
		int fuerzaHacha = hacha.getFuerza();

		hacha.usar(madera);
		assert madera.getDurabilidad()==(durabilidad-fuerzaHacha);

	}

}
