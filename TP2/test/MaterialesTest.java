import org.junit.Test;

import Herramientas.*;
import Jugador.Inventario;
import Materiales.*;



public class MaterialesTest {
	
	@Test
	public void testMaderaSeGolpeaConUnHachaDeMaderaYDisminuyeLaDurabilidadDeLaMadera() {
		Madera madera = new Madera();
		Hacha hacha = new HachaDeMadera();
		int durabilidadMaterial = madera.getDurabilidad();
		int fuerzaHerramienta = hacha.getFuerza();

		hacha.usar(madera, new Inventario());
		assert madera.getDurabilidad() == (durabilidadMaterial - fuerzaHerramienta);

	} 

	
	@Test
	public void testPiedraSeGolpeaConUnHachaDePiedraYNoSeDisminuyeLaDurabilidadDeLaPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDePiedra();
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	@Test
	public void testPiedraSeGolpeaConUnHachaDeMaderaYNoSeDisminuyeLaDurabilidadDeLaPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDeMadera();
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	
	@Test
	public void testPiedraSeGolpeaConUnHachaDeMetalYNoSeDisminuyeLaDurabilidadDeLaPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDeMetal();
		
		int durabilidadMaterial = piedra.getDurabilidad();
		
		hacha.usar(piedra, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadMaterial;		
	}
	
	
	@Test
	public void testMetalSeGolpeaConUnPicoDeMaderaYDisminuyeLaDurabilidadDelMetal() {
		Metal metal = new Metal();
		Pico pico = new PicoDeMadera();
		
		int durabilidadMaterial = metal.getDurabilidad();
		
		pico.usar(metal, new Inventario());
		
		assert metal.getDurabilidad() == durabilidadMaterial;
	}
	
	@Test 
	public void testMaterialMaderaSeUsaConHachaDeMadera() {
		Material material= new Madera();
		Hacha hacha= new HachaDeMadera();
		
		int durabilidadMaterial = material.getDurabilidad();
		int fuerzaHerramienta = hacha.getFuerza();
		
		hacha.usar(material, new Inventario());
		
		
		assert material.getDurabilidad() == (durabilidadMaterial - fuerzaHerramienta);
		
		
		
		
		
	}
	
	
	
	
}

