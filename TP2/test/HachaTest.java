

import org.junit.Test;

import Modelo.Herramientas.Hacha;
import Modelo.Herramientas.HachaDeMadera;
import Modelo.Herramientas.HachaDeMetal;
import Modelo.Herramientas.HachaDePiedra;
import Modelo.Herramientas.Herramienta;
import Modelo.Jugador.Inventario;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.Posicion;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Piedra;

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

		hacha.usar(madera, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramientaHerramienta - fuerza);

	}
	
	@Test
	public void testHachaDePiedraSeUsaContraMadera() {
		Madera madera = new Madera();
		Hacha hacha = new HachaDePiedra();
		int durabilidadHerramientaHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(madera, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramientaHerramienta - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraMadera() {
		Madera madera = new Madera(new Mapa(), new Posicion(0,0));
		Hacha hacha = new HachaDeMetal();
		int durabilidadHerramientaHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(madera, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramientaHerramienta - fuerza/2);

	}

	@Test
	public void testHachaDeMaderaSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDeMadera();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDePiedraSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDePiedra();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new HachaDeMetal();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza/2);

	}

	@Test
	public void testHachaDeMaderaSeUsaContraMetal() {

		Metal metal = new Metal();
		Hacha hacha = new HachaDeMadera();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDePiedraSeUsaContraMetal() {
	
		Metal metal = new Metal();
		Hacha hacha = new HachaDePiedra();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraMetal() {
		Metal metal = new Metal();
		Hacha hacha = new HachaDeMetal();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza/2);

	}
	
	@Test
	public void testHachaDeMaderaSeUsaContraDiamante() {

		Diamante diamante = new Diamante();
		Hacha hacha = new HachaDeMadera();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(diamante, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}
	
	@Test
	public void testHachaDePiedraSeUsaContraDiamante() {
	
		Diamante diamante = new Diamante();
		Hacha hacha = new HachaDePiedra();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(diamante, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}
	
	@Test
	public void testHachaDeMetalSeUsaContraDiamante() {
		Diamante diamante = new Diamante();
		Hacha hacha = new HachaDeMetal();
		int durabilidadHerramienta = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(diamante, new Inventario());

		assert hacha.getDurabilidad() == (durabilidadHerramienta - fuerza/2);

	}
	

	
}
