import org.junit.Test;


public class MaterialesTests {
	
	@Test
	public void testHachaDeMaderaSeUsaContraMadera() {
		Madera madera = new Madera();
		Hacha hacha = new Hacha(madera);
		int durabilidadMaterial = madera.getDurabilidad();
		int fuerzaHerramienta = hacha.getFuerza();

		hacha.usar(madera);
		assert madera.getDurabilidad() == (durabilidadMaterial - fuerzaHerramienta);

	} 

	
	@Test
	public void PiedraSeGolpeaConUnHachaDePiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(piedra);
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra);
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	@Test
	public void PiedraSeGolpeaConUnHachaDeMadera() {
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(new Madera());
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra);
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	
	@Test
	public void PiedraSeGolpeaConUnHachaDeMetal() {
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(new Metal());
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra);
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	@Test
	public void MetalSeGolpeaConUnPicoDeMadera() {
		Metal metal = new Metal();
		Madera madera = new Madera();
		Pico pico = new Pico(madera);
		
		int durabilidadMaterial = metal.getDurabilidad();
		
		pico.usar(metal);
		
		assert metal.getDurabilidad() == durabilidadMaterial;
	}
}
