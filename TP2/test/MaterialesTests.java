import org.junit.Test;


public class MaterialesTests {
	
	@Test
	void testHachaDeMaderaSeUsaContraMadera() {
		Madera madera = new Madera();
		Hacha hacha = new Hacha(madera);
		int durabilidad = madera.getDurabilidad();
		int fuerzaHacha = hacha.getFuerza();

		hacha.usar(madera);
		assert madera.getDurabilidad() == (durabilidad-fuerzaHacha);

	} 

	
	@Test
	void PiedraSeGolpeaConUnHacha() {
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(piedra);
		
		int durabilidad = piedra.getDurabilidad();
		
		hacha.usar(piedra);
		
		assert piedra.getDurabilidad() == durabilidad;		
	}
	
	@Test
	void MetalSeGolpeaConUnPicoDeMadera() {
		Metal metal = new Metal();
		Madera madera = new Madera();
		Pico pico = new Pico(madera);
		
		int durabilidad = metal.getDurabilidad();
		
		pico.usar(metal);
		
		assert metal.getDurabilidad() == durabilidad;
	}
}
