import org.junit.Test;

import Herramientas.Hacha;
import Herramientas.Herramienta;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;


public class HachaTest {

	@Test
	public void testSeCreaUnHachaDeMadera() {
		Madera madera = new Madera();
		Herramienta hacha = new Hacha(madera);


		assert hacha.getDurabilidad() == 100;
		assert hacha.getFuerza() == 2;		
	}

	
	@Test
	public void testSeCreaHachaDeMetal() {
		Metal metal = new Metal();
		Herramienta hacha = new Hacha(metal);


		assert hacha.getDurabilidad() == 400;
		assert hacha.getFuerza() == 10;
	}

	@Test
	public void testHachaDeMaderaSeUsaContraMadera() {
		Madera madera = new Madera();
		Hacha hacha = new Hacha(madera);
		int durabilidadHerramientaHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(madera);

		assert hacha.getDurabilidad() == (durabilidadHerramientaHerramienta - fuerza);

	}
	
	
	@Test
	public void testHachaDePiedraSeUsaContraMadera() {
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(piedra);
		int durabilidadHerramientaHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(madera);

		assert hacha.getDurabilidad() == (durabilidadHerramientaHerramienta - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraMadera() {
		Madera madera = new Madera();
		Metal metal = new Metal();
		Hacha hacha = new Hacha(metal);
		int durabilidadHerramientaHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(madera);

		assert hacha.getDurabilidad() == (durabilidadHerramientaHerramienta - fuerza/2);

	}

	@Test
	public void testHachaDeMaderaSeUsaContraPiedra() {
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(madera);
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDePiedraSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(piedra);
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Hacha hacha = new Hacha(metal);
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza/2);

	}

	@Test
	public void testHachaDeMaderaSeUsaContraMetal() {
		Madera madera = new Madera();
		Metal metal = new Metal();
		Hacha hacha = new Hacha(madera);
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDePiedraSeUsaContraMetal() {
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Hacha hacha = new Hacha(piedra);
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraMetal() {
		Metal metal = new Metal();
		Hacha hacha = new Hacha(metal);
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza/2);

	}
	
	@Test
	public void testHachaDeMaderaSeUsaContraDiamante() {
		Madera madera = new Madera();
		Diamante diamante = new Diamante();
		Hacha hacha = new Hacha(madera);
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(diamante);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}
	
	@Test
	public void testHachaDePiedraSeUsaContraDiamante() {
		Piedra piedra = new Piedra();
		Diamante diamante = new Diamante();
		Hacha hacha = new Hacha(piedra);
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(diamante);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}
	
	@Test
	public void testHachaDeMetalSeUsaContraDiamante() {
		Metal metal = new Metal();
		Diamante diamante = new Diamante();
		Hacha hacha = new Hacha(metal);
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(diamante);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza/2);

	}
	

	
}
