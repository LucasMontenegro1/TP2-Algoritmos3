

import org.junit.Test; 

import Herramientas.*;
import Materiales.*;

public class HachaTest {

	@Test
	public void testSeCreaUnHachaDeMadera() {
		Herramienta hacha = new HachaDeMadera();


		assert hacha.getDurabilidad() == 100;
		assert hacha.getFuerza() == 2;		
	}

	
	@Test
	public void testSeCreaHachaDeMetal() {

		Herramienta hacha = new HachaDeMetal();


		assert hacha.getDurabilidad() == 400;
		assert hacha.getFuerza() == 10;
	}

	@Test
	public void testHachaDeMaderaSeUsaContraMadera() {
		Madera madera = new Madera();
		Hacha hacha = new HachaDeMadera();
		int durabilidadHerramientaHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(madera);

		assert hacha.getDurabilidad() == (durabilidadHerramientaHerramienta - fuerza);

	}
	
	
	@Test
	public void testHachaDePiedraSeUsaContraMadera() {
		Madera madera = new Madera();
		Hacha hacha = new HachaDePiedra();
		int durabilidadHerramientaHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(madera);

		assert hacha.getDurabilidad() == (durabilidadHerramientaHerramienta - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraMadera() {
		Madera madera = new Madera();
		Hacha hacha = new HachaDeMetal();
		int durabilidadHerramientaHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(madera);

		assert hacha.getDurabilidad() == (durabilidadHerramientaHerramienta - fuerza/2);

	}

	@Test
	public void testHachaDeMaderaSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDeMadera();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDePiedraSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDePiedra();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDeMetal();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza/2);

	}

	@Test
	public void testHachaDeMaderaSeUsaContraMetal() {

		Metal metal = new Metal();
		Hacha hacha = new HachaDeMadera();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDePiedraSeUsaContraMetal() {
	
		Metal metal = new Metal();
		Hacha hacha = new HachaDePiedra();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraMetal() {
		Metal metal = new Metal();
		Hacha hacha = new HachaDeMetal();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza/2);

	}
	
	@Test
	public void testHachaDeMaderaSeUsaContraDiamante() {

		Diamante diamante = new Diamante();
		Hacha hacha = new HachaDeMadera();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(diamante);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}
	
	@Test
	public void testHachaDePiedraSeUsaContraDiamante() {
	
		Diamante diamante = new Diamante();
		Hacha hacha = new HachaDePiedra();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(diamante);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}
	
	@Test
	public void testHachaDeMetalSeUsaContraDiamante() {
		Diamante diamante = new Diamante();
		Hacha hacha = new HachaDeMetal();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(diamante);

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza/2);

	}
	

	
}
