import org.junit.Test;


public class MaterialesTests {
	
	@Test
	public void testMaderaSeGolpeaConUnHachaDeMaderaYDisminuyeLaDurabilidadDeLaMadera() {
		Madera madera = new Madera();
		Hacha hacha = new Hacha(madera);
		int durabilidadMaterial = madera.getDurabilidad();
		int fuerzaHerramienta = hacha.getFuerza();

		hacha.usar(madera);
		assert madera.getDurabilidad() == (durabilidadMaterial - fuerzaHerramienta);

	} 

	
	@Test
	public void testPiedraSeGolpeaConUnHachaDePiedraYNoSeDisminuyeLaDurabilidadDeLaPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(piedra);
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra);
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	@Test
	public void testPiedraSeGolpeaConUnHachaDeMaderaYNoSeDisminuyeLaDurabilidadDeLaPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(new Madera());
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra);
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	
	@Test
	public void testPiedraSeGolpeaConUnHachaDeMetalYNoSeDisminuyeLaDurabilidadDeLaPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(new Metal());
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra);
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	@Test
	public void testMetalSeGolpeaConUnPicoDeMaderaYDisminuyeLaDurabilidadDelMetal() {
		Metal metal = new Metal();
		Madera madera = new Madera();
		Pico pico = new Pico(madera);
		
		int durabilidadMaterial = metal.getDurabilidad();
		
		pico.usar(metal);
		
		assert metal.getDurabilidad() == durabilidadMaterial;
	}
}
