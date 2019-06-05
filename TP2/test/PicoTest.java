import static org.junit.Assert.*;

import org.junit.Test;

public class PicoTest {

	@Test
	public void testSeCreaPicoDeMadera() {
		Madera madera = new Madera();
		Herramienta pico = new Pico(madera);


		assert pico.getDurabilidad() == 100;
		assert pico.getFuerza() == 2;
	}

	

	@Test
	public void testSeCreaPicoDeMetal() {
		Metal metal = new Metal();
		Herramienta pico = new Pico(metal);


		assert pico.getDurabilidad() == 400;
		assert pico.getFuerza() == 12;
	}


	@Test
	public void testSeCreaPicoFino() {
		Herramienta picoFino = new PicoFino();

		assert picoFino.getDurabilidad() == 1000;
		assert picoFino.getFuerza() == 20;

		
	}
	

	@Test
	public void testPicoDeMaderaSeUsaContraMadera() {
		Madera madera = new Madera();
		Pico pico = new Pico(madera);
		int durabilidadHerramienta = pico.getDurabilidad();
		int fuerza = pico.getFuerza();

		pico.usar(madera);

		assert pico.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testPicoDePiedraSeUsaContraMadera() {
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Pico pico = new Pico(piedra);
		int durabilidadHerramienta = pico.getDurabilidad();
		int fuerza = pico.getFuerza();

		pico.usar(madera);

		assert pico.getDurabilidad() == (int)(durabilidadHerramienta - fuerza/1.5);

	}

	@Test
	public void testPicoDeMetalSeUsaContraMaderaYSeRompeAlDecimoUso() {
		Madera madera = new Madera();
		Metal metal = new Metal();
		Pico pico = new Pico(metal);
		int durabilidadHerramienta = pico.getDurabilidad();
	

		for (int i = 0; i < 9; i++) {
			pico.usar(madera);
		}

		assert pico.getDurabilidad() == durabilidadHerramienta;
		pico.usar(madera);
		assert pico.getDurabilidad() == 0;

	}

	@Test
	public void testPicoDeMaderaSeUsaContraPiedra() {
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Pico pico = new Pico(madera);
		int durabilidadHerramienta = pico.getDurabilidad();
		int fuerza = pico.getFuerza();

		pico.usar(piedra);

		assert pico.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testPicoDePiedraSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Pico pico = new Pico(piedra);
		int durabilidadHerramienta = pico.getDurabilidad();
		int fuerza = pico.getFuerza();

		pico.usar(piedra);

		assert pico.getDurabilidad() == (int)(durabilidadHerramienta - fuerza/1.5);

	}

	@Test
	public void testPicoDeMetalSeUsaContraPiedraYSeRompeAlDecimoUso() {
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Pico pico = new Pico(metal);
		int durabilidadHerramienta = pico.getDurabilidad();
		

		for (int i = 0; i < 9; i++) {
			pico.usar(piedra);
		}

		assert pico.getDurabilidad() == durabilidadHerramienta;
		pico.usar(piedra);
		assert pico.getDurabilidad() == 0;

	}

	@Test
	public void testPicoDeMaderaSeUsaContraMetal() {
		Madera madera = new Madera();
		Metal metal = new Metal();
		Pico pico = new Pico(madera);
		int durabilidadHerramienta = pico.getDurabilidad();
		int fuerza = pico.getFuerza();
		pico.usar(metal);

		assert pico.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}

	@Test
	public void testPicoDePiedraSeUsaContraMetal() {
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Pico pico = new Pico(piedra);
		int durabilidadHerramienta = pico.getDurabilidad();
		int fuerza = pico.getFuerza();

		pico.usar(metal);		

		assert pico.getDurabilidad() == (int)(durabilidadHerramienta - fuerza/1.5);

	}

	@Test
	public void testPicoDeMetalSeUsaContraMetalYSeRompeAlDecimoUso() {
		Metal metal = new Metal();
		Pico pico = new Pico(metal);
		int durabilidadHerramienta = pico.getDurabilidad();
		

		for (int i = 0; i < 9; i++) {
			pico.usar(metal);
		}

		assert pico.getDurabilidad() == durabilidadHerramienta;
		pico.usar(metal);
		assert pico.getDurabilidad() == 0;

	}
	
	@Test
	public void testPicoDeMaderaSeUsaContraDiamante() {
		Madera madera = new Madera();
		Diamante diamante = new Diamante();
		Pico pico = new Pico(madera);
		int durabilidadHerramienta = pico.getDurabilidad();
		int fuerza = pico.getFuerza();
		pico.usar(diamante);

		assert pico.getDurabilidad() == (durabilidadHerramienta - fuerza);

	}
	
	@Test
	public void testPicoDePiedraSeUsaContraDiamante() {
		Piedra piedra = new Piedra();
		Diamante diamante = new Diamante();
		Pico pico = new Pico(piedra);
		int durabilidadHerramienta = pico.getDurabilidad();
		int fuerza = pico.getFuerza();

		pico.usar(diamante);		

		assert pico.getDurabilidad() == (int)(durabilidadHerramienta - fuerza/1.5);

	}
	
	@Test
	public void testPicoDeMetalSeUsaContraDiamanteYSeRompeAlDecimoUso() {
		Metal metal = new Metal();
		Diamante diamante = new Diamante();
		Pico pico = new Pico(metal);
		int durabilidadHerramienta = pico.getDurabilidad();
		

		for (int i = 0; i < 9; i++) {
			pico.usar(diamante);
		}

		assert pico.getDurabilidad() == durabilidadHerramienta;
		pico.usar(diamante);
		assert pico.getDurabilidad() == 0;

	}
	
    //TESTS DE PICO FINO
	

	@Test
	public void testPicoFinoSeUsaContraDiamante(){
		Diamante diamante = new Diamante();
		PicoFino picoFino = new PicoFino();
		int durabilidadHerramienta = picoFino.getDurabilidad();
		
		picoFino.usar(diamante);
		
		assert picoFino.getDurabilidad() == (durabilidadHerramienta - durabilidadHerramienta * 0.1);
	}
	
	@Test
	public void testPicoFinoSeUsaContraMadera(){
		Madera madera = new Madera();
		PicoFino picoFino = new PicoFino();
		int durabilidadHerramienta = picoFino.getDurabilidad();
		
		picoFino.usar(madera);
		
		assert picoFino.getDurabilidad() == durabilidadHerramienta;
		
	}
	
	@Test
	public void testPicoFinoSeUsaContraMetal(){
		Metal metal = new Metal();
		PicoFino picoFino = new PicoFino();
		int durabilidadHerramienta = picoFino.getDurabilidad();
		
		picoFino.usar(metal);		
		
		assert picoFino.getDurabilidad() == durabilidadHerramienta;
		
	}
	
	@Test
	public void testPicoFinoSeUsaContraPiedra(){
		Piedra piedra = new Piedra();
		PicoFino picoFino = new PicoFino();
		int durabilidadHerramienta = picoFino.getDurabilidad();
		
		picoFino.usar(piedra);
		
		assert picoFino.getDurabilidad() == durabilidadHerramienta;

	}


}
