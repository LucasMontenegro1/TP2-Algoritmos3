import org.junit.Test;

import Herramientas.*;
import Materiales.*;



public class MaterialesTest {
	
	@Test
	public void testMaderaSeGolpeaConUnHachaDeMaderaYDisminuyeLaDurabilidadDeLaMadera() {
		Madera madera = new Madera();
		Hacha hacha = new HachaDeMadera();
		int durabilidadMaterial = madera.getDurabilidad();
		int fuerzaHerramienta = hacha.getFuerza();

		hacha.usar(madera);
		assert madera.getDurabilidad() == (durabilidadMaterial - fuerzaHerramienta);

	} 

	
	@Test
	public void testPiedraSeGolpeaConUnHachaDePiedraYNoSeDisminuyeLaDurabilidadDeLaPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDePiedra();
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra);
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	@Test
	public void testPiedraSeGolpeaConUnHachaDeMaderaYNoSeDisminuyeLaDurabilidadDeLaPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDeMadera();
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra);
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	
	@Test
	public void testPiedraSeGolpeaConUnHachaDeMetalYNoSeDisminuyeLaDurabilidadDeLaPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDeMetal();
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra);
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	@Test
	public void testMetalSeGolpeaConUnPicoDeMaderaYDisminuyeLaDurabilidadDelMetal() {
		Metal metal = new Metal();
		Pico pico = new PicoDeMadera();
		
		int durabilidadMaterial = metal.getDurabilidad();
		
		pico.usar(metal);
		
		assert metal.getDurabilidad() == durabilidadMaterial;
	}
}

